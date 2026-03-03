public class Datatypes{
    public static void main(String[] args){
        // Primitive data types
        byte age = 20;
        int rollno = 45;
        long phno = 7075843647L;
        float pi = 3.1437F;
        char letter = '@';
        boolean Isvote = true;
        // here \n is used to print the next line.
        System.out.println("Age " + age + "\nrollno " + rollno + "\nphno " + phno + "\npi " + pi + "\nletter " + letter + "\nis getting vote " + Isvote);

        // Non-primitive data types
        String name = new String("Shamshuddin"); // In java for non-primitive data types we use new keyword 
        System.out.println("My name: " + name);
        System.out.println("Length of name is: " +name.length()); //here we use name.length() is used for use to check the length of name
        // and remaining non-primitive data types are class, interface and array
    }
}