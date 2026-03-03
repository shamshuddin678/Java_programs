public class Arrays2D {
    public static void main(String[] args){
        // statically intializing arrays 1D 
        int [] marks = {92,93,94};
        System.out.println(marks[2]);


        // 2D arrays
        int [][] finalmarks = {{92,93,94},{95,96,97}};
        System.out.println(finalmarks[0][1]); // Here we are printing the 1st student of 1st subject marks
    }
}
