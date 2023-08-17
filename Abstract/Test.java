 abstract class Test{
    int a=1022;
    static int b=20;
    final int c=30;
    private int p=100;
    protected int pp=200;
    public int pu=400;
    volatile int v=500;
     transient int t=900;

 abstract void m1();
 final void m2(){}
 static void m3(){}
  void m4(){}
 private void m5(){}
 protected void m6(){}
 public void m7(){}
 synchronized void m8(){}
//  strictfp void m9(){}
// from java17 strictfp is not reccomended.
 native void m10();



}