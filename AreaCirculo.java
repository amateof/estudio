    import java.util.Scanner;
    
public class AreaCirculo {
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
        
        
        double r;
        System.out.println("Dame el radio");
        r = sn_teclado.nextInt();
        
        System.out.println("El area del circulo es\n"+ (Math.PI*Math.pow(r, 2)));
        sn_teclado.close();
}
}
