package Question05;

public class Main {
    public static void main(String[] args) {
        String stringToReverse = new String("string");
        String revertedString = "";

        for(int i = stringToReverse.length() - 1; i >= 0; i--){
            revertedString += stringToReverse.charAt(i);
        }

        System.out.printf("Original String: %s%n", stringToReverse);
        System.out.printf("String reverted: %s%n", revertedString);
    }
}
