public class fibodw{
 public static void main(String args[]){
   int i = 0;
   int a = 0;
   int b = 1;
   int c = 0;
   do{
    System.out.print(a+ ",");  
    c = a+b;
    a = b;
    b = c;
    i++; 
  }while(i <= 10);  
 }
}