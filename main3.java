import java.util.Scanner;

public class main3 {
    public static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("hello world");

        //Declarar variables
        int numeroEntero = 7;
        double numeroReal = 9.7;
        char caracter = 'g';
        String palabra = "fernando";
        boolean booleano = false;

        System.out.println(numeroEntero);
        System.out.println(numeroReal);
        System.out.println(caracter);
        System.out.println(booleano);
        //Pedir un numero entero en caso de un cuestionario 
        //System.out.println("Dame un numero entero");
        Scanner sn_teclado = new Scanner(System.in);
        
        //numeroEntero = sn_teclado.nextInt();

        //System.out.println("El numero introducido es:");
        //System.out.println(numeroEntero);

        //operaciones 
        //int numero1 = 2;
        //int numero2 = 3;
        //int resultado = 0;

        //resultado = numero1 + numero2;

        //System.out.println("El resultado de la suma es:"+ resultado);
        //System.out.println(numero1);
        //System.out.println(numero2);

        //int numero = 1;
        //int numero2 =4;
        //int resultado =0;
        //System.out.println("Dame un numero");
        
        //numero = sn_teclado.nextInt();

        //resultado = numero2 - numero;
        //System.out.println(resultado);
        int opcion=-1; 
        double base=0, altura=0;

        base=solicitarValor("Indica la base:");
        System.out.println("\nEl area del cuadrado es"+(base*base));
        sn_teclado.close();


    }



private static double solicitarValor(String texto) {
    System.out.print(texto);
    return entrada.nextDouble();
}

private static int menu() {
    int opcion;
    System.out.println("1-Area de un cuadrado");

    opcion=entrada.nextInt();

    return opcion;
}
}
