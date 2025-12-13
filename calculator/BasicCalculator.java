package calculator;

public class BasicCalculator extends Calculator {
    public BasicCalculator() {
        super();
    }

    public BasicCalculator(double value1) {
        super(value1);
    }

    public BasicCalculator(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double add() {
        return (this.value1 + this.value2);
    }

    @Override
    public double subtract() {
        return (this.value1 - this.value2);
    }

    @Override
    public double multiply() {
        return (this.value1 * this.value2);
    }

    @Override
    public double divide() {
        return (this.value1 / this.value2);
    }

    @Override
    public double modulo() {
        return (this.value1 % this.value2);
    }

    @Override
    public double pwr() {
        return 0;
    }

    @Override
    public double sqrt() {
        return 0;
    }
}
