public class Unicode {

    public static void main(String[] args) {
        char theFirstNumber = 'Ⓐ'; //  [9398, 10178].
        char theLastNumber = '⟂';  

        while (theFirstNumber <= theLastNumber) {
            System.out.println(theFirstNumber + " символы кодировки Unicode");
            theFirstNumber++;
        }
    }  
}