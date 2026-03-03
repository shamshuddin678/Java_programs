public class Strings{
    public static void main(String[] args){
        // In java strings are immutable that means we cannot change the value of string once it is created. If we want to change the value of string instead of changing the value of string we need to create a new string(like tuple in python).
        
        String s1 = "Java";
        String s2 = "Shamshuddin";
        String s3 = s1 + " and "+ s2; //Here we uses " and " in that double qoutes we give left and right spaces it prints that manner.
        System.out.println(s3);
        // here we are using '+' operator to concatenate string and string.

        // 1.charAt() : this method is used to find the character at a specific index in a string. The index starts from 0 in java.
        System.out.println(s2.charAt(4));

        // 2.length() : this method is used to find the length of a string.
        System.out.println(s2.length());

        // 3.replace() : this method is used to replace a specific character in a  given string.
        System.out.println(s2.replace('a','A')); // Here we are replace('old character','new character')

        // substring()
        String language = "JAVA is a object oriented programming language";
        System.out.println(language.substring(0,8)); // Here we are using substring(start index, end index) in that end index is ignores(it returns upto 0 to 7).

        
    }
}
