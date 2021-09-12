package Polynoom;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {
    private List<Term> terms;

    public Polynomial() {
        this.terms = new ArrayList<>();
    }

    public void add(Term term) {
        this.terms.add(term);
    }
    /**
     * 
     * @param poly2 - the polynomial you add to this polynomial.
     * @return - the sum of poly2 and this polynomial polynomial..
     */
    public Polynomial som(Polynomial poly2) {
        Polynomial result = new Polynomial();
        List<Term> terms2 = poly2.terms;
        int j = 0;
        int i = 0;
        
        while (i < this.terms.size() - 1) {
            // if the exponent is the same add them together.
            if (terms.get(i).getExponent() == terms2.get(j).getExponent()) {
                result.add(new Term(
                        terms.get(i).getCoefficient(),
                        terms.get(i).getExponent() + terms2.get(j).getExponent()
                    ));
                i++;
                j++;
            }
            /*
             * if the upcoming exponents of the indexes of terms2 are bigger than the
             * current index of terms1. It will keep adding the indexes of terms2 first
             * until it's index is smaller than terms1 current index again.
             */
            while (this.terms.get(i).getExponent() < terms2.get(j).getExponent() && j < terms2.size() - 1) {
                result.add(terms2.get(j));
                j++;
            }
            // Add index of terms1
            if (this.terms.get(i).getExponent() > terms2.get(j).getExponent()) {
                result.add(this.terms.get(i));
                i++;
            }
        }
        // if the method has looped through all of terms indexes but not all of terms2
        // it will add the remaining indexes.
        while (terms2.size() > j) {
            result.add(terms2.get(j));
            j++;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Term term : this.terms) {
            result.append(term + " ");
        }

        return result.toString();
    }
}
