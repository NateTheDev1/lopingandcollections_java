package loopingandcollections;

public class Dog 
{
    private String breed;
    private int avgWeight;
    private boolean apartment;

    public Dog(String breed, int avgWeight, boolean apartment)
    {
        this.breed = breed;
        this.avgWeight = avgWeight;
        this.apartment = apartment;
    }

    public String getBreed()
    {
        return this.breed;
    }

    public int getAvgWeight()
    {
        return this.avgWeight;
    }

    public boolean isApartment()
    {
        return this.apartment;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void setAvgWeight(int avgWeight)
    {
        this.avgWeight = avgWeight;
    }

    public void setApartment(boolean apartment)
    {
        this.apartment = apartment;
    }

    @Override
    public String toString()
    {
        return "Dog: " + "Breed = " + breed + " AvgWeight: " + avgWeight + " Apartment " + apartment + "\n";
    }
}