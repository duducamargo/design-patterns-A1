package factory;

import core.Report;
import reports.WeeklyOperationalReport;

public class WeeklyReportFactory implements ReportFactory {

    @Override
    public Report createReport() {
        return new WeeklyOperationalReport();
    }
}
