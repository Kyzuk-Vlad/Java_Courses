import Exceptions.CountOfProductException;

import java.util.ArrayList;
import java.util.Map;


public class Seller extends Employee
{
  ArrayList<Available_Goods> goods;
  int newPrice;
  double CountOfProduct;

  public Seller ()
  { }

  public Seller (String name, int age, String Phone, String sex, String city,
                 double rating, ArrayList<Available_Goods> goods,double CountOfProduct, double salary)
  {
   super(name, age, Phone, sex, city, rating, salary);
   this.goods = goods;
    try
    {
      if (CountOfProduct>300)
        throw new CountOfProductException();
    }
    catch (CountOfProductException e)
    {
      System.out.println("Exception: "+e.toString());
      return;
    }
    this.CountOfProduct = CountOfProduct;
  }

    public double getRating() { return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public ArrayList<Available_Goods> getGoods() {return goods;}
    public void setGoods(ArrayList<Available_Goods> goods) {this.goods = goods;}

    public int getNewPrice() {return newPrice;}
    public void setNewPrice(int newPrice) {this.newPrice = newPrice;}

    public double getCountOfProduct() {return CountOfProduct;}
    public void setCountOfProduct(double countOfProduct) {CountOfProduct = countOfProduct;}
}
