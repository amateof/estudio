import java.util.Scanner;

public class bucles {
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
       int edad = 0;
        edad = sn_teclado.nextInt();
       while(edad <18){
        System.out.println("Eres menor de edad" + edad);
        System.out.println("Pasa un año");
        edad++;
       }
       System.out.println("Haz alcanzado la mayoria de edad");
    }
}