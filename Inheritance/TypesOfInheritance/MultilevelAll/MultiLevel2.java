class Animal{
    int Eyes=2;
    static String type="Animal";
    void m1(){
        System.out.println("MultiLevel inheritance parent class or Animal class.....");
    }

    static void eat(){
        System.out.println("All animals are Eating.....................");
    }

     void bark(){
        System.out.println("Barking.......");
       }

    
}

class Dog extends Animal{
        void bark(){
        System.out.println("Barking.......Dog");
       }
}

class BabyDog extends Dog{
    void Weep(){
        System.out.println("Weeping.......");
     }

    //  overriden method of bark in Dog class
      void bark(){
        System.out.println("Barking.......Wou..Wou");
       }

}

class MultiLevel{
    public static void main(String[] args){
/*
        BabyDog b=new BabyDog();

        System.out.println(b.Eyes);
        System.out.println(b.type);
        System.out.println(Dog.type);
        System.out.println(BabyDog.type);
        
        b.m1();
        b.eat();
        Animal.eat();
        Dog.eat();
        BabyDog.eat();
        b.bark();
        b.Weep();
*/
//.............................................................

 /*        Animal b=new Animal();

        System.out.println(b.Eyes);
        System.out.println(b.type);
        System.out.println(Dog.type);
        System.out.println(BabyDog.type);
        
        b.m1();
        b.eat();
        Animal.eat();
        Dog.eat();
        BabyDog.eat();
        // b.bark();//CE:-due to parent reference
        // b.Weep();//CE:-due to parent reference
        
  */
 //------------------------------------------------------------------------

         Animal b=new BabyDog();

        System.out.println(b.Eyes);
        System.out.println(b.type);
        System.out.println(Dog.type);
        System.out.println(BabyDog.type);
        
        b.m1();
        b.eat();
        Animal.eat();
        Dog.eat();
        BabyDog.eat();
        b.bark();//CE:-due to parent reference
       // b.Weep();//CE:-due to parent reference
                       // if there is same method in parent also due to overridding child class bark method is executed.  
              

        


    }
}
