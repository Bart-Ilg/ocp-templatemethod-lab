package lab.assignment.beforerefactoring;

public abstract class CoffeeMaker
{
   public void prepareCoffee()
   {
      boilWater();
      brewEspresso();
      addIngredients();
      finalTouch();
      System.out.println(">>Serving coffee");
   }
  
   public void boilWater() {
      System.out.println("Boiling water");
   }

   public void brewEspresso() {
       System.out.println("Brewing espresso");
   }

  abstract void addIngredients();
  abstract void finalTouch();

}