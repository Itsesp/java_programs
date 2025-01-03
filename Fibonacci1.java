import java.util.Scanner;
public class Fibonacci1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b=1;
        int c;
        int count =0;
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        if(n>=2){
            System.out.println(a+"\n"+b);
        }
        while (count<n-2) { 
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            count++;
        }
        
    }
}