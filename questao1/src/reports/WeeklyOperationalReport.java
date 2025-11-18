package reports;

import core.Report;

public class WeeklyOperationalReport extends Report {

    @Override
    protected void collectData() {
        rawData = "Consolidado semanal: volumes, SLA, custos...";
        System.out.println("[Weekly] Coletando dados consolidados da semana...");
    }

    @Override
    protected void processMetrics() {
        System.out.println("[Weekly] Calculando tendência semanal e indicadores gerenciais...");
    }

    @Override
    protected void format() {
        formattedData = "[RELATÓRIO SEMANAL]\n" +
                        "Conteúdo: " + rawData + "\n" +
                        "Métricas: evolução do SLA, custos por rota.\n";
    }
}
