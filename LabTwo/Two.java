package Homework.LabTwo;

public class Two {
    public static void main(String[] args) {
        //2.	Write a method called "min3" that finds the smallest of THREE Integers. 
        int a = 0;
        int b = 0;        
        int c = 0;
        
        min3(a, b, c);
    }
    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println(a);
            return a;
        }
        else if (b <= a && a <= c) {
            System.out.println(b);
            return b;
        }
        else {
            System.out.println(c);
            return c;
        }
        }
   }

