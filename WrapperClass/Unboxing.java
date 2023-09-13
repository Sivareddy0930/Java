
//we can convert manually from object to primitive by using datatypevalue() method.
//Unboxing

class Unboxing{
    public static void main(String args[]){
        Integer i=100;
        int j=i.intValue();//manually from object to primitive.
        int k=i;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(i.getClass());

    }
}