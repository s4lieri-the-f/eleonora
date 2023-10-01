public class Duration {


    private TimeUnit timeUnit;
    private int amount;

    public Duration(TimeUnit timeUnit, int amount) {
        this.timeUnit = timeUnit;
        this.amount = amount;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

enum TimeUnit {
    DAYS, WEEKS, MONTHS
}