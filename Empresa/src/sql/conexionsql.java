package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionsql {
    Connection conn = null;
    String url="jdbc:postgresql://localhost/empresa";
    String usuario = "postgres";
    String clave = "";
    
   public Connection conectar(){
   
       try{
        Class.forName("org.postgresql.Driver");
        conn=DriverManager.getConnection(url,usuario,clave);
       }catch(Exception e){
        JOptionPane.showMessageDialog(null,"error al conectar"+e,"Error",JOptionPane.ERROR_MESSAGE);
       }
       return conn;
   }
}
