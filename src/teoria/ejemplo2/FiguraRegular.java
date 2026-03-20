package teoria.ejemplo2;

public abstract class FiguraRegular {
    private final int numeroLados;
    private double longitudLado;

    public FiguraRegular(int numeroLados, double longitudLado) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    protected double calcularPerimetro() {
        return numeroLados * longitudLado;
    }
    protected abstract double calcularArea();


    @Override
    public String toString() {
        return String.format("nº lados %d, longitud lado %.2f, perímetro %.2f",
                numeroLados, longitudLado, calcularPerimetro());
    }
}
