
package sql;
import getset.variables;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class crudsql extends conexionsql {
   java.sql.Statement st;
   ResultSet rs;
   variables var = new variables();
   public void insertar(String nombre, String apellido, String puesto){
   try{
       Connection conexion = conectar();
       st = conexion.createStatement();
       String sql="insert into empleados (nombre, apellido, puesto)values('"+nombre+"', '"+apellido+"', '"+puesto+"' );";
       st.execute(sql);
       st.close();
       conexion.close();
       JOptionPane.showMessageDialog(null,"registro exitoso","Mensaje", JOptionPane.INFORMATION_MESSAGE);
     }catch(Exception e){ 
       JOptionPane.showMessageDialog(null,"error al registrar"+e, "Error", JOptionPane.ERROR_MESSAGE);
    }
   }
   
   public void mostrar(String idempleado){
   try{
       Connection conexion = conectar();
       st = conexion.createStatement();
       String sql="select * from empleados where idempleado = '"+idempleado+"';";
       rs = st.executeQuery(sql);
       if(rs.next()){
        var.setIdempleado(rs.getString("idempleado"));
        var.setNombre(rs.getString("nombre"));
        var.setApellido(rs.getString("apellido"));
        var.setPuesto(rs.getString("puesto"));
       }else{
        var.setIdempleado("");   
        var.setNombre("");
        var.setApellido("");
        var.setPuesto("");
        JOptionPane.showMessageDialog(null, "no hay registos", "sin registro",JOptionPane.INFORMATION_MESSAGE);
        st.close();
        conexion.close();
       }
   }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error de busqueda" +e, "error",JOptionPane.ERROR_MESSAGE);
   
   }
   }
   public void modificar(String nombre, String apellido, String puesto, String idempleado){
     try{
     Connection conexion = conectar();
     st = conexion.createStatement();
     String sql="update empleados set nombre = '"+nombre+"', apellido = '"+apellido+"', puesto = '"+puesto+"' where idempleado = '"+idempleado+"';";
     st.executeUpdate(sql);
     st.close();
     conexion.close();
     JOptionPane.showMessageDialog(null,"los datos se actualizaron", "datos actualizados", JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception e){
     JOptionPane.showMessageDialog(null, "Error en la actualizacion de datos"+e ,"datos no actualizados", JOptionPane.ERROR_MESSAGE);
    }
  }
  public void eliminar(String idempleado){
    try{
    Connection conexion = conectar();
    st = conexion.createStatement();
    String sql ="delete from empleados where idempleado = '"+idempleado+"';";
    st.executeUpdate(sql);
    st.close();
    conexion.close();
    JOptionPane.showMessageDialog(null, "datos eliminados correctamente", "datos eliminados",JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, "error al eliminar datos"+e,"error al eliminar",JOptionPane.ERROR_MESSAGE);

    }
  }
}
