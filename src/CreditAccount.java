public class CreditAccount extends Account{
    @Override
    public boolean add(long amount) {
        if (amount <= 0 || balance + amount > 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0 || balance + amount > 0) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
