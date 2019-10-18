package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    public enum Gender {
        MALE,
        FEMALE;
    }

    /**
     * Converts an Integer into array of ints
      * @param number
     * @return
     */
    public static int[] splitAndReverseInteger(Integer number) {
        //get digit rank and initialize result array
        int digitRank = (int) (Math.log10(number) + 1);
        int[] result;
        if (digitRank < 0) {
            result = new int[1];
        } else {
            result = new int[digitRank];
        }
        int index = 0;
        int counter = digitRank;
        while (counter > 0) {
            result[index] = number % 10;
            number = number / 10;
            index++;
            counter--;
        }
        return result;
    }

    /**
     * Validates an Integer input (in range 0-1000)
     * @return
     */
    public static int validateIntInput() {
        System.out.println("Enter any integer between 0 and 1000: ");
        boolean flag = false;
        int number = 0;
        while (!flag) {
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("It is not an integer! Please repeat enter:");
                continue;
            }

            if (number < 0) {
                System.out.println("Number can not be negative. Please repeat enter:");
            } else if (number > 1000) {
                System.out.println("Number can not be > 1000. Please repeat enter:");
            } else {
                flag = true;
            }
        }
        return number;
    }

    /**
     * SumUps all the digits in an integer
     * @param number
     * @return
     */
    public static int sumUpDigits(int number) {
        int result = 0;
        int[] array = splitAndReverseInteger(number);
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    /**
     * Reverses a string
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        char[] charsReversed = new char[chars.length];
        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
            charsReversed[j] = chars[i];
        }
        return new String(charsReversed);
    }

    /**
     * Defines is a number palindrome or not
     * @param number
     * @return
     */
    public static boolean isPalindrome(Integer number) {
        if (number < 0) {
            return false;
        } else {
            int[] reverse = splitAndReverseInteger(number);
            String reversedIntStr = "";
            for (int i : reverse) {
                reversedIntStr += i;
            }
            Integer newInt = new Integer(reversedIntStr);
            if (number.equals(newInt)) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Provides statistics of different characters inside a string
     * @param input
     */
    public static void analyseString(String input) {

        char[] chars = input.toCharArray();

        int counterLetters = 0;
        int counterSpaces = 0;
        int counterNumbers = 0;
        int counterOther = 0;

        for (char c : chars) {
            if (Character.isLetter(c))
                counterLetters++;
            else if (Character.isSpaceChar(c)) {
                counterSpaces++;
            } else if (Character.isDigit(c)) {
                counterNumbers++;
            } else {
                counterOther++;
            }
        }
        System.out.println("Letters: " + counterLetters);
        System.out.println("Spaces: " + counterSpaces);
        System.out.println("Numbers: " + counterNumbers);
        System.out.println("Other: " + counterOther);
    }

    /**
     * Reverses head of an array (till a specified index) and returns the whole modified array
     * @param array
     * @param reverseTo
     * @return
     */
    public static int[] reverseSubArray(int[] array, int reverseTo) {
        int[] result = new int[array.length];
        result = Arrays.copyOf(array, array.length);
        int[] subarray = new int[reverseTo];
        subarray = Arrays.copyOfRange(array, 0, reverseTo);

        int[] subArrayReversed = new int[subarray.length];
        for (int i = subarray.length - 1, j = 0; i >= 0; i--, j++) {
            subArrayReversed[j] = subarray[i];
        }
        for (int i = 0; i < subArrayReversed.length; i++) {
            result[i] = subArrayReversed[i];
        }
        return result;
    }

    /**
     * Sorts an array using reverseSubArray method
     * @param array
     * @return
     */
    public static int[] sortArray(int[] array) {

        //get copy of array to be processed
        int[] result = new int[array.length];
        result = Arrays.copyOf(array, array.length);

        //the length of sub-array to be reversed.
        //also this is criteria to stop algorithm
        int lengthToReverse = result.length;

        //Parameters of max value
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = -1;

        //get maxValue and maxValueIndex for the first times
        for (int i = 0; i < lengthToReverse; i++) {
            if (result[i] > maxValue) {
                maxValue = result[i];
                maxValueIndex = i;
            }
        }

        //the basic algorithm
        while (lengthToReverse > 1) {

            //perform reverse
            if (maxValueIndex == 0) {

                //if maxValue is already on 0 index, then do the full reverse
                result = reverseSubArray(result, lengthToReverse);
                lengthToReverse--;
                maxValue = Integer.MIN_VALUE;
                maxValueIndex = -1;
            } else {

                //if maxValue not on 0 index, do reverse till the actual index of maxValue
                result = reverseSubArray(result, maxValueIndex + 1);
                maxValue = Integer.MIN_VALUE;
                maxValueIndex = -1;
            }

            //get new maxValue and maxValueIndex after reverse
            for (int i = 0; i < lengthToReverse; i++) {
                if (result[i] > maxValue) {
                    maxValue = result[i];
                    maxValueIndex = i;
                }
            }
        }
        return result;
    }

    /**
     * Analyses an array of different objects
     * @param array
     */
    public static void processArrayOfObjects(Object[] array) {

        String stringResult = "";
        Double sumDoubles = 0.0;
        Integer sumIntegers = 0;
        Long sumLongs = 0l;
        Float sumFloats = 0f;
        Double sumNumbers = 0.0;

        Person[] personsArray;
        int numberPersons = 0;
        int index = 0;

        for (Object o : array) {
            if (o instanceof Person){
                numberPersons++;
            }
        }

        //instanciate a new array of Persons
        personsArray = new Person[numberPersons];

        //process array
        for (Object ob : array) {
            Object parent = ob.getClass();
            while (((Class) parent).getSuperclass() != Object.class) {
                parent = ((Class) parent).getSuperclass();
            }

            //process result based on the class type and it's parent class type
            switch (((Class) parent).getName()) {
                case "java.lang.Number":
                    switch (ob.getClass().getName()) {
                        case "java.lang.Double":
                            sumDoubles += ((Number) ob).doubleValue();
                            break;
                        case "java.lang.Float":
                            sumFloats += ((Number) ob).floatValue();
                            break;
                        case "java.lang.Integer":
                            sumIntegers += ((Number) ob).intValue();
                            break;
                        case "java.lang.Long":
                            sumLongs += ((Number) ob).longValue();
                            break;
                    }
                    break;

                case "java.lang.String":
                    stringResult += (String) ob + " ";

                    break;

                case "java.lang.Character":
                    stringResult += (Character) ob + " ";
                    break;

                case "algorithms.Person":
                    personsArray[index++] = (Person) ob;
                    break;
            }
        }
        sumNumbers = sumDoubles + sumIntegers + sumFloats + sumLongs;

        System.out.println("RESULTS:");
        System.out.println("Sum of all numbers: " + sumNumbers);
        System.out.println("Concatination of Strings and Characters: " + stringResult);

        System.out.println("Person objects from the separate array: ");
        for (Person p : personsArray) {
            System.out.println(p.toString());
        }

    }
}
