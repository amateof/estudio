import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class triangulo2 {
    
    public static void main(String[] args){
    Scanner sn_teclado = new Scanner(System.in);

    int numeroMagico = ThreadLocalRandom.current().nextInt(1, 10);
   
    int numeroUsuario;
    int intentosRealizados = 0;
        final int MAX_INTENTOS = 3;
   
    
do {
    System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
    numeroUsuario = sn_teclado.nextInt();
    intentosRealizados++;
    if (numeroMagico > numeroUsuario) {
        System.out.println("El número que he pensado es mayor que el introducido");
    } else if (numeroMagico < numeroUsuario) {
        System.out.println("El número que he pensado es menor que el introducido");
    } 
} while (numeroMagico != numeroUsuario && intentosRealizados <MAX_INTENTOS);
if (numeroMagico == numeroUsuario) {
    System.out.println("¡Has acertado! El número que pensé fue: " + numeroMagico);
} else {
    System.out.println("Agotaste tus intentos. El número que pensé fue: " + numeroMagico);
}

}
    }







