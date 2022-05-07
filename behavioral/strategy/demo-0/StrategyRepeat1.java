
public class StrategyRepeat1 {

    public static void main(String[] args) {

        Context c;

        c = new Context(() -> System.out.println("Strategy 1"));
        c.executeStrategy();

        c = new Context(new Strategy() {
            public void executeAlgorithm() {
                System.out.println("Strategy 2");
            }
        });
        c.executeStrategy();
    }
}

interface Strategy {
    public void executeAlgorithm();
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.executeAlgorithm();
    }
}


