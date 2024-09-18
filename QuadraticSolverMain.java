
/**
 * Main function for Quadratic Solver class
 * 
 * 
 * @author Terence Wu
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

        String roots = solver.roots(a,b,c);
        System.out.println(roots);

    }
}
