package Builder;

public class McDonalds extends Company{
    @Override
    public int price(){
        return 70;
    }
    @Override
    public String pack(){
        return "McDonalds Burger";
    }
}