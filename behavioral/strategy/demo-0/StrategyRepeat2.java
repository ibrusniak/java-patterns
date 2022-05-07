
public class StrategyRepeat2 {

    public static void main(String[] args) {

        Context context;

        context = new Context(new Pow());
        System.out.println(context.executeStrategy(2));

        context = new Context(new PlusOne());
        System.out.println(context.executeStrategy(2));

        context = new Context(new MultiplyTwo());
        System.out.println(context.executeStrategy(2));

        // Strategy - is functional interface. Thus can use lambdas
        context = new Context(x -> x + x + x);
        System.out.println(context.executeStrategy(2));
    }
}


interface Strategy {
    public int execute(int arg);
}

class Context {

    private Strategy currentStrategy;

    public Context(Strategy strategy) {
        currentStrategy = strategy;
    }

    public void setCurrentStrategy(Strategy strategy) {
        currentStrategy = strategy;
    }

    public int executeStrategy(int arg) {
        return currentStrategy.execute(arg);
    }
}

class PlusOne implements Strategy {

    public int execute(int arg) {
        return arg++;
    }
}

class Pow implements Strategy {

    public int execute(int arg) {
        return arg * arg;
    }
}

class MultiplyTwo implements Strategy {

    public int execute(int arg) {
        return arg * 2;
    }
}


