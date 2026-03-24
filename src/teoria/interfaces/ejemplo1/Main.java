package teoria.interfaces.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal gato  = new Gato();
        perro.dormir();
        perro.hacerSonido();
        gato.dormir();
        gato.hacerSonido();
    }
}
