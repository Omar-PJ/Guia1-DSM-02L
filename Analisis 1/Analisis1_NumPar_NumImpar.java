import java.util.Scanner;

public class Analisis1_NumPar_NumImpar{
  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int limite,cont1,valor,pares=0, impares=0;
    System.out.print("¿Cuantos Numeros Ingresara? ");
    limite = teclado.nextInt();
    cont1=1;
    while(cont1 <= limite){
      System.out.print("Ingrese Numero "+ cont1+ ": " );
      valor=teclado.nextInt();
      if(valor%2==0)
      {pares++;}
      else{impares++;}
      cont1=cont1+1;
    }
    System.out.print(pares+ " Numeros Son Pares.\n" );
    System.out.print(impares+ " Numeros Son Impares." );
  }
}