import java.util.Scanner;
public class Cadenas{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   String nom1="";
   String nom2="";
   System.out.println("ingrese el primer nombre");
   nom1=in.nextLine();
   System.out.println("ingrese el segundo nombre");
   nom2=in.nextLine();
   if(nom1.equalsIgnoreCase(nom2)){
    System.out.println("nombres iguales");
  }else{
    System.out.println("nombres diferentes");
  }
 }
}