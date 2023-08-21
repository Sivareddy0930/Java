class Animal{

}
class Monkey extends Animal{

}




public class Case7{

          void m1(Animal i){
                System.out.println("Animal- arugment ");
        }
        void m1(Monkey x){  
                System.out.println("Monkey arugment ");           
        }
        

       

        public static void main(String[] args){

                Case7 obj=new Case7();

               Animal a=new Animal();
                obj.m1(a);
                Monkey m=new Monkey();
                obj.m1(m);

                Animal am=new Monkey();

                obj.m1(am);
               

        }
}