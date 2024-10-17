import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p28 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CharacterCounter <file_path> <character>");
            return;
        }

        String filePath = args[0];
        char targetChar = args[1].charAt(0);
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (Character.toLowerCase((char) c) == Character.toLowerCase(targetChar)) {
                    charCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("The character '" + targetChar + "' appears " + charCount + " times in the file.");
    }
}