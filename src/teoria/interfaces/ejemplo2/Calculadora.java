package teoria.interfaces.ejemplo2;

public interface Calculadora {
    static int sumar(int a, int b) {
        return a + b;
    }
    static int multiplicar(int a, int b) {
        return a * b;
    }
    static double dividir (int a, int b) {
        return 1.0 * a / b;
    }
}
