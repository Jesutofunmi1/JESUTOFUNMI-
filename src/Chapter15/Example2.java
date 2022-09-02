package Chapter15;

import java.io.*;

public class Example2 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String sentence = bufferedReader.readLine();
            PrintStream printStream = new PrintStream("test.txt");
//            writer.println("Oma is a Princess!");
            PrintWriter printWriter = new PrintWriter("");
        printStream.println(sentence.toUpperCase());
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
}
