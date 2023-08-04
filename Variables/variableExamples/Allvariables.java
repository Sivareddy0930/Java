
public class Allvariables {

    int id=100;
    String name="siva";
    static String clg="prostack";

    
    // accessing variables in instance method.
    //both static and instance variables and methods can be access from instance method without object in class level.



    void m1(){
        int salary=50000;
        System.out.println(id);
        System.out.println(name);
        System.out.println(clg);
        System.out.println(salary);
    }

    // accessing variables in static method
        //only static variables and methods can be access from static method without object in class level.
        //for accessing instance methods and variables require object to access in static context.



    static void m2(){
        int salary=50000;
            
        Allvariables obj1=new Allvariables();

        System.out.println(obj1.id);
        System.out.println(obj1.name);
        System.out.println(clg);
        System.out.println(salary);


    }


    public static void main(String[] args) {
        Allvariables obj=new Allvariables();
        obj.m1();

        m2();
    }
}
