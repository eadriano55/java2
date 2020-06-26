/* A prefeitura do Rio de Janeiro abriu uma linha de cr�dito para os
seus funcion�rios. O valor m�ximo da presta��o n�o poder� ultrapassar
30% do sal�rio bruto. Fa�a um algoritmo que permita entrar com o sal�rio
bruto e o valor da presta��o e informe se o empr�stimo pode ou n�o ser
concedido.
 */

import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double salario, valor;
		System.out.println("Informe o sal�rio bruto:");
		salario = sc.nextDouble();
		System.out.println("Informe o valor da presta��o:");
		valor = sc.nextDouble();
		if (valor <= 0.3*salario)
			System.out.println("Empr�stimo pode ser concedido!");
		else
			System.out.println("Empr�stimo n�o pode ser concedido!");
		sc.close();
	}
}


