import java.util.Scanner;
public class arrayburbuja {
    public static void main(String [] args){
//declaracion array
int [] array = new int [3];
Scanner sn_teclado = new Scanner(System.in);
array[0] = sn_teclado.nextInt();
array[1] = sn_teclado.nextInt();
array[2] = sn_teclado.nextInt();
System.out.println("array de enteros");
//mostrar array de numeros aleatorios
 for (int x=0;x<array.length;x++) {
  //array[x] = (int) (Math.random()*100)+1; 
  System.out.println(array[x]);
} 
//busqueda lineal
boolean estael4 = busquedalineal(array, 4); 
if (estael4 == true){
System.out.println("esta el 4");} else {
  System.out.println("no esta el 4");
}
//ordenacion burbuja:
//recorremos el array 
for (int x =0; x <array.length; x++){
    //volvemos a recorrer el array con una nueva variable
    for (int j=0; j<array.length -1; j++){
        /*busco dentro del bucle for si el elemento que encuentro 
        es mayor que el elemento siguiente  */
        /*revisando cada elemento de la lista 
        que va a ser ordenada con el siguiente, 
        intercambiándolos de posición si 
        están en el orden equivocado. 
        Es necesario revisar varias 
        veces toda la lista hasta que 
        no se necesiten más intercambios*/
      if(array[j]>array[j+1]){
        //intercambiamos los numeros
        //guardamos el menor
        int aux = array [j+1];
        //lo intercambias
        array[j+1]=array[j];
        array[j]=aux;
        //volvemos al inicio 
      }//delimitador del for3
    }//delimitador del for2
  }//delimitador del for1 

   //mostrar ordenacion burbuja 
   System.out.println("\nVector ordenado: ");
   for(int x=0; x<array.length;x++){
     System.out.println(array[x]+"");
    }
} 
public static boolean busquedalineal(int array[], int elemento) {
  boolean encontrado = false;
  for (int i = 0; i < array.length && !encontrado; i++) {
    if (array[i]==elemento){
      encontrado = true;
    }
}
return encontrado;

}

}


