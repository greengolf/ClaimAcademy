package Homework.LabTwo;

public class Seven {
    public static void main(String[] args) {
        //7.	Write a method "isPrime" which takes an integer and returns true if it is a prime number. Your method MUST call the "isFactor" method you wrote for problem #5.
        int k = 6;
        isPrime(k);
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
        public static boolean isPrime(int k) {

            if (k == 1){
                return true;
            }
            else{
                for (int i=2; i < k; i++){
                    if (isFactor(i, k)){
                        if (i != 1){
                            return false;
                        }
                        else{
                            return true;
                        }
                    }
                }
            }
        }
}
