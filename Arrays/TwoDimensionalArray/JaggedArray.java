package TwoDimensionalArray;
//If we are creating odd number of columns in a 2D array, it is known as a jagged array.
public class JaggedArray {
   public static void main(String[] args) {
     int arr[][]={{10,20},{40,50,60},{70,80}};

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.println(arr[i][j]);
        }
    }
   }
}
