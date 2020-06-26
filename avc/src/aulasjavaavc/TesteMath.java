package aulasjavaavc;

//Classe de teste para testa a  API Math de java.lang
public class TesteMath {
	public static void main(String[] args) {
		double d1 = Math.abs(-2.5);
		System.out.println(d1);
		//random () gera um nro peseudo aleatorio entre 0 e 1
		double d2 = Math.random();
		System.out.println(d2);
		double d3 = Math.max(2.5, 1.4);
		System.out.println(d3);
		double d4 = Math.min(2.5, 1.4);
		System.out.println(d4);
		double d5 = Math.ceil(4.00000001);
		System.out.println(d5);
		double d6 = Math.ceil(4.000000);
		System.out.println(d6);
		double d7 = Math.floor(4.9999999);
		System.out.println(d7);
		double d8 = Math.round(4.5);
		System.out.println(d8);
		double d9 = Math.round(4.49999999);
		System.out.println(d9);
		double d10 = Math.pow(3,2);
		System.out.println(d10);
		double d11 = Math.sqrt(9);
		System.out.println(d11);
		
	}
	
}
