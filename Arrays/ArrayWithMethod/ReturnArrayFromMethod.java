public class ReturnArrayFromMethod {
    //creating method which returns an array .

        static int[] test(){
            return new int[]{1,2,3,4,5,6,7,8};
        }
    
    public static void main(String[] args) {
        int arr[]=test();

        for (int i : arr) {
            System.out.println(i);
            
        }
    }
}
