package teoria.ejemplo2;

public class Cuadrado extends FiguraRegular{
    public Cuadrado(double longitudLado) {
        super(4, longitudLado);
    }

    @Override
    protected double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
