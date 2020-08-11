package app;

public class Principal {

	public static void main(String[] args) {

		// tipo primitivo so trabalha com valores não implementa operações e funções de
		// classe.
		int a = 0;

		// tipo wrapper trabalha com valores e implementa operações e funções de classe.
		Integer aw = 3;

		// exemplos---------------------------------------------------
		String ex = "";

		a = 0;

		ex = aw.toString();
		System.out.println(ex);
		System.out.println(Integer.max(a, aw));

	}

}
