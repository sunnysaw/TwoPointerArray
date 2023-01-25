/*
Question(0.2) : Sort an array consisting of only 0s and 1s.(YOU CAN'T USE EXTRA SPACE :)
 */
public class TwoPointerArray2 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("PRINTING THE RESULT: ");
        for (int i = 0; i < arr.length; i++){
            if (i < count){
                arr[i] = 0;
            }else
                arr[i] = 1;
            System.out.print(" " + arr[i]);
        }
    }
}

