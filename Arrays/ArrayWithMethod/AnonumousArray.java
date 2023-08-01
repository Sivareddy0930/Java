class AnonumousArray {
    static void test(int arr[]){
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);

        }
    }
// array with out name is known as anonumous Array.
    public static void main(String args[]){
        AnonumousArray.test(new int[]{1,2,3,4,5,6,});
    }
}