public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegeais");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");

    }
}
