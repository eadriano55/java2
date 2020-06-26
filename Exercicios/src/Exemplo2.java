/* Fazer um programa que leia a matrícula de um
professor, seu número de horas trabalhadas no
mês, o valor que recebe por hora e calcula o
salário dele. O programa deve apresentar os dados
lidos, com os salários com uma casa decimal. */
import java.util.Scanner;
public class Exemplo2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int matricula, hora;
		double valor, salario;
		System.out.println("Informe o número da matrícula: ");
		matricula = sc.nextInt();
		System.out.println("Informe o número de horas trabalhadas: ");
		hora = sc.nextInt();
		System.out.println("Informe o valor por hora: ");
		valor = sc.nextDouble();
		salario = hora * valor;
		System.out.println("Matricula: "+ matricula);
		System.out.println("Hora trabalhada: "+ hora);
		System.out.println("Valor da hora trabalhada: "+ valor);
		System.out.printf("O salário é %.1f", salario);
		sc.close();
	}
}
