import java.util.Arrays;

public class sort {

    public static void main(String[] args) {
        
        int[] array = {2, 8, 3, 6, 7, 5, 9, 4, 1, 10};
        int numeroPares = 0;
        int numeroImpares = 0;
        
        Arrays.sort(array);
        
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numeroPares++; // Incrementar la cantidad de números pares
            } else {
                numeroImpares++;
            }
        }
        
        System.out.println("Cantidad numeros pares: " + numeroPares);
        System.out.println("Cantidad de numeros impares " + numeroImpares);
    }
}