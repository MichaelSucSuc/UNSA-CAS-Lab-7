public class Rectangle {

    private int height;
    private int width;

    public Rectangle() {
        height = 0;
        width = 0;
    }

    public Rectangle(int h, int w) {
        height = h;
        width = w;
    }

    public int getH() {
        return height;
    }

    public int getW() {
        return width;
    }

    public int getA() {
        return height * width;
    }

    public void setH(int h) {
        height = h;
    }

    public void setW(int w) {
        width = w;
    }

    @Override
    public String toString() {
        return "Rectangle: height = " + height
                + " width = " + width
                + " area = " + getA() + ".";
    }
}

// End of Rectangle class
