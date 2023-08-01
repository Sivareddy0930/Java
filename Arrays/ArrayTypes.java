//Array with diffrent ways to create. and print directly.

public class ArrayTypes{
    public static void main(String[] args) {

        char[] c={'a','b'};
        System.out.println(c);


        int[] i={1,2};
        System.out.println(i);

        float[] f={1.2f,2.2f};
        System.out.println(f);


        Object [] o={'a','b',1,2};
        System.out.println(o);

        String[] arr1={"abc","def"};
        System.out.println(arr1);

        ArrayTypes obj=new ArrayTypes();
        System.out.println(obj);

    }
}

//output:-
//ab
//[I@4617c264
//[F@36baf30c
//[Ljava.lang.Object;@7a81197d
//[Ljava.lang.String;@5ca881b5
//ArrayTypes@24d46ca6