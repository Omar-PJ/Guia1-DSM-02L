import java.util.Scanner;

public class Analisis1_AlumNotas {
  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int  f, Nota, cont1, cont2;
    cont1=0;
    cont2=0;
    for(f=1; f<=10; f++){
      System.out.print("Ingrese Nota del Alumno " + f +":");
      Nota= teclado.nextInt();
      if(Nota >=7 ){ cont1=cont1+1;}
      else{cont2=cont2+1;}
      {}
    }
    System.out.print(cont1 + " Alumnos tienen notas mayores o iguales a 7\n");
    System.out.print(cont2 + " Alumnos tienen notas menores a 7");
      }
}