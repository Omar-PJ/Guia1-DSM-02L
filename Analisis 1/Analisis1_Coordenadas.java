import java.util.Scanner;

public class Analisis1_Coordenadas{
  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int limite,cont1,cuadrante1=0,cuadrante2=0,cuadrante3=0,cuadrante4=0,x,y;
    System.out.print("¿Cuantos Pares Coordenados Ingresara? ");
    limite = teclado.nextInt();
    cont1=1;
    while(cont1 <= limite){
      System.out.print("Ingrese El valor de X de la "+ cont1+ "° coordenada: " );
      x=teclado.nextInt();
      System.out.print("Ingrese El valor de Y de la "+ cont1+ "° coordenada: " );
      y=teclado.nextInt();
      if(x>0)
      {
        if(y>0){ cuadrante1++;}
        else if(y<0){cuadrante4++;}
      }
    else { if(y>0){cuadrante2++;}
             else{cuadrante3++;}
          }
      cont1=cont1+1;
    }
    System.out.print(cuadrante1+ " Par Coordenados pertenecen al cuadrante 1\n" );
    System.out.print(cuadrante2+ " Par Coordenados pertenecen al cuadrante 2\n" );
    System.out.print(cuadrante3+ " Par Coordenados pertenecen al cuadrante 3\n" );
    System.out.print(cuadrante4+ " Par Coordenados pertenecen al cuadrante 4\n" );
    
  }
}