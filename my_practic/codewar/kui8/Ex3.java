package codewar.kui8;

/*You were camping with your friends far away from home, but when
        it's time to go back, you realize that your fuel is running out
        and the nearest pump is miles away50! You know that on average,
        your car runs on about miles per gallon. There are gallons left.
        252Considering these factors, write a function that tells you if
        it is possible to get to the pump or not. Function should return
        ( in Prolog and NASM) if it is possible and ( in Prolog and NASM)
        if not. The input values are always positive.true1false0*/

public class Ex3 {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
//        double distance = mpg * fuelLeft;
//        return !(distanceToPump > distance);
        return distanceToPump <= mpg * fuelLeft;
    }


    public static void main(String[] args) {
    }
}
