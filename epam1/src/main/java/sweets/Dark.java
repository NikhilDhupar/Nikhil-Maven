package sweets;

public class Dark extends Sweet
{
    String type;

    public Dark(String name,int price,int weight,String type)
    {
        super(name,price,weight);
        this.type=type;
    }
}
