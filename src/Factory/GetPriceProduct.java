package Factory;

public class GetPriceProduct {
    // use getPlan method to get object of type Plan
    public Price getPlan(String getItem){
        if(getItem == null){
            return null;
        }
        if(getItem.equalsIgnoreCase("JAM")) {
            return new Jam();
        }
        else if(getItem.equalsIgnoreCase("CHEESE")){
            return new Cheese();
        }
        return null;
    }
}
