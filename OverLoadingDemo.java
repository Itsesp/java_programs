public class OverLoadingDemo{
    static class Calculator{
        public int add(int a,int b){
            return a+b;
        }
        public int add(int a, int b, int c){
            return  a+b+c;
        }
        public double add(double a, double b){
            return a+b;
        }
    }
    static class Student{
        private String Name;
        private int age;
        private String course;
        public Student(){
            this.Name="UnKnown";
            this.age=0;
            this.course="UnKnown";
        }
        public Student(String Name, int age){
            this.Name=Name;
            this.age=age;
            this.course="UnKnown";

        }
        public Student(String Name,int age, String course){
            this.Name=Name;
            this.age=age;
            this.course=course;
        }
        public void display(){
            System.out.println("Name: "+Name+"\n"+"Age: "+age+"\n"+"Course: "+course);
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Integers: a+b= "+calculator.add(1, 3));
        System.out.println("Integers: a+b+c= "+calculator.add(1, 2, 3));
        System.out.println("Double: a+b= "+calculator.add(3, 5));
        System.out.println("");
        Student s1 = new Student();
        Student s2 = new Student("Demo", 22);
        Student s3 = new Student("Demo", 24, "AIDS");
        s1.display();
        System.out.println("");
        s2.display();
        System.out.println("");
        s3.display();
    }
}