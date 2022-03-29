import Enums.TypeProduct;

public class Available_Goods extends Product
{
    int Updated_Price;

    public Available_Goods()
    { }

    public Available_Goods(String name, long articular, String description, TypeProduct type,int updated_price)
    {
        super(name, articular, description, type, updated_price);
    }

    public int getUpdated_Price() {return Updated_Price;}
    public void setUpdated_Price(int updated_Price) {Updated_Price = updated_Price;}

}
