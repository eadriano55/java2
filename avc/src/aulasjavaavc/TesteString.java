package aulasjavaavc;

public class TesteString {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		if (i == j) {
			System.out.println("S�o iguais!");
		} else {
			System.out.println("S�o diferentes!");
		}
				
		String a = new String ("Teste Java");
		String b = new String ("Teste Java");
		
		if (a == b) {
			System.out.println("S�o iguais!");
		} else {
			System.out.println("S�o diferentes!");
		}
		if (a.equals(b)) {
			System.out.println("a e b tem conte�dos iguais!");
		} else {
			System.out.println("a e b tem conte�dos diferentes!");
		}
	}

}
