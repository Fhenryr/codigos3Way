package conexao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		Connection con;

		try {
			con = FabricaConexao.getConnection();
			if (con != null) {
				System.out.println("Conexao estabelecida");
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
