import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        int factorial=1;
        if(n==0||n==1){
            factorial=1;
        }else{
            for (int i = 2; i <= n; i++){
                factorial=factorial*i;
            }
        }
        System.out.println("Factorial = "+factorial);
    }
}