package aulasjavaavc;

public class TesteWrapper {

	public static void main(String[] args) {
		int i = 5;
		//convers�o autom�tica da var i
		//de int para String
		System.out.println("teste "+i);
		
		//convers�o coercitiva: classes Wrapper
		//que possuem m�todos de parse]
		String s = "20";
		
		//a linha abaixo d� erro, pois n�o poso somar int com String
		//int k = i + s;
		//a linha abaixo converte s de int p; string
		int j = Integer.parseInt(s);
		int k = i + j;
		System.out.println(k);
	}

}
