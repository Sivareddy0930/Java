public class Case6{

          void m1(int i){
                System.out.println("int- arugment ");
        }
        void m1(int... x){  
                System.out.println("vararg arugment ");           
        }
        

       

        public static void main(String[] args){

                Case6 c=new Case6();

                c.m1();//vararg arugment
                c.m1(10,20);//vararg arugment 
                c.m1(10);//int- arugment
        

                // grneral methods has highest priority than vararg method .
                //first check general method with int i . if not avaliable maching then go to vararg method.
               

        }
}