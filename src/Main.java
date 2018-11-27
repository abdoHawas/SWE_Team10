import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    String[] options = {
            "Most repeated value",
            "Sort",
            "Shuffle",
            "Find largest prime",
            "Find smallest prime",
            "Check palindrome",
            "Check sorted",
            "Count primes",
            "Reverse array",
            "Shift array",
            "Distinct array",
            "Maximum 3 numbers",
            "Minimum 3 numbers",
            "Get average",
            "Get median",
            "Return only primes",
            "Zero if less than zero",
            "ALL",
            "EXIT",
    };

    public static void main(String[] args) {
        Main m = new Main();
        m.start();
    }

    void start(){
        while(true){
            //Prompt user:
            output("Select your choice:");
            for (int i = 0; i < options.length; i++){
                output("" + i + ". " + options[i]);
            }
            int choice = inputInteger();
            checkChoice(choice);
        }
    }

    void checkChoice(int choice){
        int[] inputArray;
        String inputString;
        switch(choice){
            case 1:
                inputArray = inputIntegerArray();
                output(mostRepeatedValue(inputArray));
                break;
            case 2:
                inputArray = inputIntegerArray();
                output(sort(inputArray));
                break;
            case 3:
                inputArray = inputIntegerArray();
                output(shuffle(inputArray));
                break;
            case 4:
                inputArray = inputIntegerArray();
                output(findLargestPrime(inputArray));
                break;
            case 5:
                inputArray = inputIntegerArray();
                output(findSmallestPrime(inputArray));
                break;
            case 6:
                inputString = inputCharacterArray();
                output(isPalindrome(inputString));
                break;
            case 7:
                inputArray = inputIntegerArray();
                output(checkSorted(inputArray));
                break;
            case 8:
                inputArray = inputIntegerArray();
                output(countPrimes(inputArray));
                break;
            case 9:
                inputArray = inputIntegerArray();
                output(reverseArray(inputArray));
                break;
            case 10:
                inputString = inputCharacterArray();
                output(shiftArray(inputString));
                break;
            case 11:
                inputArray = inputIntegerArray();
                output(isDistinctArray(inputArray));
                break;
            case 12:
                inputArray = inputIntegerArray();
                output(getMaximum3Numbers(inputArray));
                break;
            case 13:
                inputArray = inputIntegerArray();
                output(getMaximum3Numbers(inputArray));
                break;
            case 14:
                inputArray = inputIntegerArray();
                output(getAverage(inputArray));
                break;
            case 15:
                inputArray = inputIntegerArray();
                output(getMedian(inputArray));
                break;
            case 16:
                inputArray = inputIntegerArray();
                output(returnOnlyPrimes(inputArray));
                break;
            case 17:
                inputArray = inputIntegerArray();
                output(zeroIfLessThanZero(inputArray));
                break;
            case 18:
                //ALL
                for (int i = 0; i <= 17 && i < options.length; i++){
                    output("Program #" + i + ":" + options[i]);
                    checkChoice(i);
                }
                break;
            case 19:
                //EXIT
                System.exit(0);
        }
    }

    //======================================================
    //=======  The following functions are there  ==========
    //=======  to make input/output easier.       ==========
    //=======  Please do not use them except      ==========
    //=======  in the start() function.           ==========
    //======================================================

    int inputInteger(){
        int returnValue;
        output("Enter an integer:");
        returnValue = in.nextInt();
        in.nextLine();
        return returnValue;
    }

    int[] inputIntegerArray(){
        int[] returnValue;
        output("Enter an integer array seperated by spaces:");
        String input = in.nextLine();
        String[] integers = input.split(" ");
        returnValue = new int[integers.length];
        for (int i = 0; i < integers.length; i++)
            returnValue[i] = Integer.parseInt(integers[i]);
        return returnValue;
    }

    String inputCharacterArray(){
        String returnValue;
        output("Enter a character array (string):");
        returnValue = in.nextLine();
        return returnValue;
    }

    void output(boolean value){
        System.out.println(value ? "True" : "False");
    }

    void output(int[] value){
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    void output(int value){
        System.out.println(value);
    }

    void output(double value){
        System.out.println(value);
    }

    void output(char[] value){
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    void output(CharSequence value){
        System.out.println(value);
    }

    //======================================================
    //======================================================

    //ID 20160127
    boolean isPalindrome(String a){
        // You can convert to array to do your operations
        // Numbers are also strings :)
        return true;
    }

    //ID 20160249
    int[] zeroIfLessThanZero(int[] a){
        int[] returnValue = new int[0];
        return returnValue;
    }

    //ID 20160171
    boolean isDistinctArray(int[] a){
        return true;
    }

    //ID 20160232
    int[] returnOnlyPrimes(int[] a){
        int[] returnValue = new int[0];;
        return returnValue;
    }

    //ID 20160233
    int findSmallestPrime(int[] a){
        return 0;
    }

    //ID 20160266
    int getMedian(int[] a){
        return 0;
    }

    //ID 20160193
    int[] shuffle(int[] a){
        int[] returnValue = new int[0];
        return returnValue;
    }

    //ID 20160037
    int mostRepeatedValue(int[] a){
        return 0;
    }

    //ID 20160473
    int[] reverseArray(int[] a){
        int[] returnValue = new int[0];;
        return returnValue;
    }

    //ID 20160042
    boolean checkSorted(int[] a){
        return true;
    }

    //ID 20160054
    String shiftArray(String a){
        // You can convert to array then convert back to string to return
        // Numbers are also strings :)
        return "";
    }

    //ID 20160324
    int[] getMinimum3Numbers(int[] a){
        int[] returnValue = new int[0];;
        return returnValue;
    }

    //ID 20160170
    int findLargestPrime(int[] a){
        return 0;
    }

    //ID 20160313
    int[] sort(int[] a){
        int[] returnValue = new int[0];;
        return returnValue;
    }

    //ID 20160316
    int countPrimes(int[] a){
        return 0;
    }

    //ID 20160157
    double getAverage(int[] a){
        return 0;
    }

    //ID 20160359
    int[] getMaximum3Numbers(int[] a){
        int[] returnValue = new int[0];;
        return returnValue;
    }
}
