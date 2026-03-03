public class Operators {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        // Arithmetic operators
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);

        int dif = a - b;
        System.out.println("The difference of a and b is: " + dif);

        int mul = a * b;
        System.out.println("The product of a and b is: " + mul);

        double div = (double) b / a; 
        System.out.println("The quotient of b and a is: " + div);

        double mod = b % a;
        System.out.println("The remainder of b divided by a is: " + mod);

        System.out.println("--------");

        // Assignment operators
        a += 1;
        System.out.println("a = a + 1: " + a);

        a -= 1;
        System.out.println("a = a - 1: " + a);

        a *= 2;
        System.out.println("a = a * 2: " + a);

        a /= 2;
        System.out.println("a = a / 2: " + a);
        
        a %= 2;
        System.out.println("a = a % 2: " + a);

        System.out.println("--------");

        // logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + !x);

        System.out.println("--------");

        // Bitwise operators
        int c = a & b;
        /*
        a & b: 1 (in binary: 01)
        Explanation: a = 3 (in binary: 011)
                     b = 1 (in binary: 001)
                     a & b = 001=>1 (which is 1 in decimal)
         */
        System.out.println("a & b: " + c); 

        int d = a | b;
        System.out.println("a | b: " + d);

        int e = a ^ b;
        System.out.println("a ^ b: " + e);

        int f = ~a;
        System.out.println("~a: " + f);

        int g = a << b;
        /*
        a << b: 12 (in binary: 1100)
        Explanation: a = 3 (in binary: 011)
        Left shifting a by b positions means moving the bits of a to the left by b positions, padding with zeros on the right.
        011 << 1(count=1) = 110 = 6 (in decimal)
        But since b = 1, and a = 3, we get 3 << 1 = 6. However, in this example, it seems to be showing 12.
        Let's assume a = 3 and b = 2 for clarity:
        a = 3 (binary: 011)
        b = 2
        a << b = 011 << 2 = 1100 (binary) = 12 (decimal)
         */
        System.out.println("a << b: " + g);

        int h = a >> b;
        System.out.println("a >> b: " + h);

        // Increment and Decrement operators
        //1.post-increment
        int i = a++; // Here first assigned to then incremented to i
        System.out.println("Post-increment: " + i);
        //2.pre-increment
        int j = ++a; // Here first incremented to j then assigned to j
        System.out.println("Pre-increment: " + j);
        
        System.out.println("--------");

        //3.post-decrement
        int k = a--; // Here first assigned to k then decremented
        System.out.println("Post-decrement: " + k);
        //4.pre-decrement
        int l = --a; // Here first decremented then assigned to l
        System.out.println("Pre-decrement: " + l);

    }
}
