import java.io.*;


class Result {

    /*
     * Complete the 'taumBday' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER b
     *  2. INTEGER w
     *  3. INTEGER bc
     *  4. INTEGER wc
     *  5. INTEGER z
     */

    public static long taumBday(int b, int w, int bc, int wc, int z) {
    // Write your code here
    // Calculate the cost of buying all black gifts and all white gifts without conversion
    long costWithoutConversion = (long) b * bc + (long) w * wc;

    // Calculate the cost of buying all black gifts and converting some to white
    long costWithConversionToWhite = (long) b * bc + (long) w * (bc + z);

    // Calculate the cost of buying all white gifts and converting some to black
    long costWithConversionToBlack = (long) b * (wc + z) + (long) w * wc;

    // Return the minimum cost among the three scenarios
    return Math.min(costWithoutConversion, Math.min(costWithConversionToWhite, costWithConversionToBlack));
}

    }



public class BlackWhiteGifts {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int b = Integer.parseInt(firstMultipleInput[0]);

            int w = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int bc = Integer.parseInt(secondMultipleInput[0]);

            int wc = Integer.parseInt(secondMultipleInput[1]);

            int z = Integer.parseInt(secondMultipleInput[2]);

            long result = Result.taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
