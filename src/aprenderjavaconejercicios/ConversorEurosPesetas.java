/**
 * Conversor de euros a pesetas.
 * La cantidad en euros tiene que estar almacenada
 * en una variable.
 */
package aprenderjavaconejercicios;


public class ConversorEurosPesetas {
    public static void main(String [] args){
    
        double euros;
        euros=12.02;
        int pesetas=(int)(euros*166.386);
    
    System.out.println(euros+" Euros son: "+pesetas+" pesetas");
    }
    
}
