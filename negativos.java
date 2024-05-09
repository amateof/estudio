import java.util.Scanner;

public class negativos{
     public static void main(String[] args) {

        Scanner sn_teclado = new Scanner(System.in);

    
        int n = 0;
        int m = 0;
        int suma1 =0;
        int suma2 =0;
        System.out.println("Dame un numero");
        n = sn_teclado.nextInt();
        System.out.println("Dame otro numero");
        m = sn_teclado.nextInt();

        for(int i =1; i<=n; i++){

            if(n % i == 0){
            System.out.println(i);
            suma1 +=i;
            
    }
        }
        for(int j = 1; j<=m; j++){
            if(m % j ==0){
                System.out.println(j);
                suma2 +=j;
                
            }
        }
             if (suma1 == suma2){
            System.out.println("son hermanos");
           } else {
            System.out.println("no son hermanos");
           }
        

        }
}
