package arrays;

import java.util.Arrays;

public class Array_Demo {
    public static void main(String[] args) {


        int[] array1 = {0, 1, 9, 7};
        int[] array2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(ArrayHelper.reverse(array1)));
        System.out.println(Arrays.toString(ArrayHelper.reverse(array2)));

        System.out.println(ArrayHelper.findIndex(array1,2));

        System.out.println(ArrayHelper.calcSum(array1));
        System.out.println(ArrayHelper.calcSum(array2));

    }
}
