/* Fazer um programa que leia a matr�cula de um
professor, seu n�mero de horas trabalhadas no
m�s, o valor que recebe por hora e calcula o
sal�rio dele. O programa deve apresentar os dados
lidos, com os sal�rios com uma casa decimal. */
import java.util.Scanner;
public class Exemplo2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int matricula, hora;
		double valor, salario;
		System.out.println("Informe o n�mero da matr�cula: ");
		matricula = sc.nextInt();
		System.out.println("Informe o n�mero de horas trabalhadas: ");
		hora = sc.nextInt();
		System.out.println("Informe o valor por hora: ");
		valor = sc.nextDouble();
		salario = hora * valor;
		System.out.println("Matricula: "+ matricula);
		System.out.println("Hora trabalhada: "+ hora);
		System.out.println("Valor da hora trabalhada: "+ valor);
		System.out.printf("O sal�rio � %.1f", salario);
		sc.close();
	}
}
