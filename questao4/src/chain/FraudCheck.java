package chain;

public interface FraudCheck {
    void setNext(FraudCheck next);

    boolean check(Transaction tx);
}
