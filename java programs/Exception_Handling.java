public class Exception_Handling {
    public static void main(String[] args) {
        int [] marks = {95,96,98};
        try {
            System.out.println(marks[4]);
            
        } 
        catch (Exception e) {
            //do something after catching the exception
            System.out.println("Exception occurred");  
        }
    }
}
