package Oops_concepts;

class Pen {
    String color;
    String type; // ballpoint or any other

    public void write(){
        System.out.println("Writing something");
    }

    public void displaycolor(){
        System.out.println(this.color);
    }

    public void displaytype(){
        System.out.println(this.type);
    }
}

public class First {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";
        p1.write();

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "ballpoint";

        p1.displaycolor();
        p1.displaytype();

        p2.displaycolor();
        p2.displaytype();
    }
}