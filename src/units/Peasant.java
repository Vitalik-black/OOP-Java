package units;

import java.util.ArrayList;

// Крестьянин. Своё свойство - количество стрел
public class Peasant extends Unit {
    int countArrow;
    protected boolean flag;
    public Peasant(String name, int x, int y) {
        super(name, 150, "arrow", 0, 4, 10, 0, 40, new Position(x,y));
        countArrow = 10;
        flag = false;
    }
    protected void printname() {
        System.out.println("Name: " + name);
    }



    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> friend) {
        if (health <= 0) return;
        flag = false;
    }

    public int getCountArrow() {
        return countArrow;
    }
    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countArrow;
    }
    public String getInfo(){
        return "Фермер";
    };
}