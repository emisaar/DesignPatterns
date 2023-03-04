package Builder;

public class BurgerBuilder {
                  public BurgerType buildMcDonaldsBurger(){
                     BurgerType burgers=new BurgerType();
                     burgers.addItem(new McDonalds());
                     return burgers;
              }
              public BurgerType buildCarlsJRBurger(){
             BurgerType burgers=new BurgerType();
             burgers.addItem(new CarlsJR());
             return burgers;
              }
}