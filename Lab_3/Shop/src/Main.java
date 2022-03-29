import Enums.TypeProduct;

public class Main
{
    public static void main(String[] args)
    {
        Product ad = new Available_Goods();
        ad.setName("Lollipop");
        ad.setArticular(123);
        ad.setDescription("This lollipop is delicious");
        ad.setPrice(300);
        ad.setTypeProduct(TypeProduct.GOODS);
        System.out.println(ad.toString());

        Client Bob = new Client("Bob",23,"23123123","male","Gmerenka",12321,123,"@dasdasdvad");

       //Bob.BuyGoods()
    }
}