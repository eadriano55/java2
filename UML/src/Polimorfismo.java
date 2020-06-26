
public class Polimorfismo {
	    public static void main(String[] args) {
	        Bonificacao controle = new Bonificacao();

	        Gerente func1 = new Gerente();
	        func1.setSalario(3000.0);
	        controle.registra(func1);

	        Funcionario func2 = new Funcionario();
	        func2.setSalario(1000.0);
	        controle.registra(func2);

	        System.out.println(controle.getTotalDeBonificacoes());
	    }
	}

	class Bonificacao {
	    private double totalDeBonificacoes = 0;

	    public void registra(Funcionario func) {
	        this.totalDeBonificacoes += func.getBonificacao();
	    }

	    public double getTotalDeBonificacoes() {
	        return this.totalDeBonificacoes;
	    }
	}

	class Gerente extends Funcionario {
	    int senha;
	    int funcionariosGerenciados;

	    public double getBonificacao() {
	        return this.salario * 0.15;
	    }
	}

	class Funcionario {
	    protected String nome;
	    protected String cpf;
	    protected double salario;

	    public double getBonificacao() {
	        return this.salario * 0.10;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }
}
