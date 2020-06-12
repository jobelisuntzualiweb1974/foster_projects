/*
 * Basic Programming Exercises
 */
package programmingexercises;

/*
 * @author Adrian Foster
 * April 10, 2020
 */
public class ProgrammingExercises {

    /**
     *Display three messages to output
     * @param args
     */
    public static void main(String[] args) {
        //Display three messages - method 1
        System.out.println("Welcome to Java.\n");
        System.out.println("Welcome to Computer Science\n");
        System.out.println("Programming is fun.\n");
        
        //Display three messages - method 2
        System.out.println("Welcome to Java" + "," + " " + "Welcome to Computer Science" + "," + " " + "Programming is fun" + ".\n");
        
        //Display a pattern
        System.out.println("Welcome to Java.\t");
        System.out.println("Welcome to Java.\t");
        System.out.println("Welcome to Java.\t");
        System.out.println("Welcome to Java.\t");
        System.out.println("Welcome to Java.\n\n");
        System.out.println("    J" + "     A" + "      V" + "     V" + "     A");
        System.out.println("    J" + "    A" + " A" + "      V" + "   V" + "     A" + " A");
        System.out.println("J" + "   J" + "   A" + "A" + "A" + "A" + "A" + "      V" + " V" + "     A" + "A" + "A" + "A" + "A");
        System.out.println(" J" + "J" + "    A" + "     A"+ "      V" + "     A" + "     A\n\n");
        
        //Print a table
        System.out.println("a" + "    a" + "^" + "2" + "     a" + "^" + "3");
        System.out.println("1" + "    1" + "       1");
        System.out.println("2" + "    4" + "       8");
        System.out.println("3" + "    9" + "       27");
        System.out.println("4" + "    16" + "      64\n");
        
        //Compute expressions
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        
        //Summation of a series
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        
        //Approximate pi
        System.out.println(4 * (1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11)));
        System.out.println(4 * (1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13)));
        
        //Perimeter of a circle
        System.out.println(2 * 5.5 * 3.14);
        //Area  of a circle
        System.out.println(5.5 * 5.5 * 3.14);
        
        //Area and perimeter of a rectangle
        System.out.println(4.5 * 7.9);
        
        //Average speed in miles
        System.out.println((14 / 1.6) * (60 / 45.5));
        
        //Average speed in kilometers
        System.out.println((24 * 1.6) * (60 / 100.583));
    }   
        
}
