package Chapter15;

import java.io.*;

public class Example4 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        try {
            String userInput = reader.readLine();
            System.out.println("LINE::::: " + userInput.toUpperCase());
        } catch (IOException e) {
            System.out.println(e.getMessage()
            );
        }

    }
}
