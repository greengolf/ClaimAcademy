package Homework;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) {
        
        //1.    Write a method to prompt the user to enter the radius of the circle then calculate the area and circumference of the circle.
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Enter the radius:");
        String userNum = in.next();
        int userInt = Integer.parseInt(userNum);
        in.close();

        int answer = area(userInt);
        int answer2 = circumference(userInt);

        System.out.println(answer);
        System.out.println(answer2);
        
        
    public static int area(int userInt) {
                
        double Area = 3.14 * userInt * userInt;

        return Area;
    }
    public static int circumference(int userInt) {
        
        double Circumference = 3.14 * 2 * userInt;
        
        return Circumference;
    }

        //2.    Write a method to prompt the user for base-width and height of a triangle, then calculate the area of the Triangle.
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the base:");
        String userNum = in.next();
        int userInt = Integer.parseInt(userNum);
        
        System.out.println("Enter the height:");
        String userNum1 = in.next();
        int userInt1 = Integer.parseInt(userNum1);
        in.close();

        int answer = area(userInt, userInt1);
        System.out.println(answer);

        public static int area(int userInt, int userInt1){

        int Area = (1/2) * userInt * userInt1;
        return Area;
        }

        //3.    Write a method to prompt the user for a number then display check if the number is Even or Odd.
        Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		double number = in.nextDouble();
		
		if (number % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");

    }
        //4.    Write a method to prompt the user for an Integer then display the same value with one decimal place. eg user enter "15 " result is: "You entered 15, the new value is 15.0".    
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Integer:");
        String userNum = in.next();
        int userInt = Integer.parseInt(userNum);
        System.out.println("You entered" + userInt + ", the new value is " + "%.1f" , userInt);

        //5.    Write a method to prompt the user for a letter of the alphabet and display it's ascii value.
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a letter:");
        char userNum = in.next();
        int ascii = userNum;
        System.out.println("The ASCII value of " + userNum + "is: " ascii);
        
        //6.    Write a method to prompt the user for a double then display the value as a whole number. eg user enter "15 .8" result is: "You entered 15.8, the new value is 16". eg user enter "15 .4" result is: "You entered 15.4, the new value is 15".
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a double:");
        String userNum = in.nextDouble();
        double userDouble = Integer.parseInt(userNum);
        in.close();

        int wholeNumber = Math.round(userDouble);
        System.out.println(wholeNumber);

        //7. Write a method to prompt the user for 4 digits representing a year. Then determine If Year Is a Leap Year.
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a 4 digit year:");
        String userNum = in.next();
        int userInt = Integer.parseInt(userNum);
        in.close();

        if(userInt % 4 == 0){
            if(userInt % 100 == 0){
                if(userInt % 400 == 0){
                    System.out.println("This year is a leap year.");
                }
                else{
                    System.out.println("This year is not a leap year.");
                }
            }
            else{
                System.out.println("This year is a leap year.");
            }
        }
        else {
            System.out.println("This year is not a leap year.");
        }
}
}