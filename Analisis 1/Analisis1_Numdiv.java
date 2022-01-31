import java.util.Scanner;
public class Analisis1_Numdiv {
    public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      int num1, num2;
      System.out.print("Ingrese Numero 1: ");
      num1= teclado.nextInt();
      System.out.print("Ingrese Numero 2: ");
      num2= teclado.nextInt();
      if(num1%num2==0)
      {
        System.out.print("El numero " +num1+ " es divisible con "+num2);
      }
      else
      {
        System.out.print("El numero "+ num1 +" No Es divisible con "+num2);
      }
        }
  }
