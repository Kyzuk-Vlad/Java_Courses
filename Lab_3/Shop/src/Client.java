import Interfaces.IClient;
import org.jetbrains.annotations.NotNull;

public final class Client extends Person implements IClient
{
    public String email;
    public double balance;
    public double bonuses;

    public Client()
    { }

    public Client(String name, int age, String Phone, String sex, String city, int balance, int bonuses,  String email)
    {
        super(name, age, Phone, sex, city);
        this.balance = balance;
        this.bonuses = bonuses;
        this.email = email;
    }

    public void setEmail(String quality) {this.email = email;}
    public String getEmail()
    {
        return this.email;
    }

    public void setBalance(double balance) {if (balance > (-1))
    {
        this.balance = balance;
    }
     else
      {
        throw new IllegalArgumentException("Donate Something");
      }
    }
    public double getBalance() { return this.balance; }

    public void setBonuses(double bonuses) {this.bonuses = bonuses;}
    public double getBonuses()
    {
        return this.bonuses;
    }


    public String toString()
    {
        return name + "\n" +
                " age: "+ age +"\n" +
                " Phone: " + Phone + "\n" +
                " sex: " + sex + "\n" +
                " balance: " + balance + "\n" +
                " bonuses: " + bonuses + "\n" +
                " city: " + city + "\n" +
                " email: " + email;
    }


    void RateSeller(@NotNull Seller seller, double speed, double quality, double prices)
    {
        seller.rating = Rating.RateSomebody(speed, quality, prices);
    }

    void RateDelivery(@NotNull Delivery_Service delivery, double speed, double quality, double prices) {
        delivery.rating = Rating.RateSomebody(speed, quality, prices);
    }


    public String BuyGoods(@NotNull Client client, @NotNull Seller seller, @NotNull Available_Goods goods) {
        if (goods.getArticular() != 0)
        {
            if (seller.CountOfProduct != 0)
            {
                if (client.balance > seller.newPrice)
                    return "Goods added to your Shopping cart";
            }
            return "Not enough money on your balance";
        }
        return "Product isn't exist";
    }

    @Override
    public String BuyGoods() {
        return null;
    }
}
