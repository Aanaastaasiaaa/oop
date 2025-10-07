public class Fourangle {
    double a, b, c, d, angle;
    Fourangle(double a, double b, double c, double d, double angle)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.angle=angle;
    }
    public void display()
    {
        System.out.println("четырехугольник со сторонами "+a+" "+b+" "+c+" "+d+" и углом "+angle);
    }
    public double p()
    {
        return a+b+c+d;
    }
    public double s()
    {
        double p=(a+b+c+d)/2;
        return Math.sqrt((p-a)+(p-b)*(p-c)*(p-d));
    }

}
