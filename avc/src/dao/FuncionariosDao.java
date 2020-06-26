package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import banco.FabricaDeConexoes;
import modelo.Funcionario;

public class FuncionariosDao {
	private Connection con;
	
	public FuncionariosDao() throws SQLException {
		con = FabricaDeConexoes.getConnection();
	}
	public void adiciona(Funcionario funcionario) throws SQLException {
		String query = "insert into funcionarios (id, nome, usuario, senha) values (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setLong(1, funcionario.getId());
		stmt.setString(2, funcionario.getNome());
		stmt.setString(3, funcionario.getUsuario());
		stmt.setString(4, funcionario.getSenha());
		stmt.execute();
		stmt.close();
		con.close();
	}
	
}
