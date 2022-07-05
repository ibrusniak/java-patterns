
public class EncnapsulationDemo {

    public static void main(String[] args) {
        Exponentiation ex2 = new Exponentiation(3, 0);
        System.out.println(ex2.getResult());
        ex2 = new Exponentiation(10, 0);
        System.out.println(ex2.getResult());
        ex2 = new Exponentiation(4, 2);
        System.out.println(ex2.getResult());
    }
}

class Exponentiation {

    private int base, exponent, result;

    public Exponentiation(int base, int exponent) {
        this.base = base;
        this.exponent = exponent;
        if (exponent == 0) {
            result = 1;
        } else if (exponent == 1) {
            result = base;
        } else if (exponent < 0) {
            result = 0;
        } else {
            int counter = exponent;
            result = 1;
            do {
                result *= base;
            } while (--counter >= 1);
        }
    }

    public int getResult() {
        return result;
    }
}

