/*Q6) Implement Decorator pattern to decorate the Pizza with topings.*/
package java6_Assgnmnt;

interface Pizza {
    String bakePizzainfo();
}

class BasePizza implements Pizza{
    @Override
    public String bakePizzainfo() {
        return "Basic Pizza";
    }
    public float getCost(){
        return 100;
    }
}

class Mushroom implements Pizza {
    private Pizza pizza;
    private Integer cost;

    public Mushroom(Pizza pizza, Integer cost) {
        this.pizza = pizza;
        this.cost = cost;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
    @Override
    public String bakePizzainfo() {
        return pizza.bakePizzainfo() + " : A mushroom Pizza With Cost "+cost;
    }
}


class Pepperoni implements Pizza {
    private Pizza pizza;
    private Integer cost;

    public Pepperoni(Pizza pizza, Integer cost) {
        this.pizza = pizza;
        this.cost = cost;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
    @Override
    public String bakePizzainfo() {
        return pizza.bakePizzainfo() + " : A Pepperoni Pizza With Cost "+cost;
    }
}

public class Q6_DecoratorPattern {
    public static void main(String[] args) {
        BasePizza basePizza = new BasePizza();
        System.out.println(basePizza.bakePizzainfo());

        Mushroom mushroom = new Mushroom(new BasePizza() , 500);
        System.out.println(mushroom.bakePizzainfo());

        Pepperoni pepperoni = new Pepperoni(new BasePizza(),750);
        System.out.println(pepperoni.bakePizzainfo());

    }
}
