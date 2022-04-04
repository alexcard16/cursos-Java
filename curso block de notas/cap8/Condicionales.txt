import java.util.Scanner;

public class Condicionales{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   int num_ope;
   int num1 = 0;
   int num2 = 0;
   int res;
   System.out.println("ingrese la operacion deseada 1=SUMAR 2=RESTAR 3=MULTIPLICAR 4=DIVIDIR");
   num_ope = in.nextInt();
   if (num_ope == 1){
    System.out.println("ingrese numero 1");
    num1 = in.nextInt();
    System.out.println("ingrese numero 2");
    num2 = in.nextInt();
    res= num1 + num2;
    System.out.println("el resultado de la suma es " +res);
  }else if (num_ope == 2){
    System.out.println("ingrese numero 1");
    num1 = in.nextInt();
    System.out.println("ingrese numero 2");
    num2 = in.nextInt();
    res= num1 - num2;
    System.out.println("el resultado de la resta es " +res);
  }else if (num_ope == 3){
    System.out.println("ingrese numero 1");
    num1 = in.nextInt();
    System.out.println("ingrese numero 2");
    num2 = in.nextInt();
    res= num1 * num2;
    System.out.println("el resultado de la multiplicacion es " +res);
  }else if (num_ope == 4){
    System.out.println("ingrese numero 1");
    num1 = in.nextInt();
    System.out.println("ingrese numero 2");
    num2 = in.nextInt();
    res= num1 / num2;
    System.out.println("el resultado de la division es " +res);
  }
 }
}