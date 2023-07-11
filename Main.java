import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        int[] numbers = {5, 10, 1, 32, 3, 45};

        int min = Arrays.stream(numbers).min().getAsInt();

        System.out.println("Min number: " + min);
    }
}
