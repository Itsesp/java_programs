import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = scanner.nextInt();
        System.out.println("Enter number of coloumns: ");
        int c = scanner.nextInt();
        int first[][]=new int[r][c];
        int second[][]=new int[r][c];
        int result[][]=new int[r][c];
        System.out.println("Enter elements of first matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                first[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                second[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = first[i][j]+second[i][j];
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("\t"+result[i][j]);
            }
            System.out.println("");
        }
    }
}