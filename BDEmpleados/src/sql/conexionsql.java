
package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexionsql {
    Connection con = null;
    String url = "jdbc:postgresql://localhost/empresa";
    String usuario = "postgres";
    String pass = "";
public Connection conectar(){
    try{
    Class.forName("org.postgresql.Driver");
    con = DriverManager.getConnection(url,usuario,pass);
  }catch(Exception e){

    JOptionPane.showMessageDialog(null, "Error al conectar"+e,"Error",JOptionPane.ERROR_MESSAGE);
   }
    return con;
 }
}
