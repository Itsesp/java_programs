import java.util.Scanner;
public class Fibonacci2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b=1;
        int c;
        
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        if(n>=2){
            System.out.println(a+"\n"+b);
        }
        for(int i=0;i<n-2;i++) { 
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
    }
}