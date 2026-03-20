package teoria.ejemplo1;

public class Cuadrado extends FiguraRegular{
    public Cuadrado(double longitudLado) {
        super(4, longitudLado);
    }
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }

    @Override
    public String toString() {
        return String.format("Cuadrado: %s y área %.2f",  super.toString(), calcularArea());
    }
}
