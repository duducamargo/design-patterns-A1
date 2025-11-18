package chain;

public class HistoryCheck extends BaseCheck {

    @Override
    public boolean check(Transaction tx) {
        System.out.println("[CHECK] Verificando histórico...");

        if (tx.userScore < 50) {
            System.out.println("❌ Transação barrada: histórico ruim!");
            return false;
        }

        return checkNext(tx);
    }
}
