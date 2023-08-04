

public class Instancevariables {
     //instance variables .
    //instance variables or non-static variables
    //instance variables are different from object to object.
    // if we update instance variable of one object it will not effect to another objects.
    // created at inside class and outside method.
    //it will access and update through only object.
    int a=10;

    public static void main(String[] args) {
            Instancevariables obj=new Instancevariables();
            System.out.println(obj.a);
            obj.a=100;
            System.out.println(obj.a);
    }    
}
//to compile and execute we have use package related syntax here .
// because we using package to store  our class.
// to compile we need to mention  directory 
//ex:- javac -d.Instancevariables.java
// to execute we need package name.
//eex:- java Variables.Instancevariables 