package ejercicios.ejercicio1;

public interface Estadisticas {
    int obtenerNumeroValores(); //número de elementos de una colección
    double obtenerValorMinimo(); //valor mı́nimo de una colección
    double obtenerValorMaximo(); //valor máximo de una colección
    double calcularSuma(); //suma de los valores de una colección
    double calcularValorMedio(); //valor medio de de una colección
    double calcularDesviacionTipica(); //desviación tı́pica de de una colección.

    default String info() {
        return String.format("Nº valores %d%nValor máximo %.1f%nValor mínimo %.1f%nSuma valores %.1f%nValor medio %.1f%nDesviación típica %.1f",
                obtenerNumeroValores(), obtenerValorMaximo(), obtenerValorMinimo(),
                calcularSuma(), calcularValorMedio(), calcularDesviacionTipica());
    }
 }
