import java.util.Scanner;

public class ejercicios3 {
    public static void main(String[] args) {
        Scanner sn_teclado = new Scanner(System.in);   
            // Resolver ecuación de segundo grado ax^2+bx+c=0
            // Declarar variables//
            double a, b, c;
            double x1, x2, d;
            
            System.out.println("Introduzca el primer coeficiente (a): ");
            a = sn_teclado.nextInt();
            System.out.println("Introduzca el segundo coeficiente (b): ");
            b = sn_teclado.nextInt();
            System.out.println("Introduzca el tercer coeficiente (c): ");
            c = sn_teclado.nextInt();
            
            // Formular la operación
            d = ((b*b)-(4*a*c));
            if(d < 0){
                System.out.println("No existe solución real.");
            }else{
                
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                
                System.out.println("La solución de x1 es: "+x1);
                System.out.println("La solución de x2 es: "+x2);
            }


        

        //if(numero %2 == 0) {
          //  System.out.println("es par");
              
            //} else {
               // System.out.println("es impar");
            //}

        }
    }

