class Animal{
    int Eyes=2;
    static String type="Animal";
    void m1(){
        System.out.println("MultiLevel inheritance parent class or Animal class.....");
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

class Cat extends Animal{
        void Meow(){
        System.out.println("Meowing.......");
       }
}

public class Hierarchical{  
public static void main(String args[]){  

    /*
            Cat c=new Cat();  
        System.out.println(c.Eyes);
        System.out.println(c.type);
        System.out.println(Animal.type);
        System.out.println(Dog.type);
        System.out.println(Cat.type);

        c.m1();
        c.eat();
        Dog.eat();
        Cat.eat();
        //c.bark();//CE:-because not in inheritance 
        c.Meow();
    */
//---------------------------------------------------------------------------------------------------
       /* 
            Animal c=new Animal();  
        System.out.println(c.Eyes);
        System.out.println(c.type);
        System.out.println(Animal.type);
        System.out.println(Dog.type);
        System.out.println(Cat.type);

        c.m1();
        c.eat();
        Dog.eat();
        Cat.eat();
        //c.bark();//CE:-Due to parent Reference. 
        //c.Meow();//CE:-Due to parent Reference. 

        */
//---------------------------------------------------------------------------------------------------

    /*
            Animal c=new Cat();  
        System.out.println(c.Eyes);
        System.out.println(c.type);
        System.out.println(Animal.type);
        System.out.println(Dog.type);
        System.out.println(Cat.type);

        c.m1();
        c.eat();
        Dog.eat();
        Cat.eat();
        c.bark();//CE:-Due to parent Reference. 
        c.Meow();//CE:-Due to parent Reference. 
*/
//--------------------------------------------------------

  /*          Animal c=new Dog();  
        System.out.println(c.Eyes);
        System.out.println(c.type);
        System.out.println(Animal.type);
        System.out.println(Dog.type);
        System.out.println(Cat.type);

        c.m1();
        c.eat();
        Dog.eat();
        Cat.eat();
        c.bark();//CE:-Due to parent Reference. 
        c.Meow();//CE:-Due to parent Reference. 

    */

          Animal c=new BabyDog();  
        System.out.println(c.Eyes);
        System.out.println(c.type);
        System.out.println(Animal.type);
        System.out.println(Dog.type);
        System.out.println(Cat.type);

        c.m1();
        c.eat();
        Dog.eat();
        Cat.eat();
        c.bark();//CE:-Due to parent Reference. 
        c.Meow();//CE:-Due to parent Reference.
}}  
