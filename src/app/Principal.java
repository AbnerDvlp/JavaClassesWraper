package app;

public class Principal {

	public static void main(String[] args) {

		// tipo primitivo so trabalha com valores n�o implementa opera��es e fun��es de
		// classe.
		int a = 0;

		// tipo wrapper trabalha com valores e implementa opera��es e fun��es de classe.
		Integer aw = 3;

		// exemplos---------------------------------------------------
		String ex = "";

		a = 0;

		ex = aw.toString();
		System.out.println(ex);
		System.out.println(Integer.max(a, aw));

	}

}
