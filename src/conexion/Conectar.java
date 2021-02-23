package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {

    public Statement st;
    public ResultSet rs;
    public Connection cn;
    String url = "dataBD.db";

    public Connection conexion() {
        try {
            Class.forName("org.sqlite.JDBC");

            try {
                cn = DriverManager.getConnection("jdbc:sqlite:" + url);
            } catch (SQLException ex) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }

}
