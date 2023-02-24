package Homework.LabTwo;

public class Four {
    public static void main(String[] args) {
        //4.	Write a method called "xor" that takes two boolean values (either true or false) and returns a boolean value which is true if EITHER of the values is true BUT NOT BOTH of them. This is called the "xor" function, or "eXclusive OR" (where we are excluding the case where both values are true).

        boolean bool = false;
        boolean bool1 = false;
        xor(bool, bool1);
    }
    public static boolean xor(boolean bool, boolean bool1) {
        if (bool == true && bool1 == false) {
            System.out.println("true");
            return true;
        }
        else if (bool == false && bool1 == true) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
