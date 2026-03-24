package teoria.interfaces.ejemplo1;

public class Perro implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Ladrando...");
    }

    @Override
    public void dormir() {
        System.out.println("Durmiendo perro");
    }
}
