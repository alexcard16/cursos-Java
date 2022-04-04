
package calculadora;

public class calculadoras {
  private String numero1;
  private String numero2;
  private int resultado;
public calculadoras(String numero1, String numero2){
   this.numero1 = numero1;
   this.numero2 = numero2;
 }
public String getSumar(){
 int num1 = Integer.parseInt(numero1);
 int num2 = Integer.parseInt(numero2);
  resultado = num1 + num2;
 String res = String.valueOf(resultado);
  return res;
 }
public String getRestar(){
  int num1 = Integer.parseInt(numero1);
  int num2 = Integer.parseInt(numero2);
  resultado = num1 - num2;
  String res = String.valueOf(resultado);
  return res;
 
 } 
public String getMultiplicar(){
  int num1 = Integer.parseInt(numero1);
  int num2 = Integer.parseInt(numero2);
  resultado = num1 * num2;
  String res = String.valueOf(resultado);
  return res;
 }
 public String getDividir(){
  int num1 = Integer.parseInt(numero1);
  int num2 = Integer.parseInt(numero2);
  resultado = num1 / num2;
  String res = String.valueOf(resultado);
  return res;
 }
}
