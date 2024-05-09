import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
       
        double resultado = Area();
        System.out.println(resultado);
        
    }
    




    public static double Area() {
         Scanner sn_teclado = new Scanner(System.in);
        System.out.println("Dame la base");
        double base = sn_teclado.nextDouble();
        System.out.println("Dame la altura");
        double altura = sn_teclado.nextDouble();
       double area = base *altura;
         return area;
    }
}


    