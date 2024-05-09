

import java.util.Scanner;
public class triangulo {
public static void main(String[] args) {
    Scanner sn_teclado = new Scanner(System.in);
    System.out.println("cuantos pisos quieres");
    int pisos;
    pisos = sn_teclado.nextInt();
    String altura = "*";
   //System.out.println(" " + " " + "*");
   //System.out.println("" + " " +"*" + " " + "*");
   //System.out.println("*"+ " " + "*" + " "+"*");
int i ;
int j;
 for (i=1; i<=pisos; i++) {
    
    System.out.println(altura);
    altura = altura + "*";
 }
}
}