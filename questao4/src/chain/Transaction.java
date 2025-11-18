package chain;

public class Transaction {
    public double amount;
    public String location;
    public int userScore;
    public String device;

    public Transaction(double amount, String location, int userScore, String device) {
        this.amount = amount;
        this.location = location;
        this.userScore = userScore;
        this.device = device;
    }
}
