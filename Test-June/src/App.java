public class App {
	public static void main(String[] args) throws Exception {
		Botella agua = new Botella(200);
		System.out.println("Botella de agua:");
		System.out.println("Capacidad:" + agua.getbotella());
		agua.getsingas();
	}
}
