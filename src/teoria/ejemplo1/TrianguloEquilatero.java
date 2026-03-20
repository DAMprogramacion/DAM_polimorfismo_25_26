package teoria.ejemplo1;

public class TrianguloEquilatero extends FiguraRegular {

    public TrianguloEquilatero(double longitudLado) {
        super(3, longitudLado);
    }
    public double calcularArea() {
        return Math.sqrt(3) / 4  * Math.pow(getLongitudLado(), 2) ;
    }
    @Override
    public String toString() {
        return String.format("Triágulo equilatero: %s y área %.2f",
                super.toString(), calcularArea());
    }
}
