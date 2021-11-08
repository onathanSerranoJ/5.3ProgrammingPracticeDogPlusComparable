import java.text.DecimalFormat;
public class Dog implements Comparable
{
    //instance variables
    private static int dogCount;
    private String name;
    private int age;
    private String breed;
    private double weight;
    //decimal format
    DecimalFormat dec = new DecimalFormat("0.##");
    //constructor
    public Dog (String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }
    public Dog ()
    {
        name = "Dog";
        age = 0;
        breed = "Dog";
        weight = 0.00;
        dogCount++;
    }
    //getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }
    public static int getDogCount()
    {
        return dogCount;
    }
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    //brain methods
    public String getKilograms(double weight)
    {
        return dec.format(weight*2.205);
    }
    public int compareTo(Object Dog)
    {
        int output = 0;
        if(this.age < ((Dog)Dog).getAge())
        {
            output = -1;
        }
        else if(this.age > ((Dog)Dog).getAge())
        {
            output = 1;
        }
        return output;
    }
    //toString
    public String toString()
    {
        return "Name: " + name + "\nAge in years: " + age + "\nBreed: " + breed + "\nWeight in lbs: " + weight;
    }
}
