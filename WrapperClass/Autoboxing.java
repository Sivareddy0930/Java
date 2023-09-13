//wrapper class is a functionality to convert primitive to objects and objectsto primitivies .
//For every Primitive type corrsponding wrapper class type is there.
//from java 1.5 they introduced autoboxing and unboxing concept to convert automatically from primitive to objects and vice-versa.
//we can convert manually from primitive to object by using valueOf() method.

class Autoboxing{
    public static void main(String args[]){
        int i=10;
        Integer j=Integer.valueOf(i);//manually we are converting
        Integer a=i;//autoboxing
        System.out.println(i);
        System.out.println(j);
        System.out.println(a);
        System.out.println(j.getClass());
        //----------------------------------------------
        char ch='c';
        Character cha=Character.valueOf(ch);
        System.out.println(ch);
        System.out.println(cha);
        System.out.println(cha.getClass());

    }
}