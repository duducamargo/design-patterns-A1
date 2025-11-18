package chain;

public abstract class BaseCheck implements FraudCheck {

    protected FraudCheck next;

    @Override
    public void setNext(FraudCheck next) {
        this.next = next;
    }

    protected boolean checkNext(Transaction tx) {
        if (next == null)
            return true;
        return next.check(tx);
    }
}
