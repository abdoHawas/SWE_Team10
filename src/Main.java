
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;



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
                if(findSmallestPrime(inputArray) != -1)
                {
                	System.out.print("Smallest prime : ");
                	output(findSmallestPrime(inputArray));
                }
                else
                {
                	output(findSmallestPrime(inputArray));
                	System.out.println("no prime found");
				        }

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
                output(getMinimum3Numbers(inputArray));
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

    void output(int value)
    {

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

    	int n = a.length()-1;
		for (int i = 0 ; i < n ; i++)
		{
			if(a.charAt(i) != a.charAt(n))
			{
				return false ;
			}
			n--;
		}
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
    int findSmallestPrime(int[] a)
	{
        int small = -1;
		Vector<Integer> primes = new Vector<>();
		for(int i = 0 ; i < a.length ; i++ )
		{
			if(a[i]== 2 || a[i] == 3 )
			{
				primes.add(a[i]);
				continue;
			}

			for(int j = 1 ; j < (a[i] / 2)  ; j++)
			{
				if(a[i] % j == 0 )
				{
					break;
				}
				else
				{
					primes.add(a[i]);
					break;
				}
			}
		}

		if(primes.size() != 0)
		{
			Collections.sort(primes);
			small =primes.get(0);
		}

        return small;
    }

    //ID 20160266
    int getMedian(int[] a){
        return 0;
    }

    //ID 20160193
    int[] shuffle(int[] a){
        Random r = new Random();
        int[] returnValue = new int[a.length];
        System.arraycopy(a, 0, returnValue, 0, a.length);

        int j, temp;
        for (int i = 0; i < returnValue.length; i++){
            j = r.nextInt(returnValue.length);
            temp = returnValue[i];
            returnValue[i] = returnValue[j];
            returnValue[j] = temp;
        }
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
  
  //20160359
	public static int[] getMaximum3Numbers(String inputString) {
		//	System.out.println(inputString);
			String[] str_array= inputString.split(" ");
			
			int[] arr= new int [str_array.length];
			int []max_nums = new int [3];
			String s="";
			int f=0;
			for(int i=0;i<str_array.length;i++) {
				s=str_array[i];
				if((str_array[i].toCharArray()[0]>='a'&& str_array[i].toCharArray()[0]<='z') || 
						(str_array[i].toCharArray()[0]>='A'&& str_array[i].toCharArray()[0]<='Z' ) ){
					f=1;
				System.out.println("Array must be numbers only");
				break;
				}
				else {
					
					arr[i]= Integer.parseInt(str_array[i]);
					
			int max_number=arr[arr.length-1];
			
			}
				
				}
		//	arr=sort(arr); 
			Arrays.sort(arr);
			max_nums[0]=arr[arr.length-1];
			max_nums[1]=arr[arr.length-2];
			max_nums[2]=arr[arr.length-3];	
			if(f!=1) {
			System.out.println(max_nums[2] + " -- " + max_nums[1] + " -- " + max_nums[0]);
			}
			return max_nums;
	
		}

    //ID 20160316
    int countPrimes(int[] a){
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            flag = true;
            int n = a[i];
            for (int j = 2; j <= n / 2; ++j) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
            if ((n == 0) || (n == 1)) {
                flag = false;
            }
            if (flag) {
                counter++;
            }
        }
        return counter;
    }
}
