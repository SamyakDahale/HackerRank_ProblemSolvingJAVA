import java.io.*;
// look at the pvsm main function   
// convert AM and PM String timings into 24 hour clock. 
/* Ex. 12:00:45PM = 12:00:45
 * 03:00:45PM = 15:00:45
 */

class Result {
    public static String timeConversion(String s) {
    // Write your code here
    char[] ch = s.toCharArray();
    int len = ch.length;
    char[] chnew = new char[len-2];
    String res;
    
    if(ch[len-2] == 'A' && ch[0] == '1' && ch[1]=='2'){
        ch[0] = '0';
        ch[1]='0';
    }
    
    if(ch[len-2] == 'P'){
        if(ch[0] != '1' && ch[1]!='2'){
            int ch1 = Character.getNumericValue(ch[1]);
            int ch0 = Character.getNumericValue(ch[0]);
            ch1+=2;
            ch0 += 1;
            if(ch1>9){
               ch0 += 1;
               ch1 -=10;   
            }
            ch[0] = Character.forDigit(ch0, 10);
            ch[1] = Character.forDigit(ch1, 10);
        }
    }

    for(int i=0;i<len-2;i++){
        chnew[i] = ch[i];
    }
    res = new String(chnew);
    return res;
    
}
}


public class TimeString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        // Provide a default output file path if the environment variable is not set
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath == null) {
            outputPath = "output.txt"; // Default output file path
        }
    
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
    
        String s = bufferedReader.readLine();
    
        String result = Result.timeConversion(s);
        System.out.println(result);
    
        bufferedWriter.write(result);
        bufferedWriter.newLine();
    
        bufferedReader.close();
        bufferedWriter.close();
    }
    
}
 