import gifts.*;
import sweets.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Sweet s1=new Candy("X",120,80,"Jelly");
        Sweet s2=new Candy("Y",110,70,"lollipop");
        

        Sweet c1=new Chocolate("A",100,50," Milk");
        Sweet c2=new Chocolate("B",150,60,"Dark");


        Gift gifts=new Gift();
        gifts.add(s1);
        gifts.add(s2);

        gifts.add(c1);
        gifts.add(c2);

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());

    }
}