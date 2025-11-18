package chain;

public class DeviceCheck extends BaseCheck {

    @Override
    public boolean check(Transaction tx) {
        System.out.println("[CHECK] Verificando dispositivo...");

        if (tx.device.equalsIgnoreCase("unknown")) {
            System.out.println("❌ Transação barrada: dispositivo incomum!");
            return false;
        }

        return checkNext(tx);
    }
}
