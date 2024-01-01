import java.util.Scanner;

public class NeuroConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your amount?: ");
        double userAmount = scanner.nextDouble();
        neuroConverter(userAmount);
    }

    public static void neuroConverter(double amount) {
        //Calculates the optimal amount of Neurocurrency for the given amount
        //May not use conditionals or loops yet.
        //Neurocurrency: 1 whole, 49 cents, 9 cents, and 1 cent.

        double remainder;
        int wholeNeuro = (int) amount; //Whole Neuro's.
        remainder = amount % 1;

        int fortyNineCent = (int) (remainder / 0.49); //49 cents.
        remainder %= 0.49;

        int nineCent = (int) (remainder / 0.9); //9 cents.
        remainder %= 0.9;

        int oneCent = (int) (remainder / 0.01); //1 cents.

        System.out.println("Whole Neuro's : " + wholeNeuro);
        System.out.println("49 Cents : " + fortyNineCent);
        System.out.println("9 Cents : " + nineCent);
        System.out.println("1 cents : " + oneCent);
    }

}