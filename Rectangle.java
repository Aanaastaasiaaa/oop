public class Rectangle extends Fourangle{
    Rectangle(double a, double b)
    {
        super(a, b, a, b, 90);
    }

    @Override
    public void display() {
        System.out.println("прямоугольник со сторонами "+a+" "+b);
    }

    @Override
    public double p() {
        return 2*(a+b);
    }

    @Override
    public double s() {
        return a*b;
    }
}
