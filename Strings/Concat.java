public class Concat{
    public static void main(String args[]){

        
        //concat()

        String s="Siva";
        s.concat("reddy");
        s=s.concat("reddy");
        String s1=new String("Siva");
        s1.concat("Reddy");
        s1=s1.concat("Reddy");
        
        System.out.println(s);
        System.out.println(s1);

        //+

        String s2="Ok"+"Bro";//Strore in SCP
        String s3="new";
        String s4=s3+"problem";
        System.out.println(s2);
        System.out.println(s4);


        String s5=new String("kk");
        String s6=new String("pp");

        String s7=s5+s6;//Store in Heap
        System.out.println(s7);
        String s8=s5.concat(s6);
        System.out.println(s8);
        
        




       






    }
}