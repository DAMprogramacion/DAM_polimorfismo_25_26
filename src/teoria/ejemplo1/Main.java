package teoria.ejemplo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        FiguraRegular cuadrado1 = new Cuadrado(3);
        FiguraRegular cuadrado2 = new Cuadrado(3.3);
        FiguraRegular trEquila1 = new TrianguloEquilatero(3.3);
        FiguraRegular trEquila2 = new TrianguloEquilatero(1);
        List<FiguraRegular> figuraRegulares = new ArrayList<>();
        figuraRegulares.add(cuadrado1); figuraRegulares.add(trEquila1);
        figuraRegulares.add(cuadrado2); figuraRegulares.add(trEquila2);
        mostrarDatosFigurasRegualres(figuraRegulares);
        System.out.println("======figura de mayor perímetro======");
        Optional<FiguraRegular> figuraRegularMayorPerimetro =
                getfRegMayorPerimetro(figuraRegulares);
        if (figuraRegularMayorPerimetro.isPresent())
            System.out.println(figuraRegularMayorPerimetro.get());
        System.out.println("======mostrar areas======");
        mostrarAreasFiguras(figuraRegulares);
        FiguraRegular figuraRegular = new FiguraRegular(12, 2);
    }

    private static void mostrarAreasFiguras(List<FiguraRegular> figuraRegulares) {
        for (FiguraRegular figuraRegular : figuraRegulares)
            if (figuraRegular instanceof Cuadrado){
                Cuadrado cuadrado = (Cuadrado) figuraRegular;
                System.out.printf("Cuadrado, aŕea: %.2f%n", cuadrado.calcularArea());
            } else {
                TrianguloEquilatero trianguloEquilatero = (TrianguloEquilatero) figuraRegular;
                System.out.printf("Triángulo equilatero, aŕea: %.2f%n", trianguloEquilatero.calcularArea());
            }
    }


    private static Optional<FiguraRegular> getfRegMayorPerimetro(List<FiguraRegular> figuraRegulares) {
        return figuraRegulares.stream().
                sorted(Comparator.comparing(FiguraRegular::calcularPerimetro).reversed()).
                findFirst();
    }

    private static void mostrarDatosFigurasRegualres(List<FiguraRegular> figuraRegulares) {
        figuraRegulares.forEach(System.out::println);
    }
}
