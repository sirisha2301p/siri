
public class Etn1 {
    public static void main(String[] args) {
        int n = 5; // Change the value of n for different sizes of the diamond
        
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}