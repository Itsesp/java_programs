public class Break{
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Before break");
                    if (t) {
                        break second;
                    }
                    System.out.println("Third block");
                }
                System.out.println("Second block");
            }
            System.out.println("After second block");
        }
    }
}