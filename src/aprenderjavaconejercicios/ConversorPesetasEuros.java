/*
 * Conversor de pesetas a euros.
 * La cantidad en pesetas tiene que estar almacenaca en una variable.
 * Emplear conversiones de tipos (casting) explícitas.
 * P.D.-Las conversiones implícitas ya las realiza Java.
 */
package aprenderjavaconejercicios;

public class ConversorPesetasEuros {
    public static void main(String [] args0){
    
            int pesetas=1000000;
            double euros;
            euros = pesetas/166.386;
            
            System.out.println(pesetas+" pesetas" + " son "+euros+" euros");
    
    }
    
}
