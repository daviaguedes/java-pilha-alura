public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		try {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
		} catch (ArithmeticException | NullPointerException ex) {
			System.out.println("Exception" + ex.getMessage());
		}
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}

}
