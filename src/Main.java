public class Main {

    // Stores the radius of the circle.
    public static float radius = 10F;

    // Stores the length of a side of a square.
    public static float length = 20F;

    public static void main(String[] args) {
        // Prints the area of the circle.
        System.out.println("Area of circle = " + Circle.getArea(radius));

        // Prints the area of the square.
        System.out.println("Area of square = " + Square.getArea(length));
    }
}

class Circle {

    /**
     * Calculates the area of a circle.
     *
     * @param radius Radius of the circle.
     * @return Area of the circle.
     */
    public static float getArea(float radius) {
        return 3.141F * radius * radius;
    }
}


/**
 * Contains a method to calculate the area of the square.
 */
class Square {

    /**
     * Calculates the area of a square.
     *
     * @param length Represents length of the square.
     * @return Area of the square.
     */
    public static float getArea(float length) {
        return length * length;
    }
}