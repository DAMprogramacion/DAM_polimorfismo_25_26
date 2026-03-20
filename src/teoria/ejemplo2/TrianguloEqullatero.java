package teoria.ejemplo2;

public class TrianguloEqullatero extends FiguraRegular{
    public TrianguloEqullatero(double longitudLado) {
        super(3, longitudLado);
    }

    @Override
    protected double calcularArea() {
        return Math.sqrt(3) / 4  * Math.pow(getLongitudLado(), 2) ;
    }
}
