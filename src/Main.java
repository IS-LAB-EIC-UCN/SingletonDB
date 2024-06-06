import cl.ucn.bd.CrudDB;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlite:db.db";
        CrudDB crudDB = new CrudDB();
        crudDB.ingresarCliente(url);

    }
}