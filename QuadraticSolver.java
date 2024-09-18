
/**
 * returns the roots of ax^2 + bx + c = 0
 * 
 * @author Terence Wu
 * @version 9/17/2024
 */
public class QuadraticSolver {

    public String roots(double a, double b, double c) {

        double determinant = b*b-4*a*c;
        if(determinant<0)
            return "no real roots";
        else if(determinant==0)
        {
            double root;
            root = (0-b)/(2*a);
            return "only root is " + root;
        }
        else
        {
            double r1 = (0-b+Math.sqrt(determinant))/(2*a);
            double r2 = (0-b-Math.sqrt(determinant))/(2*a);
            return "roots are " + r1 + " amd " + r2;
        }
        
    }
}
