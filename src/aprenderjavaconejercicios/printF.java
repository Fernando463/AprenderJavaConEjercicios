/*
 * Pruebas del funcionamiento de Systam.out.printf();
 */
package aprenderjavaconejercicios;


public class printF {
    public static void main(String[] args){
        
        double doble = 6.325698;
        int entero = 12;
        double n = 23.3258976;
        
        
        
        
        
        
        
        
        //System.out.printf("%+.2f%n", doble);
        //System.out.printf("%+d %n",entero);
        //System.out.printf("doble=%+.2f%nentero=-%d%n", doble,entero);
        //System.out.printf("El cuadrado de %.2f es %.2f%n", n,n*n);
        System.out.printf("%+010.2f\n",doble);
        System.out.printf("%-10S\n", "Total");
        System.out.printf("%-10s\n", "Total");
        
    }
    
}
