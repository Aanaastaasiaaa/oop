//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void (String[] args) {

                Fourangle quad = new Fourangle(3, 4, 5, 6, Math.PI / 3);
                quad.display();
                System.out.println("Периметр: " + quad.p());
                System.out.println("Площадь: " + quad.s());
                System.out.println();

                Rectangle rect = new Rectangle(5, 3);
                rect.display();
                System.out.println("Периметр: " + rect.p());
                System.out.println("Площадь: " + rect.s());
                System.out.println();

                // Создание и демонстрация квадрата
                Square square = new Square(4);
                square.display();
                System.out.println("Периметр: " + square.p());
                System.out.println("Площадь: " + square.s());
                System.out.println();

    }
}