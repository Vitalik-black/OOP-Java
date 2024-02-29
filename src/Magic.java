public enum Magic {
    freiBall (10,15), heal (2,-2), magDef (5,2);

    private int mana;

    private int atc;

    Magic (int i, int i1) {
        mana = i;
        atc = i1;
    }

    public int getMana() {return mana;}

    public int getAtc() {return atc;}
}
