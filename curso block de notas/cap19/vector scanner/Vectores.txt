import java.util.Scanner;
public class Vectores{
  public static void main(String args[]){
   Scanner num = new Scanner(System.in);
   int itera=0;
   int num_s=0;
   System.out.println("ingrese el numero de vectores guardar");
   itera = num.nextInt();
   int vector[]= new int[itera];
   for(int i=0; i<vector.length; i++){
    System.out.println("ingrese el numero que desea guadar"); 
    num_s = num.nextInt();
    vector[i]=num_s;
  }

   for(int i=0;i<vector.length; i++){
   System.out.println("el vector en la posicion " +i +" guardados es: " +vector[i]);
    
  }
 }
}