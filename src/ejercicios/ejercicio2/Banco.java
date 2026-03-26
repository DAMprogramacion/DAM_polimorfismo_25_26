package ejercicios.ejercicio2;

public interface Banco {

    double obtenerSaldo();
    void ingresarDinero(double cantidad);
    void sacarDinero(double cantidad);

    private boolean puedeRetirarDinero (double cantidad) {
        return obtenerSaldo() - cantidad >= 0;
    }

    private void mostrarInformacionOperacion(TipoTransaccion tipoTransaccion, double cantidad) {
        StringBuilder builder = new StringBuilder();
        builder.append("Transación: ").append(tipoTransaccion).append('\n');
        builder.append("Cantidad: ").append(cantidad).append("€\n");
        builder.append("Saldo: ").append(obtenerSaldo()).append('€');
        System.out.println(builder.toString());
    }

    default void ejecutarTransacion (TipoTransaccion tipoTransaccion, double cantidad){
        if (tipoTransaccion == TipoTransaccion.INGRESO){
            ingresarDinero(cantidad);
            mostrarInformacionOperacion(tipoTransaccion, cantidad);
        } else if (tipoTransaccion == TipoTransaccion.RETIRADA) {
            if (puedeRetirarDinero(cantidad)) {
                sacarDinero(cantidad);
                mostrarInformacionOperacion(tipoTransaccion, cantidad);
            } else {
                System.out.println("Sobrepasamos el saldo");
            }
        }
    }

    static Banco crearCuentaCorriente (double cantidad) {
        return new CuentaCorriente(cantidad);
    }




}
