import java.util.Scanner;
public class Bidimensio{
  public static void main(String args[]){
   Scanner num_in = new Scanner(System.in);
   int fila = 0;
   int columna= 0;
   int contador=1;
   System.out.println("ingrese numero de filas");
   fila = num_in.nextInt();
   System.out.println("ingrese numero de columnas");
   columna = num_in.nextInt();
   int numeros[][]= new int[fila][columna];
   for(int j=0;j<fila; j++){
    for(int i=0;i<columna;i++){
     numeros[j][i]=contador;
     contador++;
     System.out.print("["+ numeros[j][i] +"]");
   }
    System.out.println("");
  }
 }
}