public class Line2D extends Shape2D {
    private int aX;
    private int aY;
    private int bX;
    private int bY;

    public Line2D(int aX, int aY, int bX, int bY) {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
    }

    public Line2D() {
    }

    public int getaX() {
        return aX;
    }

    public void setaX(int aX) {
        this.aX = aX;
    }

    public int getaY() {
        return aY;
    }

    public void setaY(int aY) {
        this.aY = aY;
    }

    public int getbX() {
        return bX;
    }

    public void setbX(int bX) {
        this.bX = bX;
    }

    public int getbY() {
        return bY;
    }

    public void setbY(int bY) {
        this.bY = bY;
    }
};