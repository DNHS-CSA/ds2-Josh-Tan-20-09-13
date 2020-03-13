
/**
 * Write a description of class UnitThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitThree
{
    public static void main(String[] args) {
        System.out.print("\u000C");
        System.out.println("Question 1");
        System.out.println("In the following expression, j, k, and m are properly declared and initialized int variables.");
        System.out.println("\t!((j == k) && (k > m))");
        System.out.println("Which of the following is equivalent to the expression above?");
        System.out.println("ANSWER: (j != k) && (k <= m)\nEXPLAINATION: The obvious part of this is that the ! will flip any of the signs that it affects");
        System.out.println("j == k becomes j != k and k > m becomes k <= m. However, the ! will also change && to ||");
        
        System.out.println("====================\nQuestion 2");
        System.out.println("Consider the following code segment.");
        System.out.println("\tString first = new String(\"duck\");");
        System.out.println("\tString second = new String(\"duck\");");
        System.out.println("\tString third = new String(\"goose\");");
        System.out.println("\tif (first == second) { System.out.print(\"A\"); }");
        System.out.println("\telse if (second == third) { System.out.print(\"B\"); }");
        System.out.println("\telse if (first.equals(second)) { System.out.print(\"C\"); }");
        System.out.println("\telse if (second.equals(third)) { System.out.print(\"D\"); } ");
        System.out.println("\telse { System.out.print(\"E\"); }");
        System.out.println("What is printed as a result of executing the code segment?");
        System.out.println("ANSWER: C\nEXPLAINATION: When comparing Strings, do not use == like a primitive. You must use a method to compare, so first.equals(second) is the first condition to return true, resulting in the answer being C");
        
        System.out.println("====================\nQuestion 3");
        System.out.println("In the code segment below, the int variable temp represents a temperature in degrees Fahrenheit. The code segment is intended to print a string based on the value of temp. The following table shows the string that should be printed for different temperature ranges.");
        System.out.println("Temperature Range\tString to Print");
        System.out.println("31 and below\t\t\"cold\"");
        System.out.println("32–50\t\t\t\"cool\"");
        System.out.println("51–70\t\t\t\"moderate\"​");
        System.out.println("71 and above\t\t\"warm\"");
        System.out.println("\tString weather;");
        System.out.println("\tif (temp <= 31) { weather = \"cold\"; }");
        System.out.println("\telse { weather = \"cool\"; }");
        System.out.println("\tif (temp >= 51) { weather = \"moderate\"; }");
        System.out.println("\telse { weather = \"warm\"; }");
        System.out.println("\tSystem.out.print(weather);");
        System.out.println("Which of the following test cases can be used to show that the code does NOT work as intended?");
        System.out.println("I   temp = 30");
        System.out.println("II  temp = 51");
        System.out.println("III temp = 60");
        System.out.println("ANSWER: I\nEXPLAINATION: I will be set to cold in the 1st if statement but will be changed to warm in the second if statement");
        System.out.println("temp = 30 " + UnitThree.getWeather(30));
        System.out.println("temp = 51 " + UnitThree.getWeather(51));
        System.out.println("temp = 60 " + UnitThree.getWeather(60));
        
        System.out.println("====================\nQuestion 4");
        System.out.println("Consider the following two code segments. Assume that variables x and y have been declared as int variables and have been assigned integer values.");
        System.out.println("I.");
        System.out.println("\tint result = 0;");
        System.out.println("\tif (x > y) {");
        System.out.println("\t\tresult = x - y;");
        System.out.println("\t\tSystem.out.print(result);");
        System.out.println("\t}");
        System.out.println("\telse if (x < y) {");
        System.out.println("\t\tresult = y - x;");
        System.out.println("\t\tSystem.out.print(result);");
        System.out.println("\t}");
        System.out.println("\telse {");
        System.out.println("\t\tSystem.out.print(result);");
        System.out.println("\t}");
        System.out.println("II.");
        System.out.println("\tif (x < y) {");
        System.out.println("\t\tSystem.out.print(y - x);");
        System.out.println("\t}");
        System.out.println("\telse {");
        System.out.println("\t\tSystem.out.print(x - y);");
        System.out.println("\t}");
        System.out.println("Which of the following correctly compares the outputs of the two code segments?");
        System.out.println("ANSWER: Code segment I and code segment II produce the same output for all values of x and y.\nEXPLAINATION: If x and y are equal, their difference will be 0, which is also the number that result is initialized to in I.");
        System.out.println("Aside from that, both the code segments have the same logic. They check if x > y and vice versa and print out the positive difference");
    }
    
    private static String getWeather(int temp) {
        String weather;
        if (temp <= 31) {
            weather = "cold";
        }
        else {
            weather = "cool";
        }
        if (temp >= 51) {
            weather = "moderate";
        }
        else {
            weather = "warm";
        }
        return weather;
    }
}
