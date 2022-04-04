import java.util.Scanner;
public class Condicionales3{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   String nomb = "";
   int clave = 0;
   int antigue = 0;
   System.out.println("ingrese su nombre");   
   nomb = in.nextLine();
   System.out.println("ingrese numero de clave de departamento");
   clave = in.nextInt();
   System.out.println("ingrese años de antiguedad");
   antigue = in.nextInt();
   if(clave == 1){
    if(antigue == 1){
     System.out.println("felicidades tiene 6 dias de vacaciones " +nomb);
   }else if(antigue >= 2 && antigue <=6){
     System.out.println("felicidades tiene 15 dias de vacaciones " +nomb);     
   }else if(antigue > 6){
     System.out.println("felicidades tiene 22 dias de vacaciones " +nomb);
   }
  }if(clave == 2){
    if(antigue == 1){
     System.out.println("felicidades tiene 7 dias de vacaciones " +nomb);
   }else if(antigue >= 2 && antigue <=6){
     System.out.println("felicidades tiene 15 dias de vacaciones " +nomb);     
   }else if(antigue > 6){
     System.out.println("felicidades tiene 22 dias de vacaciones " +nomb);
   }
  }if(clave == 3){
    if(antigue == 1){
     System.out.println("felicidades tiene 10 dias de vacaciones " +nomb);
   }else if(antigue >= 2 && antigue <=6){
     System.out.println("felicidades tiene 20 dias de vacaciones " +nomb);     
   }else if(antigue > 6){
     System.out.println("felicidades tiene 30 dias de vacaciones " +nomb);
   }
  }if (clave >= 4){
    System.out.println("no existe el numero de clave");
  }
 }
}