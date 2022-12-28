import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the file path of the file you wish to evaluate: ");
            String filePath = scanner.nextLine();
            int oddCount = countOddNumbersInFile(filePath);
            System.out.println(oddCount);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int countOddNumbersInFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int oddCount = 0;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
    }
}