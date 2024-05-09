
public class numero {
    public static void main(String[] args) {
        double[] array = { 19, 12.89, 16.5, 200, 13.7 };
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total = total + array[i];

        }
        double average = total / array.length;
        System.out.println(total);
        System.out.println(average);
    }
}