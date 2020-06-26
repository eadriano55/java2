package banco;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaBanco3 {
	public static void main(String[] args) {
		try {
			Connection con = FabricaDeConexoes.getConnection();
			System.out.println("ok, conectado ao banco!");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
