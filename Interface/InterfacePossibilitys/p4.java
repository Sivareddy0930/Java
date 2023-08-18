interface A{
    void m1();
}
interface B{
    int m1();
}
class C implements A,B{
    public void m1(){
        System.out.println("hi");
    }
     public int m1(){
        return 10;
    }
}