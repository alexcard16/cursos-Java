package sql;


import getset.variables;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Bd.JFEmpleados;
import javax.swing.JTable;

public class crudsql extends conexionsql {
   JTable table = new JTable();
   java.sql.Statement st;
   ResultSet rs;
   variables var = new variables();
public void mostrar(){

    try{ 
       JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idempleado");
        model.addColumn("nombre");
        model.addColumn("apellido");
        model.addColumn("puesto");
        table.setModel(model);
       Connection conexion = conectar();
       st = conexion.createStatement();
       String sql="select * from empleados;";
       rs = st.executeQuery(sql);
       
        String[] datos= new String[4];
        while (rs.next()){
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          datos[3]=rs.getString(4);
          model.addRow(datos);
   }
        st.close();
        conexion.close();
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error de busqueda" +e, "error",JOptionPane.ERROR_MESSAGE);
   
   }
  }
 
}