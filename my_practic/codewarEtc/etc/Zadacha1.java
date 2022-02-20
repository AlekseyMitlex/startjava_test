package codewarEtc.etc;

public class Zadacha1 {

/*1. Вычесть аргументы x2 и x1.
  2. Вычесть аргументы y2 и y1.
  3. Возвести в степень 2 результат операции 1.
  4. Возвести в степень 2 результат операции 2.
  5. Сложить результаты операций 3 и 4.
  6. Вычислить корень квадратный из результата операции 5.*/

    static int x1 = 5;
    static int y1 = 2;
    static int x2 = 8;
    static int y2 = 4;

    public static double distance(int x1, int y1, int x2, int y2) {
//        double rs1 = x2 - x1; // 8-5=3
//        double rs2 = y2 - y1; // 4 - 2=2
//        double first = Math.pow(rs1, 2); // 3*3=9
//        double second = Math.pow(rs2, 2); // 2*2=4
//        double sum = first + second; // 9+4=13
//        double third = Math.sqrt(sum);
//        return third;
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static void main(String[] args) {
        System.out.println(distance(5, 2, 15, 12));
//       double r =  (((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)))/(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
//        System.out.println(r);
    }
}