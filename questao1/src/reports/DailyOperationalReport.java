package reports;

import core.Report;

public class DailyOperationalReport extends Report {

    @Override
    protected void collectData() {
        rawData = "Dados diários: entregas, ocorrências, rotas, prazos...";
        System.out.println("[Daily] Coletando dados de sistemas em tempo real...");
    }

    @Override
    protected void processMetrics() {
        System.out.println("[Daily] Processando métricas operacionais do dia...");
    }

    @Override
    protected void format() {
        formattedData = "[RELATÓRIO DIÁRIO]\n" +
                        "Conteúdo: " + rawData + "\n" +
                        "Métricas priorizadas: OTIF diário, ocorrências.\n";
    }
}
