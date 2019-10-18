package algorithms;

public class TestAlgorithms {

    public static void main(String[] args) {

        //(1)  - Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
//        int number = Utils.validateIntInput();
//        System.out.println("The sumup of number " + number + " is " + Utils.sumUpDigits(number));

        //(2) - Write a Java program to reverse a string.
//        String input = "The quick brown fox";
//        System.out.println("Input: " + input);
//        System.out.println("Reverse: " + Utils.reverseString(input));

        //(3) - Write a program / method that checks if a number is palindrome.
//        int palindromeCandidate = 111;
//        boolean result = Utils.isPalindrome(palindromeCandidate);
//        if (result){
//            System.out.println("Integer " + palindromeCandidate + " is a palindrome");
//        }
//        else {
//            System.out.println("Integer " + palindromeCandidate + " is NOT a palindrome");
//        }

        //(4) - analyse string's characters
//        String inputToAnalyse = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        Utils.analyseString(inputToAnalyse);

        //(5.1) - test subarray reverse
//        int[] basicArray = new int[] {5,4,3,7,8};
//        int reverseTo = 3;
//        int[] reversedSubArray = new int[basicArray.length];
//        reversedSubArray = Utils.reverseSubArray(basicArray,reverseTo);
//        for (int i : reversedSubArray) {
//            System.out.println(i);
//        }

        //(5.2) - sort array
//        int[] basicArray2 = new int[] {29, 18, 14, -1, 102, 15, 14, 9, 1, 140, -67};
//        int[] reversedSubArray2 = new int[basicArray2.length];
//        reversedSubArray2 = Utils.sortArray(basicArray2);
//        for (int i : reversedSubArray2) {
//            System.out.print(i);
//            System.out.println("; ");
//        }

        //(6) - process array of objects
        Person person1 = new Person("Ghena", 22, Utils.Gender.MALE);
        Person person2 = new Person("Aliona", 25, Utils.Gender.FEMALE);
        Object[] arrayObjects = new Object[]{"Today", person1, 3111111, "is", 23L, 652.3, 'a', person2, "big", "day" };
        Utils.processArrayOfObjects(arrayObjects);
    }
}
