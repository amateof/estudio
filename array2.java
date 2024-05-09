import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sn_teclado = new Scanner(System.in);
//         int numero1 =4, numero2 =6;
        
//          mostrarSuma(numero1, numero2);
//          saludar();
        
//      }
//   public static int sumarNumeros (int n1, int n2) {
//      int resultado = n1 + n2;
//      return resultado;
//   }
//   public static void mostrarSuma(int n1, int n2){
//      int resultado = n1 + n2;
//      System.out.println(resultado);
//   }
//   public static void saludar(){
//      System.out.println("hola");
//Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la imagen de arriba.
// int n = 1; //numero piramide
// int j= 0; //numero filas
// int altura =6;

// for(n=0; n <=altura; n++){
//     for (j=0; j <6;n++){
//         System.out.println(altura + j);
//     }

// }rem
// }

//int numero = (int)(Math.random());
//int aleatorio = (int) (Math.random()*20)+1;

//declaracion array
int [] array = new int [10];
//mostrar array+aleatorio
 for (int x=0;x<array.length;x++) {
  array[x] = (int) (Math.random()*100)+1; 
  System.out.println(array[x]);
} //delimitador del for para mostrar
//ordenacion burbuja
  for (int x =0; x <array.length; x++){
    for (int j=0; j<array.length -1; j++){
      if(array[j]>array[j+1]){
        int aux = array [j+1];
        array[j+1]=array[j];
        array[j]=aux;
      }//delimitador del for3
    }//delimitador del for2
  }//delimitador del for1 
  //mostrar ordenacion burbuja 
  System.out.print("\nVector ordenado: ");
for(int x=0; x<array.length;x++){
  System.out.println(array[x]+"");
  

//for(int x=0; x < array.length-1; x++) {
 // for(int j=0; j<array.length-1-x; j++){
   // if(array[j]> array[j+1]){
     // int aux=array[j];
     // array[j]=array[j+1];
     // array[j+1]=aux;
    }
   
  }
}
//}
//System.out.print("\nVector ordenado: ");
//for(int x=0; x<array.length;x++){
  //System.out.println(array[x]+"");
//}

  //      }
//}
