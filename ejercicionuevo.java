import java.util.Scanner;

public class ejercicionuevo {
    public static void main(String[] args) {
      //Pedir números hasta que se introduzca uno negativo, y calcular la media
 Scanner sn_teclado = new Scanner(System.in);
      
       int i;
        double numerospositivos=0, numerosnegativos=0;
        int sumavalores =0;
        int[] array = new int[10];
        double media = 0;
        double media2 = 2;
        double negativos = 0;
        double positivos = 0;

    for(i=0; i<array.length; i++){
        array[i]=sn_teclado.nextInt();
    }

    System.out.println("Los numeros dados por pantalla son:");
    for(i=0; i<array.length; i++){
        System.out.println(array[i]);
    }
    
      for(i=0; i<array.length; i++){
        sumavalores = sumavalores+array[i];
      } System.out.println("la de suma de los valores del array tiene como resultado" + " " + sumavalores);

      for(i=0; i<array.length; i++){
      if(array[i]<0){
        numerosnegativos += array[i];
        negativos++;
      } else if (array[i]>0){
        numerospositivos += array[i];
        positivos++;
      }
    }
    media = numerosnegativos/negativos;
    media2 = numerospositivos/positivos;
    System.out.println(media);
    System.out.println(media2);
   
    
    
    /*int n = sn_teclado.nextInt();

  
    int m = sn_teclado.nextInt();

    int resultado=1;
    
    
    for (int i=0; i<m; i++){
      resultado*=n;
    } 
    System.out.println(resultado);*/

    //Crear un programa que diga si un elemento existe en un array, ampliar a una matriz.
    /*public static void main(String[] args){
      Scanner sn_teclado = new Scanner(System.in);
    int [] array = new int [] {10,5,4,21,22,26};  
    int n; 
    n=sn_teclado.nextInt();

    boolean salir = false;

  

    for(int i= 0; i<array.length && !salir ; i++ ){
      if(array[i]==n) {
        salir=true;}
      }
      if (salir) {System.out.println("esta");} else{
        System.out.println("no esta");
      }*/
}
}