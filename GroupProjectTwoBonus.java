package Homework;

import java.util.Scanner;

public class GroupProjectTwoBonus{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount of money you wish to exchange:");
        
        String amount = in.next();
        double amount1 = Double.parseDouble(amount);

        System.out.println("Enter your choice");
        System.out.println("1 - for amount in Chinese Yuan");
        System.out.println("2 - for amount in Nepalese Rupees");
        System.out.println("3 - for amount in Ugandan Shilling");
        String userNum = in.next();
        int userInt = Integer.parseInt(userNum);
        in.close();

        if (userInt == 1)  {
            
            double amount2 = amount1 * (1/0.15); 
            System.out.printf("%.2f", amount2);
        }
        else if (userInt == 2) {

        
            double amount2 = amount1 * (1/0.0076);
            System.out.printf("%.2f", amount2);
        }
        
        else if (userInt == 3) {
            double amount2 = amount1 * (1/0.00027);
            System.out.printf("%.2f", amount2);
        }

    }
}
