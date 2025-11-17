public class Real implements Number{
    private double value;

    public Real(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public Real sum(Real other) {
        return new Real(this.value + other.value);
    }

    public Real otr(Real other) {
        return new Real(this.value - other.value);
    }

    public Real umn(Real other) {
        return new Real(this.value * other.value);
    }

    public Real del(Real other) {
        if (other.value == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return new Real(this.value / other.value);
    }

}
