package Aug082022;

public class quadratic {

    public static int result = 0;
    public static void main(String[] args) {
        System.out.println(quadraticEquation(1, 2, -3));
        System.out.println(quadraticEquation(2, -7, 3));
        System.out.println(quadraticEquation(1, -12, -28));
    }

    public static int quadraticEquation(int a, int b, int c){
        //x = (-b ± √(b2-4ac)) / (2a)
        double root = 0;
        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);
  
        if(determinant>0){
           root = (-b + sqrt)/(2*a);
           System.out.println("Root is : "+ (int)root);
        }else if(determinant == 0){
           System.out.println("Root is : "+(int)(-b + sqrt)/(2*a));
        }
        return (int)root;
    }
}