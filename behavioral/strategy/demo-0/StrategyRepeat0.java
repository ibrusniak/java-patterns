
/**
 *  In Strategy pattern class behavior or its algorithm can
 *  be changed at run time.
 *  In Strategy pattern we create objects which represent various
 *  strategies and a context object whose behaviour varies as per
 *  its strategy object. The strategy object changes the execution
 *  algorithm of the context object.
 */

public class StrategyRepeat0 {

    public static void main(String[] args) {

        Context context = new Context(new SecondPrinter());
        context.printSomething();

        context = new Context(new ForthPrinter());
        context.printSomething();

        context = new Context(new FirstPrinter());
        context.printSomething();
    }
}

interface Strategy {
    public void printSomething();
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printSomething() {
        strategy.printSomething();
    }
}

class FirstPrinter implements Strategy {

    public void printSomething() {
        System.out.println("First printer strategy");
    }
}

class SecondPrinter implements Strategy {

    public void printSomething() {
        System.out.println("Second printer strategy");
    }
}

class ThirdPrinter implements Strategy {

    public void printSomething() {
        System.out.println("Third printer strategy");
    }
}

class ForthPrinter implements Strategy {

    public void printSomething() {
        System.out.println("Forth printer strategy");
    }
}

