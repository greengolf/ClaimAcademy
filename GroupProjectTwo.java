package Homework;

import java.util.Scanner;

public class GroupProjectTwo{

    public static void main(String[] args){

        //1. Create a program that converts the US Dollar into different currencies around the world. The minimum countries that you can use in the program are three, one for each member of the group.
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount of money you wish to exchange:");
        String userNum = in.next();
        double amount = Double.parseDouble(userNum);
        in.close();

        exchangeRate(amount);

    

    }
    public static void exchangeRate(double amount) {
        double chineseYuan = amount * (1/0.15);
        double nepaleseRupee = amount * (1/0.0076);
        double ugandanShilling = amount * (1/0.00027);
        
        System.out.printf("%.2f",chineseYuan);
        System.out.println();
        System.out.printf("%.2f",nepaleseRupee);
        System.out.println();
        System.out.printf("%.2f",ugandanShilling);
}
    }
    
