package cl.ucn.bd;

import java.sql.SQLException;
import java.sql.Statement;

public class CrudDB {

    public void ingresarCliente(String url) throws SQLException, ClassNotFoundException {

        ConectorBD conectorBD = ConectorBD.conectar(url);
        //Ingresar un nuevo cliente
        Statement statement = conectorBD.getConn().createStatement();
        statement.executeUpdate("insert into cliente values(1, 'Isabel', 400000)");
        conectorBD.cerrarBD();

    }

}
