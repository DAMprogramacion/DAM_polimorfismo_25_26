package teoria.ejemplo3;

public class FiguraRegular {
    private final TipoFigura tipoFigura;
    private double longitudLado;

    public FiguraRegular(TipoFigura tipoFigura, double longitudLado) {
        this.tipoFigura = tipoFigura;
        this.longitudLado = longitudLado;
    }

    public TipoFigura getTipoFigura() {
        return tipoFigura;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularPerimetro () {
        return tipoFigura.getNumeroLados() * longitudLado;
    }
    public double calcularArea() {
        switch (tipoFigura) {
            case TRIANGULO_EQUILATERO -> {
                return Math.sqrt(3) / 4 * Math.pow(longitudLado, 2);
            }
            case CUADRADO -> {
                return longitudLado * longitudLado;
            }
            case PENTAGONO_REGULAR -> {
                return 1.7205 * Math.pow(longitudLado, 2);
            }
            case HEXAGONO -> {
                return 3 * Math.sqrt(3) / 2 * Math.pow(longitudLado, 2);
            }
            default -> {
                return 0;
            }
        }
    }
    @Override
    public String toString() {
        return String.format("%s,%d,%.2f,%.2f", tipoFigura, tipoFigura.getNumeroLados(),
                calcularPerimetro(), calcularArea());
    }
}
