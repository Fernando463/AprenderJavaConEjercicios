/*
 * Ordenar de mayor a menor tres números enteros que se van a introducir por
 * teclado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class OrdenarTResDescen {
  
  public static void main(String[] args){
    
    int n1,n2,n3,aux;
    Scanner entrada =new Scanner(System.in);
    
    System.out.print("Introduce el primer número: ");
    n1= entrada.nextInt();
    System.out.print("Introduce el segundo número: ");
    n2= entrada.nextInt();
    System.out.print("Introduce el tercer número: ");
    n3= entrada.nextInt();
    
    if(n2 < n3){
      aux=n3;
      n3=n2;
      n2=aux;
    }
    if(n1<n2){
      aux=n2;
      n2=n1;
      n1=aux;
    }
    if(n2<n3){
      aux=n3;
      n3=n2;
      n2=aux;
    }
    
    System.out.println(n1 + " " + n2 + " "+n3);
  }
}
