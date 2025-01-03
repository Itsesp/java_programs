import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int largest;
        if(a>b && a>c){
            largest=a;
        }else if (b>c && b>a) {
            largest=b;
        }else{
            largest=c;
        }
        System.out.println("Largest = "+largest);
    }
}
