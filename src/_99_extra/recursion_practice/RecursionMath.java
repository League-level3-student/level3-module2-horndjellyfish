package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        //2. if times is 1
        if (times == 1) {
            //3. return number
            return number;
        } else {
            //4. else return number + recursionMultiplication(number, times-1)
            return number + recursiveMultiplication(number, times - 1);
        }
    }

    //6. Try this one on your own!
    //Hint: if numberToDivideBy is bigger than number, you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
        if (numberToDivideBy == 1) {
            return number;
        } else {
            return number - recursiveDivision(number, numberToDivideBy - 1);
        }
    }

    public static int Division(int n, int b) {
        int result;
        if (n - b < n) {
            result = n;
        }
        else {
            result = n - Division(b, (n / b));
        }
        return result;
    }


    //8. Try this one on your own!
    public static int recursivePower(int number, int power) {
        if (power == 0) {
            return -1;
        } else {
            return number + recursivePower(number, power - 1);
        }
    }


    @Test
    public void testMultiplication() {
        assertEquals(12, recursiveMultiplication(3, 4));
        //1  Add more JUnit tests like the one above to test your method
        assertEquals(25, recursiveMultiplication(5, 5));
        assertEquals(80, recursiveMultiplication(8, 10));
    }


    @Test
    public void testDivision() {
        //5  Add JUnit tests to test your method
        assertEquals(2, Division(2, 1));
        assertEquals(4, recursiveDivision(8, 2));
        assertEquals(6, recursiveDivision(66, 11));
    }


    @Test
    public void testPower() {
        //7  Add JUnit tests to test your method

    }

}
