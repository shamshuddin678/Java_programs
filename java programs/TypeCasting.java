public class TypeCasting{
    public static void main(String[] args){
        // The process that coversion of 1 data type to another data type
        // 1. Implicit type casting (widening)
        double price = 100.00;
        double finalprice = price +19;
        System.out.println(finalprice);

        // 2.Explicit type casting (narrowing)
        int price1 = 100;
        int finalprice1 = price1 + (int)19.00; // Here we using () inside data type to which data type to convert it (int)
        System.out.println(finalprice1);
    }
}
