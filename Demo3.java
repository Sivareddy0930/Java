


interface Demo3 {

       public static final int a=10;
      
    
}

 class A implements Demo3{

        static int a=20;
        //it consider as new variable not overridden
    
   
     public static void main(String[] args) {

        // System.out.println(Demo3.a);
        System.out.println(a);

     }
}

