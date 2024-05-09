import java.util.Scanner;
public class Estructuras {
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);

        int hora;

        System.out.println("¿Que hora es");

        hora = sn_teclado.nextInt();
        if (hora <12) {

            System.out.println("Buenos días.");
            
            } else if (hora < 20) {
            
            System.out.println("Buenas tardes.");
            
            } else {
            
            System.out.println("Buenas noches.");
            sn_teclado.close();
            }
    }
}
