import java.util.Scanner;
public class hortalizas {
    public static void main(String[] args){
        

        char pais, hortaliza =0;
        int toneladas = 0;
        Scanner sn_teclado = new Scanner(System.in);

        int total_e = 0, total_f = 0, total_a = 0;

        System.out.println("Introduce Pais (E, F, A) Hortaliza (T,P,E) y cantidad de toneladas a continuacion");

        do {
            pais = sn_teclado.next() .charAt(0);
            
            if (pais != '@'){
                hortaliza = sn_teclado.next() .charAt(0);
                toneladas = sn_teclado.nextInt();
            }
            
            switch(pais){
                case 'E':
                if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E')
                total_e += toneladas;
                break;
                case 'F':
                if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E')
                total_f += toneladas;
                break;
                case 'A':
                if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E')
                total_a += toneladas;
                break;
            default:
            break;
            }
        }while (pais != '@');

            if(total_e > total_f && total_e > total_a) {
                System.out.println("El pais que mas vende es España con un total de"+ total_e + "toneladas.");
            } else if (total_f > total_e && total_f > total_a){
                System.out.println("El pais que mas vende es Francia con un total de"+ total_f+"toneladas.");
            } else {
                System.out.println("El pais que mas vende es Alemania con un total de" + total_a + "toneladas.");
            }
sn_teclado.close();
        }
    }

    
        