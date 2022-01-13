package Algoritm;

public class LinearSearch {

    public static int linearSearch(int[] arr, int elementToSearch) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch)
                return i;
        }
        return -1;
    }
}