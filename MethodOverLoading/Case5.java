public class Case5{

          void m1(int i,float f){
                System.out.println("int-Float arugment ");
        }
        void m1(float f,int i){  
                System.out.println("float-Int arugment ");           
        }
        

       

        public static void main(String[] args){

                Case5 c=new Case5();

                c.m1(10,10.5f);//int-Float arugment
                c.m1(11.5f,11);//float-Int arugment 
                c.m1(10,10);//CE:-Reference to m1 is ambigouus.
                c.m1(10.5f,10.5f);//CE:-not sutabile method found , possible lossy conversition from float to int.

               

        }
}