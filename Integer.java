public class Integer implements Number{
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public Number add(Number other) {
        if (other instanceof Integer) {
            return new Integer(this.value + ((Integer) other).value);
        } else if (other instanceof Real) {
            return new Real(this.value + ((Real) other).getValue());
        }
    }

    @Override
    public Number subtract(Number other) {
        if (other instanceof Integer) {
            return new Integer(this.value - ((Integer) other).value);
        } else if (other instanceof Real) {
            return new Real(this.value - ((Real) other).getValue());
        }
    }

    @Override
    public Number multiply(Number other) {
        if (other instanceof Integer) {
            return new Integer(this.value * ((Integer) other).value);
        } else if (other instanceof Real) {
            return new Real(this.value * ((Real) other).getValue());
        }
    }

    @Override
    public Number divide(Number other) {
        if (other instanceof Integer) {
            if (((Integer) other).value == 0) throw new ArithmeticException("Division by zero");
            return new Integer(this.value / ((Integer) other).value);
        } else if (other instanceof Real) {
            double otherValue = ((Real) other).getValue();
            if (otherValue == 0) throw new ArithmeticException("Division by zero");
            return new Real(this.value / otherValue);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
