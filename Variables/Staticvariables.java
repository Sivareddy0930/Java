


public class Staticvariables {

    //static variable are also know as class variables.
    //it can access directly in static context.
    // it can also access through classname and object.
    // it created with help of static keyword.
    // single copy of static variable shared among all instances .
    // if we update static variable in one object.it will effect in all objects.
    //it get memeory at time of classloding at runtime by jvm.
    //At time of classloading All static fields will get loaded and executed .After main method is called by JVM.
    //heap memory stores Stati members. 
    
    static int a=100;
    public static void main(String[] args) {
        Staticvariables obj=new Staticvariables();
        System.out.println(a);//Accessing directly.
        System.out.println(Staticvariables.a);
        System.out.println(obj.a);
    }
    
}
