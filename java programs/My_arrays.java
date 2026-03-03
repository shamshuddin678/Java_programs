import java.util.Arrays; // to sort the array we need to import this package

public class My_arrays {
    public static void main(String[] args) {
        // 1 dimension arrays
        // To store elements of students marks . 2 ways 
        // 1. way
        int maths = 90;
        int physics = 89;
        int chemistry = 91;
        System.out.println(maths + " " + physics + " " + chemistry + " ");
        // imagine there are 10 or 20 subjects then how to store the marks them. that is 2nd way arrays
        /* 2. way: Array
        declearing it are data_type[] array_name = new(here use new keyword because it is a non-primitive data type) data_type[size]; */
        //boolean  [] marks = new boolean[3]; // it returns false because default value of boolean is false in java
        int [] marks = new int[3]; // Here we use [3] means we can store 3 subjects marks
        System.out.println(marks[2]); // here we are using marks[2](if data type is int) to print the value 0 automatically .it take default value if we not intiaclized the marks variable in java
        marks[0] = 98;
        marks[1] = 93;
        marks[2] = 94;
        
        //1.In arrays we use length function to find the length of array
        System.out.println(marks.length);

        // 2. sort the array. we need to import the java.util.Arrays pakage to sort the array
        System.out.println(marks[0]); // before sort 98 93 94. -> 0 1 2
        Arrays.sort(marks);
        System.out.println(marks[0]); // after sort 93 94 98 -> 0 1 2
}
}