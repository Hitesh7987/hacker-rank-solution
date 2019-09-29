import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    int temp,j;
        for(int i=1; i<5; i++){
            temp = arr[i];
            j= i-1;
            while(temp<arr[j] && j>=0){
                arr[j+1] = arr[j];
                j=j-1;
                if(j<0)
                break;
            }
            arr[j+1] = temp;
        }
        long x = (long)arr[0]+arr[1]+arr[2]+arr[3];
        long y = (long)arr[4]+arr[1]+arr[2]+arr[3];
        System.out.print(x+" "+y);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
