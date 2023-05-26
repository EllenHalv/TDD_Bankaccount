package bank;

public class Account {

    private String accountNr;
    private double initialCash;

    public Account(String accountNr, double initialCash) {
        this.accountNr = accountNr;
        this.initialCash = initialCash;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public double getInitialCash() {
        return initialCash;
    }

    public void setInitialCash(double initialCash) {
        this.initialCash = initialCash;
    }

    public double getBalance() {
        return initialCash;
    }

    public void deposit(Double amount) {
        if (amount == null) {
            throw new NullPointerException("Amount cannot be null.");
        }
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount == 0.0) {
            throw new IllegalArgumentException("Amount cannot be 0.");
        } else {
            initialCash += amount;
        }
    }

    public void withdraw(Double amount) {
        if (amount == null) {
            throw new NullPointerException("Amount cannot be null.");
        }
        if (amount < 0.0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        if (amount == 0.0) {
            throw new IllegalArgumentException("Amount cannot be 0.");
        }
        if (amount > initialCash) {
            throw new IllegalArgumentException("Cannot withdraw an amount larger than the balance.");
        } else {
            initialCash -= amount;
        }
    }
}
