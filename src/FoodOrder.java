import java.util.Date;
import java.util.List;

public class FoodOrder {
    private List<Product> products;
    private Status status;
    private Date deliveryDate;


    public Status placeOrder() {

        return Status.SUCCESS;
    }

    public Status cancelOrder() {

        return Status.SUCCESS;
    }

    public Status updateDeliveryDate(Date date) {
        this.deliveryDate = date;
        return Status.SUCCESS;
    }
}