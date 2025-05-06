package Practice;

interface Calculator {
    void calculate(int value);
}

class Square implements Calculator {
    int result;

    public void calculate(int value) {
        result = value + value;
        System.out.print("Square: " + result + " ");
    }
}

class Cube extends Square {
    public void calculate(int value) {
        result = value + value + value;
        super.calculate(value);
        System.out.print("Cube: " + result + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Cube();
        obj.calculate(3);
    }
}