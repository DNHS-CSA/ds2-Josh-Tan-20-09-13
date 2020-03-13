/**
 * Write a description of class UnitFive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitFive
{
    public static void main(String[] args) {
        System.out.print("\u000C");
        System.out.println("Question 1");
        System.out.println("The Thing class below will contain a String attribute, a constructor, and the helper method, which will be kept internal to the class.");
        System.out.println("\tpublic class Thing {");
        System.out.println("\t\t/* missing code */");
        System.out.println("\t}");
        System.out.println("Which of the following replacements for /* missing code */ is the most appropriate implementation of the class?");
        System.out.println("ANSWER: private String str;\npublic Thing(String s)\n{ /* implementation not shown */ }\nprivate void helper()\n{ /* implementation not shown */ }");
        System.out.println("EXPLAINATION: Constructors must be public and according to the question, everything else must be private, so pick the above");
        
        System.out.println("====================\nQuestion 2");
        System.out.println("Consider the following method substringFound, which is intended to return true if a substring, key, is located at a specific index of the string phrase. Otherwise, it should return false.");
        System.out.println("\tpublic boolean substringFound(String phrase, String key, int index) {");
        System.out.println("\t\tString part = phrase.substring(index, index + key.length());");
        System.out.println("\t\treturn part.equals(key);");
        System.out.println("\t}");
        System.out.println("Which of the following is the best precondition for index so that the method will return the appropriate result in all cases and a runtime error can be avoided?");
        System.out.println("ANSWER: 0 <= index < phrase.length() - key.length()\nEXPLAINATION: 0 <= index, but index < phrase.length() is not enough because the code adds key.length() to the end index. So index < phrase.lenth - index.length()");

        System.out.println("====================\nQuestion 3");
        System.out.println("Consider the following class definition.");
        System.out.println("\tpublic class BoolTest {");
        System.out.println("\tprivate int one;");
        System.out.println("\tpublic BoolTest(int newOne) { one = newOne; }");
        System.out.println("\tpublic int getOne() { return one; }");
        System.out.println("\tpublic boolean isGreater(BoolTest other) { /* missing code */ }");
        System.out.println("}");
        System.out.println("The isGreater method is intended to return true if the value of one for this BoolTest object is greater than the value of one for the BoolTest parameter other,   and false otherwise. The following code segments have been proposed to replace /* missing code */.");
        System.out.println("\tI   return one > other.one;");
        System.out.println("\tII  return one > other.getOne();");
        System.out.println("\tIII return getOne() > other.one;");
        System.out.println("Which of the following replacements for /* missing code */ can be used so that isGreater will work as intended?");
        System.out.println("ANSWER: I, II and III\nEXPLAINATION: Each code snippet performs the same task through different ways.");
        System.out.println("I gets the current object's one and directly compares it to another object's one");
        System.out.println("II gets the current object's one and uses a method to compare to the other object's one");
        System.out.println("III gets the current one through a method and gets the other one through a method");
        System.out.println("Each perform the same task through different techniques, so all are valid strategies");
        
        System.out.println("====================\nQuestion 4");
        System.out.println("Consider the following class definition.");
        System.out.println("\tpublic class Person {");
        System.out.println("\tprivate String name;");
        System.out.println("\tprivate int feet;");
        System.out.println("\tprivate int inches;");
        System.out.println("\tpublic Person(String nm, int ft, int in) {");
        System.out.println("\t\tname = nm;");
        System.out.println("\t\tfeet = ft;");
        System.out.println("\t\tinches = in;");
        System.out.println("\t\t}");
        System.out.println("\tpublic int heightInInches() { return feet * 12 + inches; }");
        System.out.println("\tpublic String getName() { return name; }");
        System.out.println("\tpublic String compareHeights(person other) {");
        System.out.println("\t\tif (this.heightInInches() < other.heightInInches()) { return name; }");
        System.out.println("\t\telse if (this.heightInInches() > other.heightInInches()) { return other.getName(); }");
        System.out.println("\t\telse return \"Same\"");
        System.out.println("\t\t}");
        System.out.println("\t}");
        System.out.println("The following code segment appears in a method in a class other than Person.");
        System.out.println("\tPerson andy = new Person(\"Andrew\", 5, 6);");
        System.out.println("\tPerson ben = new Person(\"Benjamin\", 6, 5);");
        System.out.println("\tSystem.out.println(andy.compareHeights(ben));");
        System.out.println("What, if anything, is printed as a result of executing the code segment?");
        System.out.println("ANSWER: Andrew\nEXPLAINATION: The code to convert height works correctly, so just find the person with the shortest hieght, Andrew");
    }
}
