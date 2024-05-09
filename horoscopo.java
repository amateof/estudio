import java.util.Scanner;

public class horoscopo {
    public static void main(String[] args){
    Scanner sn_teclado = new Scanner(System.in);
    int dia;
    int mes;

    System.out.println("Introduce un dia");
    dia = sn_teclado.nextInt();
    System.out.println("Introduce un mes");
    mes = sn_teclado.nextInt();

    if ( mes == 3 && dia >= 21 || mes == 4 && dia <=20){
    System.out.println("tu signo del zodiaco es Aries");
}else if (mes == 4 && dia >= 21 || mes == 5 && dia <=21) {    
    System.out.println("tu signo del zodiaco es Tauro");
}else if (mes == 5 && dia >= 22 || mes == 6 && dia <=22) {
    System.out.println("tu signo es Geminis");
}else if (mes == 6 && dia >= 21 || mes == 7 && dia <=23) {
    System.out.println("tu signo del zodiaco es Cancer");
}else if (mes == 7 && dia >= 24 || mes == 8 && dia <=23){
    System.out.println("tu signo del zodiaco es Leo");
}else if (mes == 8 && dia >= 24 || mes == 9 && dia <=23){
    System.out.println("tu signo del zodiaco es Virgo");
}else if (mes == 9 && dia >= 24 || mes == 10 && dia <=23){
    System.out.println("tu signo del zodiaco es Libra");
}else if (mes == 10 && dia >= 24 || mes == 11 && dia <=22){
    System.out.println("tu signo del zodiaco es Escorpio");
}else if (mes == 11 && dia >= 23 || mes == 12 && dia <=21){
    System.out.println("tu signo del zodiaco es Sagitario");
}else if (mes == 12 && dia >= 22 || mes == 1 && dia <=20){
    System.out.println("tu signo del zodiaco es Capricornio");
}else if (mes == 1 && dia >= 21 || mes == 2 && dia <=19){
    System.out.println("tu signo del zodiaco es Acuario"); 
}else if (mes == 2 && dia >= 20 || mes == 3 && dia <=20){
    System.out.println("tu signo del zodiaco es Piscis"); }
    sn_teclado.close();
}
}