import java.util.Scanner;
import core.ReportService;
import factory.DailyReportFactory;
import factory.WeeklyReportFactory;
import factory.ReportFactory;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de relatório:");
        System.out.println("1 - Daily");
        System.out.println("2 - Weekly");
        System.out.print("Opção: ");

        int option = scanner.nextInt();

        ReportFactory factory = switch (option) {
            case 1 -> new DailyReportFactory();
            case 2 -> new WeeklyReportFactory();
            default -> {
                System.out.println("Opção inválida!");
                yield null;
            }
        };

        if (factory == null)
            return;

        ReportService service = new ReportService();
        service.generateReport(factory);

        scanner.close();
    }
}
