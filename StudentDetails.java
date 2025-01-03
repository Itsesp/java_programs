import java.util.Scanner;
public class StudentDetails{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int n=scanner.nextInt();
        scanner.nextLine();
        Student[] student=new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details for Student "+(i+1)+": ");
            System.out.println("");
            System.out.print("Enter Name: ");
            String Name = scanner.nextLine();
            System.out.print("Enter USN: ");
            String USN = scanner.nextLine();
            System.out.print("Enter Branch: ");
            String Branch = scanner.nextLine();
            System.out.print("Enter Phone: ");
            String Phone = scanner.nextLine();
            System.out.print("Enter Percentage: ");
            double Percentage = scanner.nextDouble();
            student[i]=new Student(USN,Name,Branch,Phone,Percentage);

        }
        System.out.println("Details of Students: ");
        for(Student std:student) std.display();
    }

}
class Student{
    private String USN;
    private String Name;
    private String Branch;
    private String Phone;
    private double Percentage;
    public Student(String USN,String Name, String Branch, String Phone, double Percentage){
        this.USN=USN;
        this.Name=Name;
        this.Branch=Branch;
        this.Phone=Phone;
        this.Percentage=Percentage;
    }
    public void display(){
        System.out.println("Name: "+Name+"\n"+"USN :"+USN+"\n"+"Branch: "+Branch+"\n"+"Phone: "+Phone+"\n"+"Percentage: "+Percentage);
    }
}