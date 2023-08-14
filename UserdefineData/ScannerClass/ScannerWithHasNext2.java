import java.util.Scanner;
public class ScannerWithHasNext2{
    public static void main(String[] args) {
        Scanner sc=new Scanner("true 1 2.4 siva true");

        while (sc.hasNext()) {
            if (sc.hasNextBoolean()) {
                System.out.println("boolean type: " + sc.nextBoolean());
            } else if (sc.hasNextInt()) {
                System.out.println("int type: " + sc.nextInt());
            } else if (sc.hasNextDouble()) {
                System.out.println("double type: " + sc.nextDouble());
            } else {
                System.out.println("string type: " + sc.next());
            }
        }

    }
}