/*
 * Dada una cantidad de dinero, fraccionarla en billetes, es decir en cuantos
 * billetes de diferente tipo se puede dividir (de 500, 200, 100, etc) y el
 * resto sobrante (monedas) que sobran.
 * Los billetes pueden ser de 500, 200, 100, 50, 20, 10 y 5 euros.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class BilletesEuro {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int b500,b200,b100,b50,b20,b10,b5;
        int r500,r200,r100,r50,r20,r10,resto;
        
        System.out.print("Introduce la cantidad de dinero: ");
        int cant = sc.nextInt();
        
        b500 = cant/500;  // Billetes de 500€.
        r500 = cant%500;  // Cantidad inferior a 500€
        
        b200 = r500/200;  // Billetes de 200€.
        r200 = r500%200;  // Cantidad inferior a 200€.
        
        b100 = r200/100;  // Billetes de 100 €.
        r100 = r200%100;  // Cantidad inferior a 100€.
        
        b50 = r100/50;    // Idem  a las anteriores.
        r50 = r100%50;
        
        b20 =r50/20;
        r20 = r50%20;
        
        b10 = r20/10;
        r10 = r20%10;
        
        b5 = r10/5;
        resto = r10%5;
        
        System.out.println("La cantidad de " + cant + " euros, se divide en: ");
        System.out.println(b500 + " Billetes de 500 €");
        System.out.println(b200 + " Billetes de 200 €");
        System.out.println(b100 + " Billetes de 100 €");
        System.out.println(b50 + " Billetes de 50 €");
        System.out.println(b20 + " Billetes de 20 €");
        System.out.println(b10 + " Billetes de 10 €");
        System.out.println(b5 + " Billetes de 5 €");
        System.out.println(resto + " euros en monedas.");
    }
    
}
