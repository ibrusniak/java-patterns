/**
 * StrategyBehavioralPattern. Demonstrates behavioral patters "strategy".
 * Strategy is a behavioral design pattern that lets you define a family
 * of algorithms, put each of them into a separate class, and make their objects
 * interchangeable.
 */
public class StrategyBehavioralPattern {

    public static void main(String[] args) {
        
        Context context = new Context();
        context.setStrategy(new Algorithm1());
        context.executeStrategy();
        context.setStrategy(new Algorithm2());
        context.executeStrategy();
    }
}

interface Strategy {
    public void execute();
}

class Context {
    
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void executeStrategy() {
        strategy.execute();
    }
}

class Algorithm1 implements Strategy {

    public void execute() {
        System.out.println("Executed algorithm 1");
    }
}

class Algorithm2 implements Strategy {
    
    public void execute() {
        System.out.println("Executed algorithm 2");
    }
}


