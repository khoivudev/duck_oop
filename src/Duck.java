public abstract class Duck {
    // Polymorphism
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){        
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // Encapsulation
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, event decoys");
    }
}