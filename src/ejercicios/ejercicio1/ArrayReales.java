package ejercicios.ejercicio1;

import java.util.Arrays;

public class ArrayReales implements Estadisticas{
    private double[] valores;

    public ArrayReales(double[] valores) {
        this.valores = valores;
    }

    public double[] getValores() {
        return valores;
    }

    @Override
    public int obtenerNumeroValores() {
        return valores.length;
    }

    @Override
    public double obtenerValorMinimo() {
        return Arrays.stream(valores).
                        min().orElse(Double.NaN);
    }

    @Override
    public double obtenerValorMaximo() {
        return Arrays.stream(valores).
                    max().orElse(Double.NaN);
    }

    @Override
    public double calcularSuma() {
        return Arrays.stream(valores).
                        sum();
    }

    @Override
    public double calcularValorMedio() {
        return Arrays.stream(valores).
               average().orElse(Double.NaN);
    }

    @Override
    public double calcularDesviacionTipica() {
        double contador = 0;
        double valorMedio = calcularValorMedio();
        for (double numero : valores) {
            contador += Math.pow(numero - valorMedio, 2);
        }
        return Math.sqrt(contador / valores.length);
    }
}
