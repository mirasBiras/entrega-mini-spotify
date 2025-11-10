import java.util.Scanner;

public class LeitorSeguro {

    private static Scanner scanner = new Scanner(System.in);

    public int lerIntSeguro() {
        while (true) {
            try {
                String line = scanner.nextLine().trim();
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("\nEntrada inválida. Digite um número: ");
            }
        }
    }
}
