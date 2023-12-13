import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("Converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

        // Miles to Cash | Used to test the getCashValue() method
        /*
        var scanner2 = new Scanner (System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a miles value to convert to cash: ");
        var milesInput = scanner.nextLine();
        int milesValue;

        try {
            milesValue = Integer.parseInt(milesInput);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as an integer, exiting");
            return;
        }

        System.out.println("Converting " + milesInput + " to cash value");
        var rewardsValue2 = new RewardValue(milesValue);
        System.out.println(milesInput + " miles are worth $" + rewardsValue2.getCashValue());
        */
    }
}