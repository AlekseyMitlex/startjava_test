package codewarEtc.codewar.kui8;

/*      You get an array of numbers, return the sum of all of the positives ones.
        Example [1,-4,7,12] => 1 + 7 + 12 = 20
        Note: if there is nothing to sum, the sum is default to 0.*/

public class Ex1 {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i >= 0) {
                sum += i;
                System.out.println("sum = " + sum);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{-30, -2, 1, 7, 9};

        sum(arr);


    }
}

