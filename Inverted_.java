public class Inverted_ {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star
            }
            System.out.println(); // Move to the next line
        }
    }}