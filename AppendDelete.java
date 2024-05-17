import java.io.*;
import java.math.*;
class  Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
    int steps=0; 
    char[] ss  = s.toCharArray();
    char[] tt  = t.toCharArray();
    steps = Math.abs(ss.length - tt.length);
    int low = Math.min(ss.length, tt.length);
    int mul =0 ;
    for(int i  = 0; i<low;i++){
        if(ss[i] != tt[i]){
            mul =i;
            break;
        }
    }
    steps = (low - mul) * 2;
    String res;
    if(steps<=k){
        res = "Yes";
    } else {
        res = "No";
    }
    return res;
    }

}

public class AppendDelete {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
