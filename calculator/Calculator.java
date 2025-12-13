package calculator;
public abstract class Calculator {
    protected double value1;
    protected double value2;

    public Calculator() {
        this.value1 = 0;
        this.value2 = 0;
    }

    public Calculator(double value1) {
        this.value1 = value1;
        this.value2 = 0;
    }

    public Calculator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return this.value1;
    }

    public double getValue2() {
        return this.value2;
    }

    public abstract double add();
    public abstract double subtract();
    public abstract double multiply();
    public abstract double divide();
    public abstract double modulo();

    public abstract double pwr();
    public abstract double sqrt();
}
