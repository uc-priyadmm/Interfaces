package LAB03.COMPUTERPROGRAMING;

import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        Rectangle rectangle = (Rectangle) x;
        return rectangle.getWidth() * 2 + rectangle.getHeight() * 2 > 10;
    }
}
