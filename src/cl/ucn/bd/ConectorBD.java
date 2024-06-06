package cl.ucn.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBD  {

    private String url;
    private static ConectorBD conectorBD = null;
    private Connection conn = null;

    private ConectorBD(String url) throws SQLException, ClassNotFoundException {

        this.url = url;
        conn = DriverManager.getConnection(this.url);
    }

    public static ConectorBD conectar(String url) throws SQLException, ClassNotFoundException {

        if (conectorBD == null) {

            conectorBD = new ConectorBD(url);
        }
        return conectorBD;

    }
    public void cerrarBD()  {

        try {
            if (this.conn != null) {
                this.conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // or log the exception
        }
    }

    public Connection getConn() {
        return conn;
    }
}
