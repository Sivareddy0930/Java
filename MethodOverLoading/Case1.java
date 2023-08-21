public class Case1{

        void m1(int i){

        }
        int m1(int i){   //CE:-method m1() is already decleared.because we don't consider returnType in overloading.
            return 10;
        }


        public static void main(String[] args){

                Case1 c=new Case1();
                c.m1(100);
        }
}