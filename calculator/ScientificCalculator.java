package calculator;
import java.lang.Math;

public class ScientificCalculator extends BasicCalculator {
    public ScientificCalculator() {
        super();
    }

    public ScientificCalculator(double value1) {
        super(value1);
    }

    public ScientificCalculator(double value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double pwr() {
        return Math.pow(this.getValue1(), this.getValue2());
    }

    @Override
    public double sqrt() {
        return Math.sqrt(getValue1());
    }

}
