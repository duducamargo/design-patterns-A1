import core.ReportService;
import factory.DailyReportFactory;
import factory.WeeklyReportFactory;
import factory.ReportFactory;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Use: daily ou weekly");
            return;
        }

        String type = args[0].toLowerCase();

        ReportFactory factory = null;

        switch(type) {
            case "daily":
                factory = new DailyReportFactory();
                break;
            case "weekly":
                factory = new WeeklyReportFactory();
                break;
            default:
                System.out.println("Tipo inválido: " + type);
                return;
        }

        ReportService service = new ReportService();
        service.generateReport(factory);
    }
}
