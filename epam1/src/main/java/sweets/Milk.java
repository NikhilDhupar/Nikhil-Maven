package sweets;

public class Milk extends Sweet
{
    String type;

    public Milk(String name,int price,int weight,String type)
    {
        super(name,price,weight);
        this.type=type;
    }
}