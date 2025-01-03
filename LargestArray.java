import java.util.Scanner;
public class LargestArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scanner.nextInt();
        int array[]= new int[n];
        System.out.println("Enter Elemnts: ");
        for (int i = 0; i < n ;i++) {
            array[i]=scanner.nextInt();
        }
        int largest=0;
        for (int i = 0; i < n; i++) {
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("Largest element : "+largest);
    }
}