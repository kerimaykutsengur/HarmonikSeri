import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        double result = 0.0;

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.print("Cevap: " + result);

    }


}
