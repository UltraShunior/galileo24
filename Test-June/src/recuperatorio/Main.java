public class Main {
    public static void main(String[] args) {
        Personaje miPersonaje = new Personaje();
        Arma miArma = new Arma("Uzi", 10);
        miPersonaje.equiparArma(miArma);
        miPersonaje.atacar();
    }
}
