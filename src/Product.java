
public class Product {
    private String name;
    private float quantity;
    private String unit;

    public Product(String name, float quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }


    public Status updateQuantity(float quantity) {
        this.quantity = quantity;
        return Status.SUCCESS;
    }

}


