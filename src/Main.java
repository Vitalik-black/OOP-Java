/* УУрок 6. ООП Дизайн и Solid
Реализовать степ крестьянам и магам. Один крестьянин может дать только одну стрелу, одному лучнику за ход. Маг имеет 10 маны и может вылечить одного дружественного бойца за ход.
Лечение стоит 2 маны, если маны не достаточно пропускаем ход.
При пропуске хода мана растёт на единичку. Если в команде погибло больше трёх человек маг может возродить одного из них, но возрождение стоит 10 маны.
 */
import units.*;
import java.util.*;
public class Main {
    public static ArrayList<Unit> holyTeam = new ArrayList<>();
    public static ArrayList<Unit> darkTeam = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();
    public static void main(String[] args) {
        Random random = new Random();
        init();
        // Вывод полного списка команд, чтобы посмотреть, как сработал рандом.
        System.out.println("Команда слева:");
        for (Unit a : holyTeam){
            a.printShort();
        }
        System.out.println(" ".repeat(30));
        System.out.println("*".repeat(30));
        System.out.println(" ".repeat(30));
        System.out.println("Команда справа:");
        for (Unit a : darkTeam){
            a.printShort();
        }
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        allTeam.sort((o1, o2) -> o2.getPriority() - o1.getPriority());

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true) {

            View.view();
            scanner.nextLine();
            int summ1HP = 0;
            int summ2HP = 0;
            for (Unit unit : holyTeam){
                summ1HP += unit.getHp();
            }
            for (Unit unit : darkTeam){
                summ2HP += unit.getHp();
            }
            if (summ1HP == 0){
                System.out.println("Победила Команда  справа");
                flag = false;
                break;
            }
            if (summ2HP == 0){
                System.out.println("Победила Команда слева");
                flag = false;
                break;
            }
            for (Unit unit : allTeam) {
                if (holyTeam.contains(unit)) unit.step(darkTeam, holyTeam);
                else unit.step(holyTeam, darkTeam);
            }
        }
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
    public static void init(){
        Random random = new Random();
        int teamcount = 10;
        for (int i = 1; i < teamcount+1; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
            //System.out.println(xy1); // проверка вывода корректности координат
            switch (val) {
                case 0:
                    holyTeam.add(new Crossbowman(getName(), i,1));
                    break;
                case 1:
                    holyTeam.add(new Wizard(getName(), i,1));
                    break;
                case 2:
                    holyTeam.add(new Monk(getName(),i,1));
                    break;
                case 3:
                    holyTeam.add(new Bandit(getName(), i,1));
                    break;
                case 4:
                    holyTeam.add(new Peasant(getName(), i,1));
                    break;
                case 5:
                    holyTeam.add(new Sniper(getName(), i,1));
                    break;
                case 6:
                    holyTeam.add(new Spearman(getName(), i,1));
                    break;
            }
        }
        for (int i = 1; i < teamcount+1; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position xy1 = new Position(coordX1, 1);
            Position xy2 = new Position(coordX2, 10);
          //  System.out.println(xy2); // проверка вывода корректности координат правая команда
            switch (val) {
                case 0:
                    darkTeam.add(new Crossbowman(getName(), i,10));
                    break;
                case 1:
                    darkTeam.add(new Wizard(getName(), i,10));
                    break;
                case 2:
                    darkTeam.add(new Monk(getName(), i,10));
                    break;
                case 3:
                    darkTeam.add(new Bandit(getName(), i,10));
                    break;
                case 4:
                    darkTeam.add(new Peasant(getName(), i,10));
                    break;
                case 5:
                    darkTeam.add(new Sniper(getName(), i,10));
                    break;
                case 6:
                    darkTeam.add(new Spearman(getName(), i,10));
                    break;
            }
        }
    }
}