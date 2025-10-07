public class Square extends Rectangle{
    Square(double a)
    {
        super(a, a);
    }

    @Override
    public void display() {
        System.out.println("квадрат с стороной "+ a);
    }

}
