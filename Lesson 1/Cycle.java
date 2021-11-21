public class Cycle {
    
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("все числа от [0, 20]: ");
        System.out.println(" ");

            for (int i = 0; i <=20 ; i++) {
                System.out.println(i);
            }

        System.out.println(" ");
        System.out.println("все числа от [6, -6] (с шагом итерации 2): ");
        System.out.println(" ");

            int j = 6;
            while (j >= -6) {
                System.out.println(j);
                j = j - 2;
            }

        System.out.println(" ");
        System.out.println("сумму нечетных чисел от [10, 20]:");
        System.out.println(" ");

            int k = 11;
            int sum = 0;
            do {
                if(k % 2 != 0) {
                sum = sum + k;
                    System.out.println("Числа не четные: " + k);
                }
                k++;
            } while (k <=20);
                    System.out.println(sum);
    }
}