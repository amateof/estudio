public class main2 {
    public static void main(String[] args) {
        boolean booleano1 = true, booleano2 = false;

        //And: resultado false porque una de las dos es false (true si las dos fueran true)
        boolean resultado1 = booleano1 && booleano2;
        //Or; true porque una de las dos es true 
        boolean resultado2 = booleano1 || booleano2;
        //Not: Valor contrario al proporcionado
        boolean resultado3 = !booleano1;
        boolean resultado4 = !booleano2;
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

    }
    
}
