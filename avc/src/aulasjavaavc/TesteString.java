package aulasjavaavc;

public class TesteString {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		if (i == j) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
				
		String a = new String ("Teste Java");
		String b = new String ("Teste Java");
		
		if (a == b) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		if (a.equals(b)) {
			System.out.println("a e b tem conteúdos iguais!");
		} else {
			System.out.println("a e b tem conteúdos diferentes!");
		}
	}

}
