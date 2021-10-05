package Polynomials;

public class PolynomialFactory {
    
    public static Polynomial addPolynomials() {
                // Create first polynomial
                Polynomial polynomial1 = new Polynomial();
                polynomial1.add(new Term (4, 5));
                polynomial1.add(new Term(1, 2));
                polynomial1.add(new Term(3, 1));
                polynomial1.add(new Term(1, 0));
                // Create second polynomial
                Polynomial polynomial2 = new Polynomial();
                polynomial2.add(new Term(-1, 3));
                polynomial2.add(new Term(2, 2));
                polynomial2.add(new Term(-5, 0));
                polynomial2.add(new Term(-5, -2));
                polynomial2.add(new Term(-5, -4));
                polynomial2.add(new Term(-5, -6));
                polynomial2.add(new Term(-5, -7));
                // Determine the sum
                return polynomial1.sum(polynomial2);
    }
}
