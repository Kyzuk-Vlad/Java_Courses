public final class Appraiser extends Employee
{
    String Recommendation;

    public Appraiser()
    { }

    public Appraiser(String name, int age, String Phone, String sex, String city, String Recommendation, double Rating, double salary)
    {
        super(name, age, Phone, sex, city, Rating, salary);
        this.Recommendation = Recommendation;
    }

}
