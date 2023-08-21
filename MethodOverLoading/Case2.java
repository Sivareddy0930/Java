public class Case2{

        void m1(int i){
                System.out.println("int-arugment " +i);
        }
        void m1(float f){  
                System.out.println("float-arugment " +f);           
        }
      


        public static void main(String[] args){

                Case2 c=new Case2();
                c.m1(100);//int-arugment
                c.m1(10.4f);//float-arugment
                c.m1(1000000000000l);//float-arugment  
                                        // due to auto promotion by compiler that from long to float type.

                c.m1('a');

                c.m1(10.5);//CE:-it is double type it is not appliacable.
                           //possible lossy conversition from double to float.

        }
}