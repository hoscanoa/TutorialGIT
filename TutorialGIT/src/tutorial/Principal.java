package tutorial;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println("Mensaje");
		} catch (NullPointerException e) {
			System.out.println("Controlando punteros nulos");
		} catch (Exception e) {
			System.out.println("Esta todo controlado");
		}

	}
}
