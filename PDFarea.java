import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
        char[] str = word.toCharArray();
    int maxH = 0;
    for(int i=0; i<word.length(); i++){
        if(str[i] == ' '){
            continue;
            }
        if(maxH < (h.get((int) str[i] - 97))){
            maxH = (h.get((int) str[i] - 97));
        }
        
    }
    int area = maxH * str.length;
    return area;

    }

}


public class PDFarea {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] hTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hTemp[i]);
            h.add(hItem);
        }

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
