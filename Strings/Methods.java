public class Methods{
    public static void main(String args[]){

        
        String s="Java programming";
         String s1="java programminG";

        System.out.println(s.charAt(4));

        System.out.println(s.length());

        System.out.println(s.substring(2));//begining index
        System.out.println(s.substring(2,7));//begining index is include,last index is exclude.

        System.out.println(s.contains("g"));//true
        // System.out.println(s.contains('g'));
        System.out.println(s.contains("gramm"));//true

        System.out.println(s.equals(s1));//false
        System.out.println(s.equalsIgnoreCase(s1));//true

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.isEmpty());

        //----------------------------------------

        String s2="Siva full stack developer";

        System.out.println(s2);

        System.out.println(s2.replace('d','D'));
        System.out.println(s2.replace("full stack","Java"));

        //------------------------------------
        String s3="Siva full stack developer";

        String arr[]=s3.split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String arr1[]=s3.split("l");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);

       
        //intern() used to push string in to scp.

        String s4=new String("Siva");
        String s5="Siva";//for every literal compiler add intern method implictily.

        System.out.println(s4==s5);//false

        String s6=s4.intern();
        System.out.println(s5==s6);//true

         //indexOf()
        String s7="VenkataSivaReddyTumu";
        System.out.println(s7.indexOf("a"));
        System.out.println(s7.indexOf("Tumu"));
       

        //trim()

        String s8="     VenkataSivaReddyTumu   ";

        System.out.println(s7);
        System.out.println(s7.trim());

      //compareTo()

      String q1="Siva";
      String q2="Siva";
      String q3="Reddy";
      //it compare Lixogriphical value .
        System.out.println(q1.compareTo(q2));//0 because both same
        System.out.println(q1.compareTo(q3));//1
        System.out.println(q3.compareTo(q1));//-1

        //java 8 join() in  strings.

      String t="Siva";
      String t1="Reddy";
       System.out.println(String.join("",t,t1));
       System.out.println(String.join(",",t,t1));

    //startsWith() and endsWith()
       System.out.println(q1.startsWith("S"));
       System.out.println(q1.endsWith("S"));







    }
}