import java.util.Scanner;
public class LargestTernary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int largest = (a>b && a>c)?a:((b>c && b>a)?b:c);
        System.out.println("Largest = "+largest);
    }
}