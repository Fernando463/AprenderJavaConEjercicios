/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 */
package aprenderjavaconejercicios;

/* NOTA: Para calcular la primera cifra de un número, cogemos la parte entera de
         la división de ese numero entre 10 elevado al número de dígitos menos uno,
         y ese número es el primer dígito. Vamos a hacerlo con sentencias IF.
*/

import java.util.Scanner;

public class Tema4Ejercicio18ConIf {
  
  public static void main(String[]args){
    
    int digito = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero y pulsa enter: ");
    
    int numero = sc.nextInt();
    
    if(numero <=9){                               // Un sólo dígito, lo dividimos por 1 y ya tenemos la primera cifra
      digito = (numero/1);
    }                                           
    else if(numero >= 10 && numero <= 99){             // Dos dígitos, lo dividimos entre 10 y obtenemos la primera cifra.
      digito = (numero/10);
  }
     if(numero >= 100 && numero <= 999){           // Tres dígitos, lo dividimos entre 100...y así sucesivamente.
     digito =  (numero/100);
  }
     if(numero >= 1000 && numero <= 9999){         // Cuatro dígitos, entre 1000.
      digito =  (numero/1000);
    }
     if(numero >= 10000 && numero <= 99999){       // Cinco dígitos, entre 10000.
      digito =   (numero/10000);
    }
     if(numero > 99999){
      System.out.println("No puedes introducir un número de más de cinco cifras");
    }
    
    System.out.println("El primer dígito del número " + numero + " es " + digito);
  }
  
}



/*
 *********************************************************************************************************
  Usando estos cast en las operaciones, el programa se ejecutaba, pero el resultado siempre era que 
    "el primer dígito del número es 0 (cero)"
 *********************************************************************************************************

 
    int numero = sc.nextInt();
    
    if(numero <=9){                               // Un sólo dígito, lo dividimos por 1 y ya tenemos la primera cifra
      digito = (int)(numero/10e0);
    }                                           
    else if(numero >= 10 && numero <= 99){             // Dos dígitos, lo dividimos entre 10 y obtenemos la primera cifra.
      digito = (int) (numero/10e1);
  }
     if(numero >= 100 && numero <= 999){           // Tres dígitos, lo dividimos entre 100...y así sucesivamente.
     digito = (int) (numero/10e2);
  }
     if(numero >= 1000 && numero <= 9999){         // Cuatro dígitos, entre 1000.
      digito = (int) (numero/10e3);
    }
     if(numero >= 10000 && numero <= 99999){       // Cinco dígitos, entre 10000.
      digito =  (int) (numero/10e4);
    }
     if(numero > 99999){
      System.out.println("No puedes introducir un número de más de cinco cifras");
    }
    
    System.out.println("El primer dígito del número " + numero + " es " + digito);
  }
  
}

*/