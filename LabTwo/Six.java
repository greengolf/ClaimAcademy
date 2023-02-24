package Homework.LabTwo;

public class Six {
    public static void main(String[] args) {
        //6.	Write a method "isPerfect" which takes an integer and returns true if that integer is a perfect number Your method MUST call the "isFactor" method you wrote for problem #5.
        int k = 28;
        isPerfect(k);
    }
    public static boolean isPerfect(int k) {
        
        int sumOfFactors = 0;

        for (int i = 1; i < k; i++) {
            if (isFactor(i, k)) {
                sumOfFactors += i;
            }

        }

        System.out.println(sumOfFactors);
    

        if (sumOfFactors == k) {
            System.out.println("True");
            return true;
        } 
        else {
            System.out.println("False");
            return false;
        }
    }
    public static boolean isFactor(int k, int n) {
        if (n % k == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
