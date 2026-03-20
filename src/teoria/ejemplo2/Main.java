package teoria.ejemplo2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FiguraRegular c1 = new Cuadrado(23);
        FiguraRegular c2 = new Cuadrado(11.1);
        FiguraRegular t1 = new TrianguloEqullatero(11.1);
        FiguraRegular t2 = new TrianguloEqullatero(12.1);
        List<FiguraRegular> figuraRegulares = List.of(c1, c2, t1, t2);
        double areaTotal = calcularAreaTotal(figuraRegulares);
        System.out.printf("La suma de todas las áreas vale: %.2f%n", areaTotal );
        //FiguraRegular figuraRegular = new FiguraRegular(12, 7);
        // NO SE PUEDEN INSTANCIAR(new ClaseAbstracta()) OBJETOS DE CLASES ABSTRACTAS
    }

    private static double calcularAreaTotal(List<FiguraRegular> figuraRegulares) {
        return figuraRegulares.stream().
                mapToDouble(FiguraRegular::calcularArea).
                sum();
    }
}
