
/**
 * Write a description of class UnitOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitOne
{
    public static void main(String[] args) {
        System.out.print("\u000C");
        System.out.println("Question 1");
        System.out.println("Which of the following arithmetic expressions evaluates to 1 ?");
        System.out.println("\tI   2 / 5 % 3\t=>\t" + 2 / 5 % 3);
        System.out.println("\tII  2 / (5 % 3)\t=>\t" + 2 / (5 % 3));
        System.out.println("\tIII 2 / 5 + 1\t=>\t" + (2 / 5 + 1));
        System.out.println("ANSWER: II and III\nEXPLAINATION: When performing integer division, the result is truncated to an integer. Thus, 2/5 == 0.");
        System.out.println("I is 0 % 3\nII is 2 / 2\nIII is 0 + 1");
        
        System.out.println("====================\nQuestion 2");
        System.out.println("Consider the following code segment.");
        System.out.println("\tdouble d = 0.25;");
        System.out.println("\tint i = 3;");
        System.out.println("\tdouble diff = d - i;");
        System.out.println("\tSystem.out.print((int)diff - 0.5);");
        System.out.println("What is printed as a result of executing the code segment?");
        System.out.println("ANSWER: " + ((int)(0.25d - 3) - 0.5) + "\nEXPLAINATION: When type casting to an integer, the result is truncated to an integer. So (int)diff is really -2 - 0.5 == -2.5");
        
        System.out.println("====================\nQuestion 3");
        System.out.println("Consider the following code segment, which is intended to display 6.0.");
        System.out.println("\tdouble fact1 = 1 / 2;");
        System.out.println("\tdouble fact2 = 3 * 4;");
        System.out.println("\tdouble product = fact1 * fact2;");
        System.out.println("\tSystem.out.println(product);");
        System.out.println("Which of the following best describes the error, if any, in the code segment?");
        System.out.println("ANSWER: Either the numerator or the denominator of the fraction 1 / 2 should be cast as double.\nEXPLAINATION: This is because of integer division: 1 / 2 is calculated to 0, and anything times 0 is 0");
        System.out.println("If the 1/2 was typecasted, the result would be 0.5, not 0, which will make the code print 6.0 instead of 0");
    }
}
