import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String newExtension = scanner.nextLine();

        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex != -1) {
            fileName = fileName.substring(0, lastDotIndex);
        }
        String updatedFileName = fileName + "." + newExtension;
        System.out.println(updatedFileName);
    }
}
