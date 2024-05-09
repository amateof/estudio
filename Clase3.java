import java.util.Scanner;

public class Clase3 {
    
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
        //Sentencias de seleccion ---> IF, ELSE Y ELSE IF
        int edad = 0;
        System.out.println("Dame tu edad");
        edad = sn_teclado.nextInt();
        if(edad >=18){
            System.out.println("Eres mayor de edad, al bar.");}
        //if(edad <=18){
        else{
            if(edad<=10){
            System.out.println("eres menor de edad, al parque de bolas");}
            else{
                System.out.println("pa casa");
            }
            sn_teclado.close();
        }
    }
}