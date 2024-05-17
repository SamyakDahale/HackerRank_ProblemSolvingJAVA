import java.io.*;

import java.util.*;

class Result {

    /*
     * Complete the 'fairRations' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static String fairRations(List<Integer> B) {
    // Write your code here
    String res="" ; 
    int count =0 ;
    for(int i =0; i<B.size();i++){
        int next = i+1;
        if(B.get(i)%2==0){
            continue;
        } else {
            B.set(i, B.get(i) + 1);
            count ++; 
            if(next>=B.size()){ /* IF there is need to increaset he last element;  
                it will give rise to nending loop . Thus retrurn NO*/ 
                res = "NO";
                return res;
            } else {
             B.set(i+1, B.get(i+1) + 1);
             count++;
            }
             
            // }
        }
    }
    if(count == 0 ){
        res = Integer.toString(0);    
    } else {
    res = Integer.toString(count);}
    
    
    return res; 
    

    }

}

public class BreadKing {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        String[] BTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> B = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BTemp[i]);
            B.add(BItem);
        }

        String result = Result.fairRations(B);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
