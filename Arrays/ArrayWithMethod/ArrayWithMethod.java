public class ArrayWithMethod {
    static void test(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        ArrayWithMethod.test(a);

    }
}