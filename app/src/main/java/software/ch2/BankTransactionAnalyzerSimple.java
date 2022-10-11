package software.ch2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCE = "/Users/jihwooon/Documents/Real-World-Software-Development/app/src/main/resources/";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCE + "bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;

        for (String line : lines) {
            final String[] columns = line.split(",");
            System.out.println("columns = " + Arrays.toString(columns));
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("total = " + total);
    }
}
