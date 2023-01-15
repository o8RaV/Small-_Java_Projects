import java.util.*;
public class Spinner {
    public static void main(String[] args){
        try (Scanner foo = new Scanner(System.in)) {
            System.out.println("Enter slots");
            int slots = foo.nextInt();
            System.out.println("Enter force");
            int force = foo.nextInt(); // read input
            System.out.println("Enter force");
            int force1 = foo.nextInt(); // read input

            Spinner.__init__(slots);
            Spinner.spin(force);
            Spinner.spin(force1);
        }
        Spinner.spin_randomly();
    }

    static int size; static int force; static int position;

    static void __init__(int slots){
        size = slots;
        position = 0;
    }        
    static void spin(int force){
        position = position + force;
        position = position % size;
        System.out.println(position);
    }
    static void spin_randomly(){
        Random ran = new Random();
        position = ran.nextInt(size);
        System.out.println(position);
    }
}
