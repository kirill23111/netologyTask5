public abstract class Account {
    protected long balance;

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            return account.add(amount);
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }
}
