import java.util.Scanner;
public class Operaciones{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   int opcion = 0;
   int num1 = 0;
   int num2 = 0;
   int res = 0;
   System.out.println("ingrese el numero de la opcion que desea implemetar: 1 = suma, 2 = resta, 3 = multiplicacion, 4 = division");
   opcion = in.nextInt();
   switch(opcion){
    case 1: System.out.println("usted ha seleccionado suma");
            System.out.println("ingrese el primer numero");
            num1 = in.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = in.nextInt();
            res = num1 + num2;
            System.out.println("el resultado es " +res);
            break;
    case 2: System.out.println("usted ha seleccionado resta");
            System.out.println("ingrese el primer numero");
            num1 = in.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = in.nextInt();
            res = num1 - num2;
            System.out.println("el resultado es " +res);
            break;
    case 3: System.out.println("usted ha seleccionado multiplicacion");
            System.out.println("ingrese el primer numero");
            num1 = in.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = in.nextInt();
            res = num1 * num2;
            System.out.println("el resultado es " +res);
            break;
    case 4: System.out.println("usted ha seleccionado division");
            System.out.println("ingrese el primer numero");
            num1 = in.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = in.nextInt();
            res = num1 / num2;
            System.out.println("el resultado es " +res);
            break;
    default:System.out.println("la opcion ingresada no existe");
  }
 }
}