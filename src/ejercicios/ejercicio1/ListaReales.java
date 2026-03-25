package ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.List;

public class ListaReales implements Estadisticas{
    private List<Double> valores;

    public ListaReales(List<Double> valores) {
        this.valores = valores;
    }

    public List<Double> getValores() {
        return valores;
    }
    @Override
    public int obtenerNumeroValores() {
        return valores.size();
    }

    @Override
    public double obtenerValorMinimo() {
        return valores.stream().
                mapToDouble(Double::doubleValue).
                min().orElse(Double.NaN);
    }

    @Override
    public double obtenerValorMaximo() {
        return valores.stream().
                mapToDouble(Double::doubleValue).
                max().orElse(Double.NaN);
    }

    @Override
    public double calcularSuma() {
        return valores.stream().
                mapToDouble(Double::doubleValue).
                sum();
    }

    @Override
    public double calcularValorMedio() {
        return valores.stream().
                mapToDouble(Double::doubleValue).
                average().orElse(Double.NaN);
    }

    @Override
    public double calcularDesviacionTipica() {
        double contador = 0;
        double valorMedio = calcularValorMedio();
        for (double numero : valores) {
            contador += Math.pow(numero - valorMedio, 2);
        }
        return Math.sqrt(contador / valores.size());
    }
}
