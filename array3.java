import java.util.Scanner;

public class array3 {
     public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
         int /*array2Int[][] =*/ array2 [][] = new int [][] {{58,52,45,12,65},{64,35,16,45,63},{97,98,59,21,53}};
         int n; 
         n=sn_teclado.nextInt();
        /* for (int x = 0; x<array2.length; x++){
          for (int j = 0; j<array2[x].length; j++){ 
              System.out.print(array2[x][j] + " ");
           /*  for (int array2[]: array2Int){
                System.out.println(Arrays.toString(array2));
            }*/
            boolean encontrado = false;
            
        for(int i= 0; i<array2.length; i++ ){
          boolean salir =false;
          for(int j=0; j<array2[i].length; j++){
          if(array2[i][j]==n ){
            salir=true;
            encontrado = true;
          }
          }
          if (salir) {System.out.println("esta");} else{
            System.out.println("no esta");
          }
          }
          
        
          //System.out.println();

        } 
        
        
}

     