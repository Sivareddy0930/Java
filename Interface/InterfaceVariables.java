interface A{
        // public static final  by default.
    public static final int i=10000;
}
class Demo implements A{
    public static void main(String[] args){
        System.out.println(i);
    }
}