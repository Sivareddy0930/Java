class Stringbuffer{
    public static void main(String args[]){
        String s="aSaivaa";
        StringBuffer sb=new StringBuffer("Venkata");

        StringBuffer sb1=new StringBuffer( s);
        StringBuffer sb2=new StringBuffer(5);// userdefined capacity
        StringBuffer sb3=new StringBuffer();

        //default capacity 16.
        //thread safe 
        //mutable

        //methods.

        sb.append("sivareddyTumu");

        System.out.println(sb);

    //insert
        sb.insert(0,"Good Morning ");
        sb.insert(4,"!");

        System.out.println(sb);

    //replace

        sb.replace(6,13,"Evening");
        System.out.println(sb);

        s=s.replace("a","e");
        System.out.println(s);


    //delete()

    sb.delete(0,14);
     System.out.println(sb);



        //capacity()

        
        System.out.println(sb.capacity());
        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());
        

        //subString()

        System.out.println(sb.substring(0,7));

        //reverse()

        System.out.println(sb.reverse());

        //length()

        System.out.println(sb.length());

        //charAt()
        sb.reverse();
        System.out.println(sb.charAt(0));

        //indexOf() and lastIndexOf()

        
        System.out.println(sb.indexOf("a"));
        System.out.println(sb.lastIndexOf("a"));

        //deleteCharAt()
        System.out.println(sb.deleteCharAt(4));
        
        //setCharAt()
       sb.setCharAt(3,'a');
        System.out.println(sb);
        sb.insert(3,"k");
        System.out.println(sb);
         



    }
}