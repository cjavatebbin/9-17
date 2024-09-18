
/**
 * Write a program that calculates the real roots of a quadratic polynomial
 * in the form ax^2 + bx + c = 0. Prompt the user for input.
 * 
 * For example, a possible sample dialogue might be the following:
 * Enter coefficients for the quadratic ax^2 + bx + c = 0.
 * a = 1
 * b = 0
 * c = -4
 * 
 * roots are 2.0 and -2.0
 * 
 * If the quadratic has no real roots, output "no real roots"
 * 
 * 
 * @author 
 * @version 9/17/2024
 */
import java.util.Scanner;
public class QuadraticSolverMain {
    public static void main(String[] args) {
        
        QuadraticSolver solver = new QuadraticSolver();
        Scanner s = new Scanner(System.in);
        double a,b,c;

        System.out.println("Enter coefficients for the quadratic ax²+bx+c:");
        System.out.print("\na = ");
        a = s.nextDouble();
        System.out.print("\nb = ");
        b = s.nextDouble();
        System.out.print("\nc = ");
        c = s.nextDouble();

        
        

    }
}
