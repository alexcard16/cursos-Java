import java.util.Scanner;
public class Cadenass{
  public static void main(String args[]){
   Scanner datos = new Scanner(System.in);
   String usuario = "";
   String login ="camello1";
   String contra = "";
   String pass = "123456";
   System.out.println("ingrese el usuario");
   usuario = datos.nextLine();
   System.out.println("ingrese password");
   contra = datos.nextLine();
   if(usuario.equals(login) && contra.equals(pass)){
    System.out.println("ha ingresado al sistema"); 
  }else{
    System.out.println("password o usuario incorrectos");
  }
 }
}