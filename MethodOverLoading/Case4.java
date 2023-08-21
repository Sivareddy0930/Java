public class Case4{

        void m1(String s){
                System.out.println("String-arugment " +s);
        }
        void m1(StringBuffer sb){  
                System.out.println("StringBuffer -arugment " +sb);           
        }
        

       

        public static void main(String[] args){

                Case4 c=new Case4();

                c.m1("Siva");//String-arugment
                c.m1(new StringBuffer("Reddy"));

                c.m1(null);//CE:-Reference to m1 is ambigouus.
                //Because Both String and StringBuffer accept null as value and both are child class to Object(In directly).
                //so here String and StringBuffer both are Same level .

        }
}