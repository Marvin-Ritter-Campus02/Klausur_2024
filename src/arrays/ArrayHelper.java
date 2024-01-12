package arrays;

public class ArrayHelper {

    public static int[] reverse(int[] numbers) {

        int[] reversedArray;
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        reversedArray = numbers;
        return reversedArray;
    }

    public static int findIndex(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int calcSum(int[] numbers) {
        int numbersum= 0;
        for (int i = 0; i < numbers.length; i++) {
            numbersum += numbers[i];
        }
        return numbersum;
    }
}


