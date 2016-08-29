package br.com.eric.catalogo.main;

import java.sql.Connection;
import br.com.eric.catalogo.util.CatalogoUtil;

public class TestaConexao {

	public static void main(String[] args) {
		Connection conn = CatalogoUtil.getConexao();
		if (conn != null){
			System.out.println("OK");
		}
		CatalogoUtil.fechaConexao(conn);
	}
}
