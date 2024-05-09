import java.util.Scanner;
public class AreaT {
    public static void main(String[] args){
        Scanner sn_teclado = new Scanner(System.in);
        
        double base;
        double altura;
        System.out.println("Dame la base");
        base = sn_teclado.nextInt();
        System.out.println("Dame la altura");
        altura = sn_teclado.nextInt();
        
        System.out.println("El area del triangulo es\n"+ (base*altura/2));
        sn_teclado.close();
}
}
