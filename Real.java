public class Real implements Number{
    private double value;

    public Real(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public Number add(Number other) {
        if (other instanceof Integer) {
            return new Real(this.value + ((Integer) other).value);
        } else if (other instanceof Real) {
            return new Real(this.value + ((Real) other).value);
        }
        throw new IllegalArgumentException("Unsupported type");
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof Integer) {
            return new Real(this.value - ((Integer) other).value);
        } else if (other instanceof Real) {
            return new Real(this.value - ((Real) other).value);
        }
        throw new IllegalArgumentException("Unsupported type");
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof Integer) {
            return new Real(this.value * ((Integer) other).value);
        } else if (other instanceof Real) {
            return new Real(this.value * ((Real) other).value);
        }
        throw new IllegalArgumentException("Unsupported type");
    }

    @Override
    public Number divide(Number other) {
        if (other instanceof Integer) {
            if (((Integer) other).value == 0) throw new ArithmeticException("Division by zero");
            return new Real(this.value / ((Integer) other).value);
        } else if (other instanceof Real) {
            if (((Real) other).value == 0) throw new ArithmeticException("Division by zero");
            return new Real(this.value / ((Real) other).value);
        }
        throw new IllegalArgumentException("Unsupported type");
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
