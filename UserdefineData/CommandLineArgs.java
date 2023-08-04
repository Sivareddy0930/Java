// user can send data dynamically in two ways in java.
//1) Scanner class
//2)Command line Arugments.

class CommandLineArgs{
    public static void main(String[] args) {
        System.out.println(args[0]);        
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        //At runtime
        //java CommandLineArgs 10 20 30 40 
        // all consider as a strings because array type String[]


    }
}