/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;
public class Tema4Ejercicio22 {
    public static void main(String[] args){
        
        int resultado = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana, con letra: ");
        String dia = sc.next();
        System.out.print("Introduce una hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();
        
        if(dia.equals("lunes")){
            resultado =(((3 * 1440) + 900) + (1400 - (((hora * 60) + minutos))));
        }
        if(dia.equals("martes")){
            resultado =(((2 * 1440) + 900) + (1400 - (((hora * 60) + minutos))));
        }
        if(dia.equals("miercoles")){
            resultado =(((1 * 1440) + 900) + (1400 - (((hora * 60) + minutos))));
        }
        if(dia.equals("jueves")){
            resultado =(( 900) + (1400 - (((hora * 60) + minutos))));
        }
        if(dia.equals("viernes")){
            resultado =( (900 - (((hora * 60) + minutos))));
        }
        
        System.out.println("Faltan " + resultado + " minutos para el fin de semana");
    }
    
}
