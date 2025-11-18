package chain;

public class GeoCheck extends BaseCheck {

    @Override
    public boolean check(Transaction tx) {
        System.out.println("[CHECK] Verificando geolocalização...");

        if (!tx.location.equalsIgnoreCase("BR")) {
            System.out.println("❌ Transação barrada: país suspeito!");
            return false;
        }

        return checkNext(tx);
    }
}
