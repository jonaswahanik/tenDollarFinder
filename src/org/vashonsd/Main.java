package org.vashonsd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // creates new scanner

        System.out.println("Enter amount of money in dollars");
        //asks for amount of money

        double startingMoney = scan.nextDouble();
        //scans what the user said

        int amountOfTens = (int) (startingMoney / 10);
        // finds amount of tens and casts to an int

        System.out.println("You will have " + amountOfTens + " ten dollar bills");
        // prints amount of 10 dollar bills

        double change = startingMoney - (10 * amountOfTens);
        // finds change

        String changeRounded = String.format("%.2f", change);
        // rounds change to 2 decimal points

        System.out.println("You will have " + changeRounded + " dollars in change" );
        // prints change

    }
}
