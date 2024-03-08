package units;
public class Position {
    int x;
    int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setPosition(int value1, int value2) {
        this.x = value1;
        this.y = value2;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString(){
        return x + "," + y;
    }
    // Метод нахождения расстояния между двумя персонажами
    public double distance(Position target){
        double d = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
        return d;
    }
    public Position getDifference(Position target) {
        Position dif = new Position(x - target.x, y - target.y);
        return dif;
    }
 public boolean equals (Position target){
        return x == target.x && y == target.y;
 }
}