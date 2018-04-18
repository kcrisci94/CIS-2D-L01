public class Main {
    //DON'T USE '==' OPERATOR TO COMPARE STRINGS
    //IT WILL WORK WITH PRIMITIVE STRINGS BUT NOT WITH
    //OBJECT STRINGS. INSTEAD, USE .equals() String method
    public static void main(String[] args) {
        //compare strings
        //PRIMITIVE DATA TYPE STRINGS
        String s1 = "Hello!";
        String s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("They Match!");
        } else {
            System.out.println("They don't match");
        }

        //OBJECT STRINGS
        String s3 = new String("Hello!");
        String s4 = new String("HELLO!");

        if (s3 == s4) {
            System.out.println("They Match!");
        } else {
            System.out.println("They don't match");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("They Match!");
        } else {
            System.out.println("They don't match");
        }
    }
}
