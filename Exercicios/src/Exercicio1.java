/* A prefeitura do Rio de Janeiro abriu uma linha de crédito para os
seus funcionários. O valor máximo da prestação não poderá ultrapassar
30% do salário bruto. Faça um algoritmo que permita entrar com o salário
bruto e o valor da prestação e informe se o empréstimo pode ou não ser
concedido.
 */

import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double salario, valor;
		System.out.println("Informe o salário bruto:");
		salario = sc.nextDouble();
		System.out.println("Informe o valor da prestação:");
		valor = sc.nextDouble();
		if (valor <= 0.3*salario)
			System.out.println("Empréstimo pode ser concedido!");
		else
			System.out.println("Empréstimo não pode ser concedido!");
		sc.close();
	}
}


