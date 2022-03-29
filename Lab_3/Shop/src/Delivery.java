import java.util.Map;

public class Delivery
{
    public int delivery_id;
    public Available_Goods product;
    public Seller Vendor;
    public String Phone;
    public Map<String, String> city;

    public Delivery ()
    { }

    public Delivery (int delivery_id, Available_Goods product, Seller Vendor,String Phone, Map<String, String> city)
    {
        this.delivery_id = delivery_id;
        this.product = product;
        this.Vendor = Vendor;
        this.Phone = Phone;
        this.city = city;
    }

}
