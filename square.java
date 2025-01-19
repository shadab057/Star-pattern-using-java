import java.util.*;

public class square {
    public static void printPattern(int n) {
        int i, j;
     
        for (i = 0; i < n; i++) {
            // Inner loop to handle number of columns
            for (j = 0; j < n; j++) {
                // Star will print only when it is in first
                // row or last row or first column or last column
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

   
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
}
