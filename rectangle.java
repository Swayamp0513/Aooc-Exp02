// Problem 2:
// Print the area of rectangle using class Area.
// Methods: setDim() and getArea().

import java.util.Scanner;

class Area {
    int length, breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area a = new Area();

        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        a.setDim(l, b);
        System.out.println("Area = " + a.getArea());
    }
}/