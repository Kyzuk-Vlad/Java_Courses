abstract public class Person
{
    public String name;
    public int age;
    public String sex;
    public String Phone;
    public String city;

    public Person ()
    { }

    public Person (String name, int age, String Phone, String sex, String city)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.Phone = Phone;
        this.city = city;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName() { return this.name; }

    public void setAge(int age) {this.age = age;}
    public int getAge()
    {
        return this.age;
    }

    public void setSex(String name)
    {
        this.sex = sex;
    }
    public String getSex() { return this.sex; }

    public void setPhone(String phone)
    {
        this.Phone = phone;
    }
    public String getPhone()
    {
        return this.Phone;
    }

    public String toString()
    {
        return name + "\n" +
                " age: "+ age +"\n" +
                " sex: " + sex + "\n" +
                " Phone: " + Phone + "\n" +
                " city: " + city;
    }

}
