public class Botella {
    public int botella = 100;
    boolean singas = true;

    public Botella(int newbotella) {
        botella = newbotella;
    }

    public int getbotella() {
        return botella;
    }

    public void getsingas() {
        if (singas = true) {
            System.out.println("No tiene gas");
        } else {
            System.out.println("Tiene gas");
        }

    }
}