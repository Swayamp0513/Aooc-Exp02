// Problem 3:
// Demonstrate static variables, static block, and static method.

class StaticDemo {
    static int count;

    // Static block
    static {
        count = 0;
        System.out.println("Static block executed");
    }

    StaticDemo() {
        count++;
    }

    static void showCount() {
        System.out.println("Total objects = " + count);
    }
}

public class TestStatic {
    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        StaticDemo.showCount();
    }
}