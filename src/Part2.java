import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Part2 {
    public static void main(String[] args) {
        int numOfCups;
        int numOfCakes;
        double tax = 0.15;
        double coffeePrice = 1.25;
        double cakePrice = 3.25;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!");
        System.out.print("Enter the number of cups: ");
        numOfCups = input.nextInt();

        System.out.println("Enter the number of cakes ");
        numOfCakes = input.nextInt();

        double preTax = coffeePrice * numOfCups + cakePrice * numOfCakes;
        double finalTotal = preTax + preTax*tax;

        System.out.println("Your pretax total is $ " + preTax);
        System.out.println("Your final total is $ " + finalTotal);
    }
}