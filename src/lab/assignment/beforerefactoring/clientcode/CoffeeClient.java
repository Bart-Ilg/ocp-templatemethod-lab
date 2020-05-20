package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.Mocha;
import lab.assignment.beforerefactoring.Capuccino;
import lab.assignment.beforerefactoring.Americano;
import lab.assignment.beforerefactoring.CoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new Mocha();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Capuccino();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Americano();
        starbuzz.prepareCoffee();


    }
}
