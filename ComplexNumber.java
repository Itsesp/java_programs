public class ComplexNumber{
    
    public static void main(String[] args) {
        Complex c1=new Complex(1,2);
        Complex c2 = new Complex(3,4);
        c1.display();
        c2.display();
        Complex result = c1.add(c2);
        result.display();
    }
}
class Complex{
    private double real;
    private double imaginary;
    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public Complex add(Complex other){
        double newReal = this.real+other.real;
        double newImaginary = this.imaginary+other.imaginary;
        return new Complex(newReal,newImaginary);
    }
    public void display(){
        System.out.println(this.real+"+"+this.imaginary+"i");
    }
}