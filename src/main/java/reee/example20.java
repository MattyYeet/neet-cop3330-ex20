package reee;

import java.util.Formatter;
import java.util.Scanner;

public class example20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double amount, wtax, itax, total, WTAX, ITAX;
        System.out.print("What is the order amount? ");
        amount = input.nextDouble();
        input.nextLine();
        System.out.print("What state do you live in? ");
        String state = input.nextLine();
        System.out.print("What county do you live in? ");
        String county = input.nextLine();
        wtax = 0.05;
        itax = 0.08;
        wtax = (county.equals("Dunn")) ? (wtax + 0.005): wtax;
        wtax = (county.equals("Eau Claire")) ? (wtax + 0.004): wtax;
        WTAX = amount * wtax;
        ITAX = amount * itax;
        Formatter fmt = new Formatter();
        Formatter wtotal = new Formatter();
        Formatter itotal = new Formatter();

        if(state.equals("Wisconsin"))
        {
            fmt.format("%.2f", WTAX);
            total = amount + WTAX;
            wtotal.format("%.2f", total);
            System.out.print("The tax is $"+fmt+".\nThe total is $"+wtotal+".");
        }
        else if(state.equals("Illinois"))
        {
            fmt.format("%.2f", ITAX);
            total = amount + ITAX;
            itotal.format("%.2f", total);
            System.out.print("The tax is $"+fmt+".\nThe total is $"+itotal+".");
        }
        else
        {
            itotal.format("%.2f", amount);
            System.out.println("The total is $"+itotal+".");
        }
    }
}
