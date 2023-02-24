package Homework.LabTwo;


public class One {
    public static void main(String[] args) {
        //1.	Write a method called "max3" that finds the largest of THREE integers.
        int a = 0;
        int b = 0;
        int c = 0;
        max3(a, b, c);
    }

        
        public static int max3(int a, int b, int c) {
            //take the three integers, read them, and find the largest
            if (a >= b && a >= c) {
                System.out.println(a);
                return a;
            }
            else if (b >= a && b >= c) {
                System.out.println(b);
                return b;
            }
            else {
                System.out.println(c);
                return c;
            }
        }
}