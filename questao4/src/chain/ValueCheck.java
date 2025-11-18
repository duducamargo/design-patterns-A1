package chain;

public class ValueCheck extends BaseCheck {

    @Override
    public boolean check(Transaction tx) {
        System.out.println("[CHECK] Verificando valor...");

        if (tx.amount > 5000) {
            System.out.println("❌ Transação barrada: valor muito alto!");
            return false;
        }

        return checkNext(tx);
    }
}
