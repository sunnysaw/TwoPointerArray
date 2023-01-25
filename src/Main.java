/*
Question(0.1) : Sort an array consisting of only 0s and 1s.(YOU CAN USE EXTRA SPACE :)
 */

public class Main {
    public static void main(String[] args) {
        int count = 0, temp = 0;
        int[] arr = {1,0,0,1,0,1,1,0,0};
        for (int k : arr) {
            if (k == 0) {
                count++;
            } else
                temp++;
        }
        System.out.println("NUMBER OF ZERO IN ARRAY IS : " + count);
        System.out.println("NUMBER OF ONE IN ARRAY IS : " + temp);
        for (int i = 0; i <= count; i++){
            System.out.print( " " + "0" );
        }
        for (int j = 0; j <= temp; j++){
            System.out.print(" "+ "1");
        }
    }
}