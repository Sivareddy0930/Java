
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        char[] c={'a','b'};
        System.out.println(c);

        List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> t = new ArrayList<Integer>();
        t.add(10);
        t.add(20);

        System.out.println(t);
        System.out.println(lt);

        System.out.println(lt.get(5));

        char cs = 'b';
        System.out.println(cs);

        int[] i={1,2};
        System.out.println(i[1]);

        Integer arr[] = {5,4,3,2,1};
        System.out.println(arr.toString());


        int m = 5;
        System.out.println(m);

        float[] f={1.2f,2.2f};
        System.out.println(f);


        Object [] o={'a','b',1,2};
        System.out.println(o);

        String[] arr1={"abc","def"};
        System.out.println(arr1);

        Test obj=new Test();
        System.out.println(obj);

    }
}
