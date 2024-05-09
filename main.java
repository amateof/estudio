public class main {
    public static void main(String[] args) {
        //Aquí imprimo un Hola Mundo
        System.out.println("Hello world!");
        //String es el tipo de dato cadena de texto
        String myString = "Esto es una cadena de texto";
        //He cambiado el valor dado al string
        myString = "Aquí cambio el valor de la cadena de texto";
        System.out.println(myString);
        //int es el comando usado para un número entero
        int myInt = 7;
        //Sumo 4 a myInt
        myInt = myInt +4;
        System.out.println(myInt);
        //Double es utilizado para números decimales
        Double myDouble = 6.5;
        System.out.println(myDouble);
        //Float también es usado para decimales. Double es el usado por defecto para Java. La f tras el numero sirve para espificar que es un float
        Float myFloat =6.5f;
        System.out.println(myFloat);
        //Aqui he sumado todos los numeros.
        System.out.println(myDouble + myInt + myFloat);
    }
}