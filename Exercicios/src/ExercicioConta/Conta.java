/*Fa�a um programa que instancie duas contas a partir da classe Conta e apresente um menu de op��es, com
opera��es para serem realizadas com as contas instanciadas at� que o usu�rio opte por encerrar a aplica��o.
O menu deve ter o formato:
******* Seja Bem vindo ao Banco JAVA I *******
	1- Realizar um saque:
	2- Realizar um dep�sito:
	3- Realizar uma transfer�ncia:
	4- Obter saldo da conta:
	5- Sair
	Escolha sua op��o: */

package ExercicioConta;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private double limite;
	private int tipoConta;
	
	public Conta() {
	}
	public Conta(int numero, String titular, double
			saldo, double limite, int tipoConta) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.tipoConta = tipoConta;
	}
	public int getNumero() {
		return numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = (tipoConta==1?limite:0);
	}
	public String getTipoConta() {
		return (tipoConta==1?"Conta Corrente":"Conta Poupan�a");
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public double getSaldo() {
		return (saldo);
	}
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Dep�sito realizado com sucesso!");
	}
	public void sacar(double valor) {
		if(this.tipoConta==1) {
			if(valor <= (saldo+limite))
				saldo-=valor;
			else
				System.out.println("Saldo insuficiente!");
		}
		else
			if(valor <= saldo) 
				saldo -= valor;
			else
				System.out.println("Saldo insuficiente!");
	}
	public void transferir(double valor, Conta dest) {
		if(this.tipoConta==1) {
			if(valor<=(this.saldo+this.limite)) {
				sacar(valor);
				dest.depositar(valor);
			}
			else
				System.out.println("Saldo insuficiente!");
		}
		else {
			if(valor<=(this.saldo)) {
				sacar(valor);
				dest.depositar(valor);
			}
			else
				System.out.println("Saldo insuficiente!");
		}
	}
	public void exibir_dados() {
		System.out.println();
		System.out.println("N�mero da conta: "+numero);
		System.out.println("Titular: "+titular);
		System.out.println("Tipo de conta: "+getTipoConta());
		System.out.println("Limite: "+limite);
		System.out.println("Saldo atual: "+saldo+"(+limite: "+limite+")");
		System.out.println();
	}
}
