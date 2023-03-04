package Builder;

public class Main {
    public static void main(String args[]){
   BurgerBuilder cdBuilder=new BurgerBuilder();
   BurgerType BurgerType1=cdBuilder.buildMcDonaldsBurger();
   BurgerType1.showItems();

   BurgerType BurgerType2=cdBuilder.buildCarlsJRBurger();
   BurgerType2.showItems();
 }
}
