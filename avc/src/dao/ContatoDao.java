package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import banco.FabricaDeConexoes;
import modelo.Contato;

//No meu DAO do objeto xpto ficam as operações de conexão (no construtor, para ter 
//um único para as várias operações) e as operações do banco sem os dados
public class ContatoDao {
	private Connection con;

	public ContatoDao() throws SQLException {
		con = FabricaDeConexoes.getConnection();
	}

	public void adiciona(Contato contato) throws SQLException {
		String query = "insert into contatos (nome, email, endereco) values (?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.execute();
		stmt.close();
		con.close();
	}

	public List<Contato> getLista() throws SQLException {
		String query = "select * from contatos";
		PreparedStatement stmt = con.prepareStatement(query);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();

		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);

		}
		rset.close();
		stmt.close();
		con.close();
		return contatos;
	}

	public List<Contato> pesquisa(char inicialNome) throws SQLException {
		String sql = "select * from contatos where nome like '" + inicialNome + "%'";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();

		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		rset.close();
		stmt.close();
		con.close();
		return contatos;
	}
	public List<Contato> pesquisaId(Long id) throws SQLException {
		String sql = "select * from contatos where ID =" + id;
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();

		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		rset.close();
		stmt.close();
		con.close();
		return contatos;
	}


	public void alteraContato(Contato contato, Long id) throws SQLException {
		String sql = "UPDATE CONTATOS SET NOME = ?, EMAIL = ?, ENDERECO = ? WHERE ID = " + id + "";
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		preparedStatement.setString(1, contato.getNome());
		preparedStatement.setString(2, contato.getEmail());
		preparedStatement.setString(3, contato.getEndereco());
		preparedStatement.execute();
		preparedStatement.close();

	}

	public void deletar(Long id) throws SQLException {
		String sql = "delete from contatos where id = " + id + "";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.execute();
		preparedStatement.close();
		con.close();
	}
}
