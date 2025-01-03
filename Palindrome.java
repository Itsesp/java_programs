import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = scanner.nextInt();
        String original = String.valueOf(n); 
        String reversed = new StringBuilder(original).reverse().toString(); 
        
        System.out.println("Reversed: " + reversed);
        if (original.equals(reversed)) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
