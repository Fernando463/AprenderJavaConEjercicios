/*
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;


public class Tema4Ejercicio23 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos a calcular el precio final de un producto, en basea su base imponible");
        
        System.out.print("Introduzca la base imponible: ");
        int base = sc.nextInt();
       
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido: )");
        String iva = sc.next();
      
        
        double tipoIva = 0;
        switch(iva){
            case "general":
                tipoIva = 0.21;
                break;
            case "reducido":
                tipoIva = 0.10;
                break;
            case "superreducido":
                tipoIva = 0.04;
                break;
            default:
                System.out.println("El tipo de IVA no es correcto. ");
        }
        
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promo = sc.next();
      
        
        double promocion = 0;
        switch (promo){
            case "nopro":
                promocion = 0;
                break;
            case "mitad":
                promocion = (base/2);
                break;
            case "meno5":
                promocion = (base-5);
                break;
            case "5porc":
                promocion = (base * 0.05);
                break;
            default:
                System.out.println("El código introducido no es correcto");   
        }
        
        System.out.printf("Base imponible %8d.00%n",base);
        System.out.println("IVA ( "   + (int)(tipoIva*100) + " % )\t\t\t" + (base * tipoIva));
        System.out.println("Cód. promo.( "+ promo + " ):\t\t" + (promocion));
        System.out.println("TOTAL\t\t\t\t" + (((base*(1+tipoIva)))-(base*promocion)));
        
    }
    
}

/*
        System.out.println("Base imponible\t\t\t" + base);
        System.out.println("IVA ( "   + (int)(tipoIva*100) + " % )\t\t\t" + (base * tipoIva));
        System.out.println("Cód. promo.( "+ promo + " ):\t\t-" + (promocion));
        System.out.println("TOTAL\t\t\t\t" + (((base*(1+tipoIva)))-(base*promocion)));



        System.out.printf("Base imponible %8.f%n", base);
*/