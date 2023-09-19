public class CreateString{
    public static void main(String args[]){

        String s="Siva";
        String s1=new String("Siva");
        System.out.println(s);
        System.out.println(s1);
        //String Constructors.
            StringBuffer sb=new StringBuffer("Bro");
            StringBuilder sb1=new StringBuilder("OK");
           char c[]={'c','a','c','p'};
           byte b[]={97,98,99,100};
           byte bb[]={1,2,3,4};

        String s2=new String();
        String s3=new String("Siva Reddy");
        String s4=new String(sb);
        String s5=new String(sb1);
        String s6=new String(c);
        String s7=new String(b);      
        String s8=new String(bb);      

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);






    }
}