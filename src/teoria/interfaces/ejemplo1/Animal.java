package teoria.interfaces.ejemplo1;

public interface Animal {
    void hacerSonido();

    default void dormir() {
        System.out.println("durmiendo");
    }
}
