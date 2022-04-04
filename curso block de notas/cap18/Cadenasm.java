import java.util.Scanner;
public class Cadenasm{
  public static void main(String args[]){
   Scanner cadena = new Scanner(System.in);
   String text ="";
   String textelim ="";
   int numesp = 0;
   int desde = 0;
   int hasta = 0;
   System.out.println("ingrese el texto deseado");
   text = cadena.nextLine();
   numesp = text.length();
   System.out.println("el numero de caracteres es " +numesp);
   System.out.println("desde que espacio hasta que espacio desea cortar el texto");
   desde = cadena.nextInt();
   hasta = cadena.nextInt();
   textelim = text.substring(desde, hasta);
   System.out.println("el texto modificado es   " +textelim);
 }
}