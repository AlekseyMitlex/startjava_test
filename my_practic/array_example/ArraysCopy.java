package array_example;

import java.util.Arrays;

public class ArraysCopy {

    public static void main(String[] args) {
        int index = 0;
        int[] array = {2, 5, 6, 7, 11, 13, 18};
        int[] array1 = {0, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.arraycopy(array, index + 1, array1, index, array.length - index - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
    }
}
