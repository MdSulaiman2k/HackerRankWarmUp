import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
           int cnt = 0 ;
        boolean[] check = new boolean[n] ;
        Arrays.fill(check , false) ;
        for(int j =0 ; j < n ; j++){
            for(int i = 0 ;  i < n && check[j] == false ; i++){
                if(ar[i] == ar[j] && !check[i] && i!=j ){
                    check[i] = true ;
                    check[j] = true ; 
                    break;
                }
            }
            if(!check[j]){
                cnt++ ;
            }
        }
        return (n-cnt)/2 ;
    }



    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
