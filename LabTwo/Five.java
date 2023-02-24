package Homework.LabTwo;

public class Five {
    public static void main(String[] args) {
        //5.	Write a method "isFactor" which takes two integers (k and n) and returns true if ("if and only if") k is a factor of n.
        int k = 3;
        int n = 6;
        isFactor(k,n);
    }
    public static boolean isFactor(int k, int n) {
        if (n % k == 0) {
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }
    
}
