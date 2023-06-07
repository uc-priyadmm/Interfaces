package LAB03.COMPUTERPROGRAMING;

import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(6, 1));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(7, 1));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(4, 3));
        rectangles.add(new Rectangle(1, 6));
        rectangles.add(new Rectangle(9, 1));

        Filter filter = new BigRectangleFilter();
        ArrayList<Rectangle> bigRectangles = collectAll(rectangles, filter);

        System.out.println("Big Rectangles:");
        for (Rectangle rectangle : bigRectangles) {
            System.out.println(rectangle);
        }
    }

    private static ArrayList<Rectangle> collectAll(ArrayList<Rectangle> objects, Filter filter) {
        ArrayList<Rectangle> filteredList = new ArrayList<>();
        for (Rectangle object : objects) {
            if (filter.accept(object)) {
                filteredList.add(object);
            }
        }
        return filteredList;
    }
}
