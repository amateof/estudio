import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class array {
    public static void main(String[] args){
 int numeroMagico = ThreadLocalRandom.current().nextInt(1, 100);
 Scanner sn_teclado = new Scanner(System.in);

 int miNumero;

do {
    System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
    miNumero = sn_teclado.nextInt();
    if (numeroMagico > miNumero){
        System.out.println("mi numero es mayor");
    } else if (numeroMagico < miNumero) {
        System.out.println("el numero es menor");
    }
} 

while (numeroMagico !=miNumero ); {
    System.out.println("has acertado" + numeroMagico);
}

    }
}