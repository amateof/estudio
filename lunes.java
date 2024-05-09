import java.util.Random;
import java.util.Scanner;

public class lunes {
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
         int n;
         System.out.println("dame las filas");
         n = sn_teclado.nextInt();
         System.out.println("dame las columnas");
         int m; 
         m = sn_teclado.nextInt();

        int array2 [][] = new int [n][m];
        System.out.println("rellena el array");
        for (int i = 0; i<n; i++){
            for(int x =0; x<m; x++){
               // System.out.println("Introduzca el elemento [" + i + "," + x + "]");
               // array2[i][x] = sn_teclado.nextInt();
                if(i==0 || i==n -1 || x==0 || x == m-1){
                    array2[i][x]=1;
                } else{
                    array2[i][x]=0;
                }
            }
            }
            for (int i =0; i<n; i++){
                for(int x=0; x<m; x++){
                    System.out.print(array2[i][x] + " ");
                }
                 System.out.println();
            }
           
            }

        }
    

 