import java.util.Scanner;
public class AreaR {
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
        
        double base;
        double altura;
        System.out.println("Dame la base");
        base = sn_teclado.nextInt();
        System.out.println("Dame la altura");
        altura = sn_teclado.nextInt();
        
        System.out.println("El area del rectangulo es\n"+ (base*altura));
        sn_teclado.close();
}
}
