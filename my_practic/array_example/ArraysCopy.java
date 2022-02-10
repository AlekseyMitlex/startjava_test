package array_example;

import java.util.Arrays;

public class ArraysCopy {

    public static void main(String[] args) {
        int insertIdx = -(-1) - 1;
        int[] array = {2, 5, 6, 7, 11, 13, 18};
        int[] array1 = {0, 0, 0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.arraycopy(array, insertIdx, array1, insertIdx + 1, array.length - insertIdx - 1);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        insertIdx = -(-0) - 1;
        System.arraycopy(array, insertIdx, array1, insertIdx + 1, array.length - insertIdx - 1);
        System.out.println(Arrays.toString(array1));
    }
}
