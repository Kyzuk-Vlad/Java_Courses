import Enums.Del_Type;

public class Delivery_Service
{
    private String name;
    protected double rating;
    private Del_Type type;

    public Delivery_Service(){ }
    public Delivery_Service(String name,double rating, Del_Type type)
    {
        this.name = name;
        this.rating = rating;
        this.type = type;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() { return this.name; }

    public void setRating(double rating) {this.rating = rating;}
    public double getRating() {return this.rating;}

    public void setDescription(Del_Type type) {this.type = type;}
    public Del_Type getDescription()
    {
        return this.type;
    }
}
