import java.util.Date;
import java.util.Calendar;


public class Period {
    private Date startDate;
    private Date endDate;
    private Duration length;

    public Period(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Period(Date startDate, Duration length){
        this.startDate = startDate;
        this.endDate = calculateEndDate();
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Duration getLength() {
        return length;
    }

    public Status setStartDate(Date startDate){
        this.startDate = startDate;
        return Status.SUCCESS;
    }

    public Status setEndDate(Date endDate){
        this.endDate = endDate;
        return Status.SUCCESS;
    }

    public Status changePeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        return Status.SUCCESS;
    }

    public Status setPeriodFromNow(Duration length) {
        this.endDate = calculateEndDate();
        return Status.SUCCESS;
    }

    private Date calculateEndDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        switch (length.getTimeUnit()) {
            case DAYS:
                calendar.add(Calendar.DAY_OF_MONTH, length.getAmount());
                break;
            case WEEKS:
                calendar.add(Calendar.WEEK_OF_YEAR, length.getAmount());
                break;
            case MONTHS:
                calendar.add(Calendar.MONTH, length.getAmount());
                break;
        }
        return calendar.getTime();
    }
}