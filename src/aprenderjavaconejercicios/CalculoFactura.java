/*
 * Calcular el total de una factura a partir de la base imponible.
 * La base imponible estará almacenada en una variable.
 */
package aprenderjavaconejercicios;

public class CalculoFactura {
    public static void main(String [] args){
    
        double baseImponible=22.75;
        
        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA            %8.2f\n",(baseImponible*0.21));
        System.out.printf("-----------------------\n");
        System.out.printf("Total          %8.2f\n",(baseImponible+1.21));
        
        
        
    
    
    }
    
}
