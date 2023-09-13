class StringToOThertypes{
    public static void main(String args[]){
        String s="100";
        Object o=s;//string to object
        Integer i=Integer.parseInt(s); //string to wrapper class type
        int k=Integer.parseInt(s);//string to primitive types.
        System.out.println(s);
        System.out.println(o);
        System.out.println(i);
        System.out.println(k);
       
    //    String p="k";
    //    char c=Character.parseChar(p);// not possible
    //     System.out.println(c);


    }
}