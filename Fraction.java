
/**
 *
 * Implements an API for Fraction
 */
public class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Construct a new Fraction
     * @param numerator the numerator of the fraction
     * @param denominator the dominator of the fraction
     */
    public Fraction(int numerator, int denominator) {
        int val= gcd(numerator,denominator);
        this.numerator=numerator/val;
        this.denominator=denominator/val;
    }
    
    /**
     * Implements the add operation
     * @param fr1 the first fraction 
     * @param fr2 the second fraction 
     * @return the operation result
     */
    static Fraction add(Fraction fr1, Fraction fr2){
        int newNumerator=fr1.numerator*fr2.denominator+fr1.denominator*fr2.numerator;
        int newDenominator=fr1.denominator*fr2.denominator;
        return new Fraction(newNumerator,newDenominator);

    }
    
    /**
     * Implements the subtract operation
     * @param fr1 the first fraction 
     * @param fr2 the second fraction 
     * @return the operation result
     */
    static Fraction subtract(Fraction fr1, Fraction fr2){
        int newNumerator=fr1.numerator*fr2.denominator-fr1.denominator*fr2.numerator;
        int newDenominator=fr1.denominator*fr2.denominator;
        return new Fraction(newNumerator,newDenominator);

    }
    
    /**
     * Implements the divide operation
     * @param fr1 the first fraction 
     * @param fr2 the second fraction 
     * @return the operation result
     */
    static Fraction divide(Fraction fr1, Fraction fr2){
        int newNumerator=fr1.numerator*fr2.denominator;
        int newDenominator=fr1.denominator*fr2.numerator;
        return new Fraction(newNumerator,newDenominator);

    }
    
    /**
     * Implements the multiply operation
     * @param fr1 the first fraction 
     * @param fr2 the second fraction 
     * @return the operation result
     */
    static Fraction multiply(Fraction fr1, Fraction fr2){
        int newNumerator=fr1.numerator*fr2.numerator;
        int newDenominator=fr1.denominator*fr2.denominator;
        return new Fraction(newNumerator,newDenominator);

    }
    
    /**
     * Return greatest common divisor 
     * @param a the first parameter
     * @param b the second parameter
     * @return  the greatest common divisor of specified parameters
     */
    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Fraction))
            return false;
        Fraction fr2=(Fraction)obj;
        if(numerator==fr2.numerator && denominator==fr2.denominator)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
    return numerator + "/" + denominator;
    }
    
}
