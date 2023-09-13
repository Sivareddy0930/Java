class OThertypesToString{
    public static void main(String args[]){
        OThertypesToString obj=new OThertypesToString();
        String s=obj.toString();//object to string
        System.out.println(s);

        Character c='s';
        String wc=Character.toString(c);// wrapper class to string
        System.out.println(wc);
        System.out.println(wc.getClass());


        boolean b=true;
        String bs=Boolean.toString(b);// primitive to string
        System.out.println(bs);
        System.out.println(bs.getClass());

        // String k="2.4";
        // float f=Float.parseFloat(k);
        // System.out.println(f);

       
    //    String p="k";
    //    char c=Character.parseChar(p);// not possible
    //     System.out.println(c);


    }
}