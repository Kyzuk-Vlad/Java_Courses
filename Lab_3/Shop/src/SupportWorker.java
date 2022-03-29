public final class SupportWorker extends Employee
{
    String Recommendation;

    public SupportWorker()
    { }

    public SupportWorker(String name, int age, String Phone, String sex, String city, String Recommendation, double Rating, double salary)
    {
        super(name, age, Phone, sex, city, Rating, salary);
        this.Recommendation = Recommendation;
    }
}
