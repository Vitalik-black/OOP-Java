import java.util.List;

public enum Magic {
    freiBall(10, 15), heal(2, -2), magDef(5, 2);

    private int mana;

    private int atc;

    Magic(int i, int i1) {
        mana = i;
        atc = i1;
    }

    public int getMana(List<Unit> targets) {
        return mana;
    }

    public int getAtc() {
        return atc;
    }

    @Override
    public void step() {

    }
}
