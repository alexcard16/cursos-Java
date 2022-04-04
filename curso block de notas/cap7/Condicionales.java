public class Condicionales{
  public static void main(String args[]){
   int num_ope = 3;
   int num1 = 2;
   int num2 = 2;
   int res;
   if (num_ope == 1){
    res= num1 + num2;
    System.out.println("el resultado de la suma es " +res);
  }else if (num_ope == 2){
    res= num1 - num2;
    System.out.println("el resultado de la resta es " +res);
  }else if (num_ope == 3){
    res= num1 * num2;
    System.out.println("el resultado de la multiplicacion es " +res);
  }else if (num_ope == 4){
    res= num1 / num2;
    System.out.println("el resultado de la division es " +res);
  }
 }
}