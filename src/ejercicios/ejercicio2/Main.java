package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Banco cc = Banco.crearCuentaCorriente(100);
        cc.ejecutarTransacion(TipoTransaccion.RETIRADA, 60);
        cc.ejecutarTransacion(TipoTransaccion.RETIRADA, 60);
        cc.ejecutarTransacion(TipoTransaccion.INGRESO, 60);

    }
}
