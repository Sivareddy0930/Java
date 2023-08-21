class Animal{
    int Eyes=2;
    static String s="Animal";
    void m1(){
        System.out.println("SingelLevel inheritance parent class or Animal class.....");
    }

    static void eat(){
        System.out.println("All animals are Eating.....................");
    }

    
}

class Dog extends Animal{
        void bark(){
        System.out.println("Barking.......");
       }
}

public class SingelLevel{
    public static void main(String[] args){
            //.............................................................
           /* Dog d=new Dog();
            System.out.println(d.Eyes);
            System.out.println(d.s);//Animal
            System.out.println(Dog.s);
            System.out.println(Animal.s);

            d.m1();
            d.bark();
            d.eat();
            Dog.eat();
            Animal.eat();
            */
//...........................................................................................

/*
           Animal a=new Animal();
            System.out.println(a.Eyes);
            System.out.println(a.s);
            System.out.println(Animal.s);
            System.out.println(Dog.s);
            
            a.m1();
            
            // a.bark();  // due to parent class referance and object we can't access.

            a.eat();
            Animal.eat();
            Dog.eat();

*/
//......................................................................................................

           Animal a=new Dog();
            System.out.println(a.Eyes);
            System.out.println(a.s);
            System.out.println(Animal.s);
            System.out.println(Dog.s);
            
            a.m1();
            
            //a.bark();// due to parent class referance and object of child  we can't access.
                       // if there is same method in parent also due to overridding child class bark method is executed.  

            a.eat();
            Animal.eat();
            Dog.eat();


            //Dog a=new Animal();
            //it is not possiable.


    }
}