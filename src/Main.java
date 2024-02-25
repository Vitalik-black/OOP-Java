import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        List<Unit> team1 = new ArrayList<>(teamCreator(0));
        List<Unit> team2 = new ArrayList<>(teamCreator(9));
        }

    private static String fillName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    private static ArrayList<Unit> teamCreator(int y){
        ArrayList<Unit> team = new ArrayList<Unit>();
        int teamCount = 10;
        for (int i = 0; i < teamCount; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Monk (fillName(), i, y));
                    break;
                case 2:
                    team.add(new Wizard (fillName(), i, y));
                    break;
                case 3:
                    team.add(new Crossbowman (fillName(), i, y));
                    break;
                case 4:
                    team.add(new Sniper (fillName(), i, y));
                    break;
                case 5:
                    team.add(new Peasant (fillName(), i, y));
                    break;
                case 6:
                    team.add(new Bandit (fillName(), i, y));
                    break;
                case 7:
                    team.add(new Spearman (fillName(), i, y));
                    break;
            }
        }
        return team;
    }

}