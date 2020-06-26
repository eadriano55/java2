import java.util.Scanner;
public class ExemploScanner {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		String texto, p1, p2, p3, p4;
		System.out.println("Texto: ");
		texto = sc.nextLine();
		System.out.println("Duas palavras, uma por linha: ");
		p1 = sc.next();
		p2 = sc.next();
		System.out.println("Duas palavras, separadas por espaço: ");
		p3 = sc.next();
		p4 = sc.next();
		System.out.printf("Texto1: %s%n", texto);
		System.out.printf("Duas primeiras palavras: %s %s %n", p1, p2);
		System.out.println(p3);
		System.out.println(p4);
		sc.close();
	}
}
