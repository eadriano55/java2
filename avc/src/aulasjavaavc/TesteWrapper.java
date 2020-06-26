package aulasjavaavc;

public class TesteWrapper {

	public static void main(String[] args) {
		int i = 5;
		//conversão automática da var i
		//de int para String
		System.out.println("teste "+i);
		
		//conversão coercitiva: classes Wrapper
		//que possuem métodos de parse]
		String s = "20";
		
		//a linha abaixo dá erro, pois não poso somar int com String
		//int k = i + s;
		//a linha abaixo converte s de int p; string
		int j = Integer.parseInt(s);
		int k = i + j;
		System.out.println(k);
	}

}
