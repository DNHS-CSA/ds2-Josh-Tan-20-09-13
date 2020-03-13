
/**
 * Write a description of class UnitFour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFour
{
    public static void main(String[] args) {
        System.out.print("\u000C");
        System.out.println("Question 1");
        System.out.println("Consider the following code segment.");
        System.out.println("\tint count = 0;");
        System.out.println("\tint number = 20;");
        System.out.println("\twhile (number > 0) {");
        System.out.println("\tnumber = number / 2;");
        System.out.println("\tcount++;");
        System.out.println("\t}");
        System.out.println("What will be the value of count after executing the code segment?");
        System.out.println("ANSWER: 4\nEXPLAINATION: The number starts at 20.");
        System.out.println("Num\tCount\n10\t1\n5\t2\n2\t3\n1\t4");
        
        System.out.println("====================\nQuestion 2");
        System.out.println("Consider the following code segment.");
        System.out.println("\tfor (int j = 0; j < 4; j++) {");
        System.out.println("\t\tfor (int k = 0; k < j; k++) {");
        System.out.println("\t\t\tSystem.out.println(\"hello\");");
        System.out.println("\t\t}");
        System.out.println("\t}");
        System.out.println("Which of the following best explains how changing the inner for loop header to  for (int k = j; k < 4; k++)  will affect the output of the code segment?");
        System.out.println("ANSWER: The string \"hello\" will be printed four additional times because the inner loop will iterate one additional time for each iteration of the outer loop.");
        System.out.println("EXPLAINATION: Original will print 0 on the 1st iteration of the outer for loop while the new will print 4");
        System.out.println("Original will print 1 on the 2nd iteration of the outer for loop while the new will print 3");
        System.out.println("Original will print 2 on the 3rd iteration of the outer for loop while the new will print 2");
        System.out.println("Original will print 3 on the 4th iteration of the outer for loop while the new will print 1");
        System.out.println("In the end, the new loop will print 4 extra times");
        
        System.out.println("====================\nQuestion 3");
        System.out.println("Consider the following code segment.");
        System.out.println("\tfor (int k = 0; k < 4; k++) {");
        System.out.println("\t\t/* missing loop header */ {");
        System.out.println("\t\t\tSystem.out.print(k);");
        System.out.println("\t\t}");
        System.out.println("\t\tSystem.out.println();");
        System.out.println("\t}");
        System.out.println("The code segment is intended to produce the following output.");
        System.out.println("\t0");
        System.out.println("\t11");
        System.out.println("\t222");
        System.out.println("\t3333");
        System.out.println("Which of the following can be used to replace /* missing loop header */ so that the code segment will work as intended?");
        System.out.println("ANSWER: for (int h = k; h >= 0; h--)\nEXPLAINATION: The first iteration will print 0 because of the >=. Remember that the for loop decrements so h >= 0");
        
        System.out.println("====================\nQuestion 4");
        System.out.println("Consider the following method.");
        System.out.println("\tpublic String mystery(String word, int num){");
        System.out.println("\t\tString result = \"\";");
        System.out.println("\t\tfor (int k = num; k >= 0; k--) {");
        System.out.println("\t\t\tresult += word.substring(0, k);");
        System.out.println("\t\t}");
        System.out.println("\t\treturn result;");
        System.out.println("}\t");
        System.out.println("What is returned as a result of the call mystery(\"computer\", 3) ?");
        System.out.println("ANSWER: comcoc\nEXPLAINATION: substring does not include the ending index. The 1st print will be the first 3 characters, followed by the first 2, and then the first character");
        
        System.out.println("====================\nQuestion 5");
        System.out.println("Consider the method digitSum below, which takes a positive integer parameter as input.");
        System.out.println("\tpublic int digitSum(int num) {");
        System.out.println("\t\tint total = 0;");
        System.out.println("\t\twhile (num > 0) { total += num % 10; num /= 10; }");
        System.out.println("\t\treturn total;");
        System.out.println("\t}");
        System.out.println("Which of the following code segments could replace the while loop in the method digitSum without changing the value returned by the method?");
        System.out.println("I.");
        System.out.println("\tfor (int h = 0; h < num; h++) { num /= 10; }");
        System.out.println("II.");
        System.out.println("\tfor (int j = num; j > 0; j--) { total += j % 10; }");
        System.out.println("III.");
        System.out.println("\tfor (int k = num; k > 0; k /= 10) { total += k % 10; }");
        System.out.println("ANSWER: III\nEXPLAINATION: I iterates an incorrect number of times. II does not iterate correctly nor add the total correctly. III is the only one that adds the values for each digit in the number up");
    }
}
