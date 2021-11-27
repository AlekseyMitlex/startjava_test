public class Unicode {

    public static void main(String[] args) {
        char startRange = 'Ⓐ'; //  [9398, 10178].
        char endRange = '⟂';  

        while (startRange <= endRange) {
            System.out.println(startRange + " символы кодировки Unicode");
            startRange++;
        }
    }  
}