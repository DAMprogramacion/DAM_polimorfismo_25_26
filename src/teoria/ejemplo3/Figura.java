package teoria.ejemplo3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public interface Figura {
    double calcularArea();
    double calcularPerimetro();
    default void mostrarInfo() {
        System.out.println(this.toString());
    }
    static Optional<Figura> obtenerFiguraMayorArea(List<Figura> figuras) {
        return figuras.stream().
                max(Comparator.comparing(Figura::calcularArea));
    }
    static double obtenerSumaPerimetros(List<Figura> figuras) {
        return figuras.stream().
                    mapToDouble(Figura::calcularPerimetro).
                    sum();
    }
}
