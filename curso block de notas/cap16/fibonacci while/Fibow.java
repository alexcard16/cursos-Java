public class Fibow{
  public static void main(String args[]){
   int i = 0;
   int a = 0;
   int b = 1;
   int c = 0;
   while(i <= 10){
   System.out.print(a+ ",");
   c = a + b;
   a = b;
   b = c;
   i++;
  }
 }
}