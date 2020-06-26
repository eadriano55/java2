package ExercicioConta;
import java.util.Scanner;
public class UsaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c1 = new Conta(132, "José da Silva", 0, 1000, 1);
		Conta c2 = new Conta(3215, "Ana da Silva", 100, 0, 2);
		int op;
		do {
			System.out.println();
			System.out.println("***Seja bem vindo!***");
			System.out.println();
			System.out.println("1 - Saque: ");
			System.out.println("2 - Depósito: ");
			System.out.println("3 - Transferência: ");
			System.out.println("4 - Saldo da Conta: ");
			System.out.println("5 - Sair: ");
			System.out.println();
			System.out.println("Escolha sua opção: ");
			op = sc.nextInt();
			switch(op) {
				case 1:{
					System.out.println("Informe o número de sua conta: ");
					int conta = sc.nextInt();
					System.out.println("Informe o valor do saque: ");
					double valor = sc.nextDouble();
					if(conta==c1.getNumero()) 
						c1.sacar(valor);
					else if (conta==c2.getNumero())
						c2.sacar(valor);
					else 
						System.out.println("Conta inválida!");
					break;
				}
				case 2:{
					System.out.println("Informe o número de sua conta: ");
					int conta = sc.nextInt();
					System.out.println("Informe o valor do depósito: ");
					double valor = sc.nextDouble();
					if(conta==c1.getNumero())
						c1.depositar(valor);
					else if(conta==c2.getNumero())
						c2.depositar(valor);
					else
						System.out.println("Conta inválida!");
					break;
				}
				case 3: {
					System.out.println("Informe o número de sua conta: ");
					int conta = sc.nextInt();
					System.out.println("Informe o valor a transferir: ");
					double valor = sc.nextDouble();
					System.out.println("Informe a conta de destino: ");
					int cDest=sc.nextInt();
					if(cDest!=c1.getNumero() && cDest!=c2.getNumero())
						System.out.println("Conta de destino inválida! ");
					else {
						if(conta == c1.getNumero()) {
							c1.transferir(valor, c2);
						}
						else if (conta == c2.getNumero()) {
							c2.transferir(valor, c1);
						}
					else 
						System.out.println("Conta inválida!");
				}
					break;
			}
				case 4: {
					System.out.println("Informe o número de sua conta: ");
					int conta = sc.nextInt();
					if(conta == c1.getNumero()) {
						c1.exibir_dados();
					}
					else if(conta==c2.getNumero()) {
						c2.exibir_dados();
					}
					else
						System.out.println("Conta inválida!");
					break;
				}
				case 5: {
					System.out.println("Encerrando o sistema...");
					break;
				}
				default:
					System.out.println("Opção inválida!");
		}
	}while (op!=5);
		sc.close();
	}
}
