
/**
 *  Step 4. Use the Context to see change on behaviour when it changes its Strategy.
 */
public class StrategyDemo0 {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 7;

        System.out.printf("\nnum1: %d, num2: %d\n\n", num1, num2);

        Context context = new Context(new OperationAdd());
        System.out.println(context + ": " + context.executeStrategy(num1, num2));
        
        context = new Context(new OperationSubstrat());
        System.out.println(context + ": " + context.executeStrategy(num1, num2));
        
        context = new Context(new OperationMultiply());
        System.out.println(context + ": " + context.executeStrategy(num1, num2));
    }
}

/**
 *  Step 1. Create an interface
 */
interface Strategy {

    public int doOperation(int num1, int num2);
}

/**
 *  Step 2. Create concrete classes implementing the same interface
 */
class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class OperationSubstrat implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

/**
 *  Step 3. Create Context Class
 */
class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    @Override
    public String toString() {
        return strategy.getClass().getSimpleName();
    }
}

