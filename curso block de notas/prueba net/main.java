import java.util.Scanner;
public class main {
  public static void main(String [] args){  
   Scanner ingresa = new Scanner(System.in);
   String marca = "";
   String modelo = "";
   float precio;
   int numVehiculos;
   System.out.println("ingrese el numero de vehiculos");
   numVehiculos = ingresa.nextInt(); 
   
   System.out.println("ingrese modelo del vehiculo");
   modelo = ingresa.nextLine();
   
   System.out.println("ingrese el precio del vehiculo");
   precio = ingresa.nextFloat();
   
   System.out.println("ingrese marca del vehiculo");
   marca = ingresa.nextLine();
}
}