/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 */
package aprenderjavaconejercicios;

public class Tema4Ejercicio10 {
 
  public static void main(String[] args){
    System.out.println("Vamos a averiguar tu signo del zodíaco:");
    System.out.print("Introduce tu día de nacimiento: ");
    int dia=Integer.parseInt(System.console().readLine());
    System.out.print("Introduce tu mes de nacimiento: ");
    String mes=System.console().readLine();
    
    String signo;
    signo="hola";
    
    if(("marzo".equals(mes) && dia >=21) || ("abril".equals(mes) && dia >= 20)){
      signo="Aries";
    }
    if((mes == "abril" && dia >= 21) || (mes == "mayo" && dia <= 20)){
      signo="Tauro";
    }
    if((mes == "mayo" && dia >= 21) || (mes == "junio" && dia <= 21)){
      signo="Géminis";
    }
    if((mes == "junio" && dia >= 22) || (mes == "julio" && dia <= 22)){
      signo="Cancer";
    }
    if((mes == "julio" && dia >= 23) || (mes == "agosto" && dia <= 22)){
      signo="Leo";
    }
    if((mes == "agosto" && dia >= 23) || (mes == "septiembre" && dia <= 22)){
      signo="Virgo";
    }
    if((mes == "septiembre" && dia >= 23) || (mes == "octubre" && dia <= 22)){
      signo="Libra";
    }
    if((mes == "octubre" && dia >= 23) || (mes == "noviembre" && dia <= 22)){
      signo="Scorpio";
    }
    if((mes == "noviembre" && dia >= 23) || (mes == "diciembre" && dia <= 21)){
      signo="Sagitario";
    }
    if((mes == "diciembre" && dia >= 22) || (mes == "enero" && dia <= 20)){
      signo="Capricornio";
    }
    if((mes == "enero" && dia >= 21) || (mes == "febrero" && dia <= 18)){
      signo="Acuario";
    }
    if((mes == "febrero" && dia >= 19) || (mes == "marzo" && dia <= 20)){
      signo="Piscis";
    }
    
    System.out.print("Tu signo es: " + signo);
  }
  
}
