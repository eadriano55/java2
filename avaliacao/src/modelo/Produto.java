package modelo;

public class Produto {
	private String codigo;
	private String nome;
	private String preco;
	private String qtde;
	
	public Produto() {
		
	}
	public Produto(String codigo, String nome, String preco, String qtde) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getQtde() {
		return qtde;
	}

	public void setQtde(String qtde) {
		this.qtde = qtde;
	}
}

