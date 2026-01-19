package transaction;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private String accountId;
    private double amount;
    private LocalDateTime timeStamp;
    
    // init
    public Transaction(String transactionId, String accountId, double amount) {
        this.transactionId = transactionId;
        this. accountId = accountId;
        this.amount = amount;
        this.timeStamp = LocalDateTime.now();
    }

    // get
    public String getTransactionId() {
        return transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    // set
    public void setTransactionId(String newTransactionId) {
        this.transactionId = newTransactionId;
    }

    public void setAccountId(String newAccountId) {
        this.accountId = newAccountId;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    public void setTimeStamp(LocalDateTime newTimeStamp) {
        this.timeStamp = newTimeStamp;
    }

    // print all details
    @Override
    public String toString() {
        return "Transaction { " + "\n" +
        "   TransactionID = '" + transactionId + "',\n" +
        "   AccountID = '" + accountId + "',\n" +
        "   Amount = " + amount + ",\n" +
        "   Transaction Time = " + timeStamp + "\n" +
        "}";
    }

}
