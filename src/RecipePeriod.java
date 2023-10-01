
public class RecipePeriod {
    private TimeUnit timeUnit;
    private int frequency;

    public RecipePeriod(TimeUnit timeUnit, int frequency) {
        this.timeUnit = timeUnit;
        this.frequency = frequency;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
