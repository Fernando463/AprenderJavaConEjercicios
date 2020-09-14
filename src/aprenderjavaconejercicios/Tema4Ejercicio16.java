/*
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
 * está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
 * con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
 * puntos. Las preguntas contestadas con falso no suman puntos. A continuación
 * se listan las preguntas del test.
 * A continuación se muestran los mensajes que deberá dar el programa según
 * la puntuación obtenida.
 • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
 fiel.
 • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
 vida o en su mente, aunque seguramente será algo sin importancia. No
 bajes la guardia.
 • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
 viviendo un romance con otra persona. Te aconsejamos que indagues un
 poco más y averigües que es lo que está pasando por su cabeza.
 */
package aprenderjavaconejercicios;

import java.util.Scanner;

public class Tema4Ejercicio16 {
  
  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    boolean v = true;
    boolean f = false;
    int cont = 0;
    
    System.out.println("Responde con v (verdadero) o f (falso) a las siguientes"
      + "preguntas. ");
    
    System.out.println("¿Tu pareja parece estar más inquieta de lo normal sin"
      + "ningún motivo aparente?: ");
      boolean r = s.nextBoolean();
      if(r == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Ha aumentado sus gastos de vestuario?: ");
      boolean a = s.nextBoolean();
      if(a == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Ha perdido el interés que mostraba anteriormente"
        + "por tí?: ");
      boolean b = s.nextBoolean();
      if(b == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Ahora se afeita y se asea con más frecuencia (si es"
        + "hombre) o ahora se arregla el pelo y se asea con más frecuencia8 si"
        + "es mujer?: ");
      boolean c = s.nextBoolean();
      if(c == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿No te deja que mires la agenda de su teléfono móvil?: ");
      boolean d = s.nextBoolean();
      if(d == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿A veces tiene llamadas que dice no querer contestar "
        + "cuando estás tú delante?: ");
      boolean e = s.nextBoolean();
      if(e == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Últimamente se preocupa más en cuidar la línea y/o estar"
        + "bronceado/a?: ");
      boolean g = s.nextBoolean();
      if(g == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Muchos días viene tarde después de trabajar porque dice"
        + "tener mucho más trabajo?: ");
      boolean h = s.nextBoolean();
      if(h == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Has notado que últimamente se perfuma más?: ");
      boolean i = s.nextBoolean();
      if(i == v){
        cont+=3;
      }else{
        cont+=0;
      }
      System.out.println("¿Se confunde y te dice que ha estado en sitios donde"
        + "no ha ido contigo?: ");
      boolean j = s.nextBoolean();
      if(j == v){
        cont+=3;
      }else{
        cont+=0;
      }
      if((cont >= 0) && (cont <= 10)){
        System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel");
      }
      else if( (cont >=11) && (cont <= 22)){
        System.out.print("Quizás existe el peligro de otra persona en su vida o"
          + "en su mente, aunque seguramente será algo sin importancia. No bajes"
          + "la guardia");
      }
      else if((cont > 22) && (cont <= 30)){
        System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo"
          + "un romance con otra persona. Te aconsejamos que indagues un poco más y "
          + "averigües que es lo que está pasando por su cabeza");
      }
  }   
  
}
