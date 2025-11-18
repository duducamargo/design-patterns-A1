package factory;

import core.Report;
import reports.DailyOperationalReport;

public class DailyReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return new DailyOperationalReport();
    }
}
