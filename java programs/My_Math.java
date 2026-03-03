public class My_Math {
    public static void main(String[] args){
        //maths functions in java . min() , max() , abs() , sqrt() , pow(), round() , ceil() , floor() , random()
        int a = 10;
        int b = 20;
        System.out.println(Math.min(a, b)); // it returns the minimum value between a and b
        System.out.println(Math.max(a, b)); // it returns the maximum value between a and  b
        System.out.println(Math.abs(-10)); // it returns the absolute value of a number
        System.out.println(Math.sqrt(16)); // it returns the square root of a number
        System.out.println(Math.pow(2, 3)); // it returns the value of 2 to the power of 3
        System.out.println(Math.round(3.14)); // it returns the nearest integer value of a number
        System.out.println(Math.ceil(3.14)); // it returns the smallest integer value that is greater than or equal to the given number
        System.out.println(Math.floor(3.14)); // it returns the largest integer value that is less than or equal to the given number
        System.out.println((int)(Math.random() * 10)); // it returns a random number between 0 and 10 after multiplied and it converted into interger
    }
}
