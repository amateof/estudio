import java.util.Scanner;

public class bucle {
    public static void main(String[] args){
         Scanner sn_teclado = new Scanner(System.in);
        
        switch(sn_teclado.nextInt() ) {

case 1:System.out.println("Lunes");break;

case 2:System.out.println("Martes");break;

case 3:System.out.println("Miércoles");break;

case 4: System.out.println("Jueves"); break;

case 5:System.out.println("Viernes"); break;

case 6: System.out.println("Sábado"); break;

case 7:System.out.println("Domingo");break;

default:System.out.println("Error. Dia incorrecto.");break;
    }
}
}