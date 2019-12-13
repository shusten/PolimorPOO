public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

//        p.locomover();
//        r.locomover();
//        a.locomover();
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();
        c.locomover();
        k.locomover();
        k.emitirSom();
    }
}
