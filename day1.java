import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Advent {
    public static void main(String[] args) {
        // Specify the file path directly
        String filePath = "input.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            int p1 = 0;
            int p2 = 0;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                char[] lineChars = line.toCharArray();
                StringBuilder p1Digits = new StringBuilder();
                StringBuilder p2Digits = new StringBuilder();

                for (int i = 0; i < lineChars.length; i++) {
                    char c = lineChars[i];
                    if (Character.isDigit(c)) {
                        p1Digits.append(c);
                        p2Digits.append(c);
                    }
                     System.out.println (p1Digits);
                        System.out.println (p2Digits);

                    String[] values = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                    for (int d = 0; d < values.length; d++) {
                        String val = values[d];
                        if (line.substring(i).startsWith(val)) {
                            p2Digits.append(d + 1);
                        }
                    }
                }

               

                p1 += Integer.parseInt(p1Digits.charAt(0) + "" + p1Digits.charAt(p1Digits.length() - 1));
                p2 += Integer.parseInt(p2Digits.charAt(0) + "" + p2Digits.charAt(p2Digits.length() - 1));
            }

            System.out.println(p1);
            System.out.println(p2);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
