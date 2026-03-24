package teoria.ejemplo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        Figura cuadrado = new FiguraRegular(TipoFigura.CUADRADO, 3);
        figuras.add(cuadrado);
        Figura trianguloEquilatero = new FiguraRegular(TipoFigura.TRIANGULO_EQUILATERO, 3);
        figuras.add(trianguloEquilatero);
        Figura  rectangulo = new Rectangulo(3, 2);
        figuras.add(rectangulo);
        Figura ciruclo = new Circulo(3);
        figuras.add(ciruclo);
        figuras.forEach(Figura::mostrarInfo);
        Optional<Figura> figuraMayorArea = Figura.obtenerFiguraMayorArea(figuras);
        System.out.println("Figura de mayor área");
        if (figuraMayorArea.isPresent())
            System.out.println(figuraMayorArea.get());
        double sumaPerimetros = Figura.obtenerSumaPerimetros(figuras);
        System.out.printf("La suma de perímetros vale: %.2f%n", sumaPerimetros);

    }
}
