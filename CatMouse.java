import java.io.*;
import java.util.*;


public class CatMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int CatA = Math.abs(x-z);
        int CatB = Math.abs(y-z);
        String res="";
        if(CatA<CatB){
            res = "Cat A";
        }
        if(CatA>CatB){
            res =  "Cat B";
        }
        if(CatA==CatB){
            res = "Mouse C";
        }
        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
