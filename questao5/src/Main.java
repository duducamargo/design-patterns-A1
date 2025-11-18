import java.util.Scanner;
import logger.LoggerSingleton;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LoggerSingleton logger = LoggerSingleton.getInstance();

        System.out.println("=== Sistema de Logging Unificado ===");
        
        while (true) {
            System.out.print("\nDigite o tipo de log (info, error, audit) ou 'exit': ");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("exit")) break;

            System.out.print("Digite a mensagem: ");
            String message = scanner.nextLine();

            logger.log(type, message);
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}
