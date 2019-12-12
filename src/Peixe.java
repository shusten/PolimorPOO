public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substâncias");

    }

    @Override
    public void emitirSom() {
        System.out.println("Blu... Blu... Blu...");

    }
}
