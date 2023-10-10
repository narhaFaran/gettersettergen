import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the AP\u00AE Java\u2122 getter and setter code generator!");
        //Add code to read in the variable name then the variable type
        System.out.println("Enter your instance variable name: ");
        String instanceName = s.nextLine();
        System.out.println("Enter variable data type:");
        String variableType = s.nextLine();

        //Then make a few print statements that print the getter and the setter

        String i = instanceName.substring(0,1);
        i = i.toUpperCase();
        String n = instanceName.substring(1);
        String instanceNameUpper = i+n;

        String getterComment = "//getter for " + instanceName;
        String getter = "public " + variableType + " get"+instanceNameUpper+"() { \n" +
                "   return " + instanceName + "\n" +
                "}";
        System.out.println(getterComment);
        System.out.println(getter);


        String setterComment = "//setter for " + instanceName;
        String setter = "public " + variableType + " set"+instanceNameUpper+"(" + variableType + " " +
                instanceName + ") " +
                "{ \n" + "   this." + instanceName + " = " + instanceName + "\n" +
                "}";
        System.out.println(setterComment);
        System.out.println(setter);
        //I used a few String variables to de-clutter the code a little.
    }
}