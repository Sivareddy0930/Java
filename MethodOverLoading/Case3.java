public class Case3{

        void m1(String s){
                System.out.println("String-arugment " +s);
        }
        void m1(Object o){  
                System.out.println("Object as a-arugment " +o);           
        }

        //NOTE:- generally when resolving overloaded methods compiler will always give high preferance to child type class.
        //here  String extends Object class. BY default.

        public static void main(String[] args){

                Case3 c=new Case3();

                c.m1("Siva");//String-arugment
                 c.m1(10);//Object as a-arugment 
                c.m1(new Object());//Object as a-arugment 

                c.m1(null);//String-arugment
                //here null accept both methods because object accept EVERYTYPE of DATA and string also because default value of string is null.
                // but method with String variables is called here instead of Object type due to high preferance to child type.

        }
}