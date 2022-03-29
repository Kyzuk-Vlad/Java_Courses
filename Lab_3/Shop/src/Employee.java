abstract public class Employee extends Person
{
    double rating;
    double salary;
    public Employee ()
    { }

    public Employee (String name, int age, String Phone, String sex, String city,
                     double rating,double salary)
    {
        super(name, age, Phone, sex, city);
        this.rating = rating;
        this.salary = salary;
    }

}