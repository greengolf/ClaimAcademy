package Homework.LabTwo;

public class Three {
    
    public static void main(String[] args) {
        //3.	Write a method called "middle3" that computes the MIDDLE value of THREE integers. Hint: for the case of three numbers, the middle is the value that is NOT the maximum NOR the minimum, so add the three values and subtract out the min and max, using the methods you wrote for problems #1 and #2.
        int a = 4;
        int b = 5;
        int c = 6;
        middle3(a, b, c);
    
    }


    public static void middle3(int a, int b, int c) {
        int max = 0;
        int min = 0;
        
        for (int i=0; i < 2; i++) {
        if (a >= b && a >= c) {
            max =  a;
        }
        else if (b >= a && b >= c) {
            max = b;
        }
        else if (c >= a && c >= b){
            max = c;
        }
        else if (a <= b && a <= c) {
            min = a;
        }
        else if (b <= a && b <= c) {
            min = b;
        }
        else {
            min = c;
        }
    }

        if (max == a && min == b) {
            System.out.println(c);
        }
        else if (max == a && min == c) {
            System.out.println(b);
        }
        else if (max == b && min ==a) {
            System.out.println(c);
        }
        else if (max == b && min == c) {
            System.out.println(a);
        }
        else if (max == c && min == a){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }

        }

    }

