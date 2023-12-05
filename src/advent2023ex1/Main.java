package advent2023ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String PATH_FILE = "src/advent2023ex1/resource/input.txt";
    private static List<String> inputList = new ArrayList<>();

    static StringBuilder numberAppended;

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(PATH_FILE);

        BufferedReader reader = Files.newBufferedReader(path);

        while (reader.readLine() != null) {

            String input = reader.readLine();
            numberAppended = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {

                if (Character.isDigit(input.charAt(i))) {
                    numberAppended.append(input.charAt(i));
                }
            }

            inputList.add(numberAppended.toString());

        }

        System.out.println(inputList);

    }
}