public class Functions {
    public static void show(){
        System.out.println("hi java");
    }
    public static void DisplayName(String name) {
        System.out.println("my name is : " + name);
    }
    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }
    public static void main(String[] args) {
        show();
        DisplayName("Shamshuddin");
        add(10, 20);
    }
}