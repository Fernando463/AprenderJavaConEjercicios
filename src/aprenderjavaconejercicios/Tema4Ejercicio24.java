/*
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 * de proyecto), los días que ha estado de viaje visitando clientes durante el
 * mes y su estado civil (1 - Soltero, 2 - Casado).
 * El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 * respectivamente.
 *  Por cada día de viaje visitando clientes se pagan 30 euros extra en
 * concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 * un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema4Ejercicio24 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1-Programador junior. \n2-Programador senior. \n3-Jefe de proyecto.");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        int cargo = sc.nextInt();
        
        double sueldo = 0;
        switch(cargo){
            case 1:
                sueldo = 950;
                break;
            case 2:
                sueldo = 1200;
                break;
            case 3:
                sueldo = 1600;
                break;
            default:
                System.out.println("El cargo introducido no es correcto");
        }
        
        System.out.print("¿Cuantos días ha estado de viaje visitando clientes? ");
        int dias = sc.nextInt();
        int viajes = (dias * 30);
        
        System.out.print("Introduzca su estado civil (1- Soltero, 2-Casado ");
        String estado = sc.next();
        double irpf;
        
        switch(estado){
            case "1":
                irpf = 0.25;
                break;
            case "2":
                irpf = 0.20;
                break;
        }
        
        
        System.out.printf("-----------------------------%n");
        System.out.printf("| Sueldo base%12.2f|%n ", sueldo,"|");
        System.out.printf("| Dietas viajes", args);
    }
    
}
