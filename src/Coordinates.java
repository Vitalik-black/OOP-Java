public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(Coordinates other) {
        int xDiff = this.x - other.x;
        int yDiff = this.y - other.y;
        double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return distance;
    }
}
