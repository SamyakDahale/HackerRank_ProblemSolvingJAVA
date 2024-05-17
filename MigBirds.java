import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

class Result {
    
    /*
     * Complete the 'migratoryBirds' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     
    public static int migratoryBirds(List<Integer> arr) {
    int MaxID = Integer.MAX_VALUE;
    int MaxIDcount =0;
    Collections.sort(arr);
    int tempcount =0;
    for (int i = 0; i < arr.size()-1; i++){
        
        if(arr.get(i) == arr.get(i+1)){
            tempcount ++;
        } else {
             tempcount =0;
             continue;
        }
        if(tempcount>MaxIDcount){
            MaxIDcount = tempcount;
            MaxID = arr.get(i);            
        }
        
    }
    
    
    return MaxID;
    }

}

public class MigBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
