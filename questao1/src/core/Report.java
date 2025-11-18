package core;

public abstract class Report {

    protected String rawData;
    protected String formattedData;

    public final void generate() {
        collectData();
        processMetrics();
        format();
        export();
    }

    protected abstract void collectData();
    protected abstract void processMetrics();
    protected abstract void format();

    protected void export() {
        System.out.println("=== Exportação ===");
        System.out.println(formattedData);
    }
}
