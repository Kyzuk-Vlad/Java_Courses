import Enums.TypeProduct;

abstract public class Product
{
    private String name;
    protected long articular;
    private String description;
    public TypeProduct type;
    public int price;

    public Product(){ }

    public Product(String name, long articular, String description, TypeProduct type, int price)
    {
        this.name = name;
        this.articular = articular;
        this.description = description;
        this.type = type;
        this.price = price;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() { return this.name; }

    public void setArticular(long articular) {this.articular = articular;}
    public long getArticular()
    {
        return this.articular;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return this.price;
    }

    public void setTypeProduct(TypeProduct type)
    {
        this.type = type;
    }
    public TypeProduct getTypeProduct()
    {
        return this.type;
    }

    public String toString()
    {
        return name + "\n" +
        " articular: "+ articular +"\n" +
        " description: " + description + "\n" +
        " type: " + type + "\n" +
        " price: " + price;
    }

}