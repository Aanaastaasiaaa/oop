public class Integer implements Number{
    private int value;

    public Integer(int value) {
        this.value = value ;
    }

    public int getValue() {
        return value;
    }

    public Integer sum(Integer other) {
        return new Integer(this.value + other.value);
    }

    public Integer otr(Integer other) {
        return new Integer(this.value - other.value);
    }

    public Integer umn(Integer other) {
        return new Integer(this.value * other.value);
    }

    public Integer del(Integer other) {
        if (other.value == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return new Integer(this.value / other.value);
    }
}
