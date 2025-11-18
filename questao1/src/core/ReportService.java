package core;

import factory.ReportFactory;

public class ReportService {

    public void generateReport(ReportFactory factory) {
        Report report = factory.createReport();
        report.generate();
    }
}
