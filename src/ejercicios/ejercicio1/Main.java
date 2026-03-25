package ejercicios.ejercicio1;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] valores = {1,1,1,1,1};
        Estadisticas array = new ArrayReales(valores);
        System.out.printf("Nº valores %d%n", array.obtenerNumeroValores());
        System.out.printf("Valor máximo %.1f%n", array.obtenerValorMaximo());
        System.out.printf("Valor mínimo %.1f%n", array.obtenerValorMinimo());
        System.out.printf("Suma valores %.1f%n", array.calcularSuma());
        System.out.printf("Valor medio %.1f%n", array.calcularValorMedio());
        System.out.printf("Desviación típica %.1f%n", array.calcularDesviacionTipica());
        System.out.println("=============================");
        valores = new Random().doubles(0,350).limit(10).toArray();;
        Estadisticas arrayRandom = new ArrayReales(valores);
        System.out.printf("Nº valores %d%n", arrayRandom.obtenerNumeroValores());
        System.out.printf("Valor máximo %.1f%n", arrayRandom.obtenerValorMaximo());
        System.out.printf("Valor mínimo %.1f%n", arrayRandom.obtenerValorMinimo());
        System.out.printf("Suma valores %.1f%n", arrayRandom.calcularSuma());
        System.out.printf("Valor medio %.1f%n", arrayRandom.calcularValorMedio());
        System.out.printf("Desviación típica %.1f%n", arrayRandom.calcularDesviacionTipica());
        System.out.println("============================");
        List<Double> numeros = List.of(1.0, 2.0, 3.0, 4.0);
        Estadisticas lista = new ListaReales(numeros);
        System.out.printf("Nº valores %d%n", lista.obtenerNumeroValores());
        System.out.printf("Valor máximo %.1f%n", lista.obtenerValorMaximo());
        System.out.printf("Valor mínimo %.1f%n", lista.obtenerValorMinimo());
        System.out.printf("Suma valores %.1f%n", lista.calcularSuma());
        System.out.printf("Valor medio %.1f%n", lista.calcularValorMedio());
        System.out.printf("Desviación típica %.1f%n", lista.calcularDesviacionTipica());
        System.out.println("============usando info()================");
        System.out.println(array.info());
        System.out.println(arrayRandom.info());
        System.out.println(lista.info());
    }
}
