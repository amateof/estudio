import java.util.Scanner;
public class cafeteria {

    public static void main(String[] args) {
        Scanner sn_teclado = new Scanner(System.in);

        double cafe = 1.10;
        double tostada = 1.5;
        int zumo_naranja = 2;
        double total;

        System.out.println("¡Hola soy la cafeteria Medac!");
        int cantidad_cafe;
        System.out.println("¿cuantos cafes deseas tomar?");
        cantidad_cafe = sn_teclado.nextInt();
        System.out.println("El precio de los cafes ascienden a\n" + cantidad_cafe * cafe);

        int cantidad_tostada;
        System.out.println("¿cuantas tostadas deseas tomar?");
        cantidad_tostada = sn_teclado.nextInt();
        System.out.println("El precio de las tostadas ascienden a\n" + cantidad_tostada * tostada);

        int cantidad_zumo;
        System.out.println("¿cuantos zumos de naranja deseas tomar?");
        cantidad_zumo = sn_teclado.nextInt();
        System.out.println("El precio de los zumos asciende a\n" + cantidad_zumo * zumo_naranja);

        total = cantidad_cafe * cafe + cantidad_tostada * tostada + cantidad_zumo * zumo_naranja;
        System.out.println("El precio de la cuenta asciende a\n" + total);
        sn_teclado.close();
    }

    
}
