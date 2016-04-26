package br.gov.pe.educacao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by eric.silva on 18/04/2016.
 */
public class CatalogoUtil {

    private CatalogoUtil(){

    }

    public static Connection getConexao(){
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            String url = "jdbc:hsqldb:hsql://localhost:9090/catalogo";
            Connection con =
                    DriverManager.getConnection(url, "sa", "");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void fechaConexao(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
