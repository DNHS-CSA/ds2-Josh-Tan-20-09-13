
/**
 * Write a description of class UnitTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTwo
{
    public static void main(String[] args) {
        System.out.print("\u000C");
        System.out.println("Question 1");
        System.out.println("Consider the following class declaration.");
        System.out.println("\tpublic class Thing {");
        System.out.println("\t\tprivate String color;");
        System.out.println("\t\tpublic Thing() { color = \"Blue\"; }");
        System.out.println("\t\tpublic Thing(String setColor) { color = setColor; }\n\t}");
        System.out.println("Which of the following code segments, when appearing in a class other than Thing, would create a reference of type Thing with a value of null ?");
        System.out.println("ANSWER: Thing someThing;\nEXPLAINATION: This will allocate memory to reference a Thing but will not actually have a Thing object, resulting in null");
        
        System.out.println("====================\nQuestion 2");
        System.out.println("The code segment below is intended to randomly print one of the values 2, 4, 6, or 8 with equal probability.");
        System.out.println("\tint val = /* missing code */ ;");
        System.out.println("\tval *= 2;");
        System.out.println("\tSystem.out.print(val);");
        System.out.println("Which of the following can be used to replace /* missing code */ so that the code segment works as intended?");
        System.out.println("ANSWER: (int) (Math.random() * 4 + 1)\nEXPLAINATION: Math.random generates a double from 0 to 1. Multiplying by 4 will create a number 0 to 4. The typecast will make an integer number between 0 and 3, so 1 is added to get the integer values 1 to 4");
    }
}
