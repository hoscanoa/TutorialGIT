package tutorial;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Mensaje1");
			System.out.println("Mensaje2");
			System.out.println("Mensaje3");
			System.out.println("Mensaje4");
		} catch (NullPointerException e) {
			System.out.println("Controlando punteros nulos");
		} catch (Exception e) {
			System.out.println("Esta todo controlado");
		}

	}
}
