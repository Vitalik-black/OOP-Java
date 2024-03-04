import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


/* Добавить в файл интерфейса метод void step() это будет основной метод взаимодействыия с объектами. Добавить интерфейс в базовый абстрактный класс.
Реализовать этот метод во всех классах наследниках. Для начала просто заглушкой.Доработать классы лучников.
Лучник должен во первых проверить жив ли он и есть ли у него стрелы, если нет то завершить метод.
Есль всё да, то найти ближайшего противника и выстрелить по немы и, соответственно потратить одну стрелу.
Реализовать весь функционал лучников в методе step().
Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле. Крестьянин = 0, маги=1, пехота=2, лучники=3.
В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих комманд а с наименьшей в конце.

 */
public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();

        List<Unit> teamVerh = new ArrayList<>();
        List<Unit> teamNiz = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(7);
            int X1 = rand.nextInt(10);
            int X2 = rand.nextInt(10);
            Position xy1 = new Position(X1, 0);
            Position xy2 = new Position(X2, 9);
            switch (val) {
                case 0:
                    teamVerh.add(new Crossbowman(getName(), i, 0));
                    teamNiz.add(new Crossbowman(getName(), i, 9));
                    break;
                case 1:
                    teamVerh.add(new Bandit(getName(), i, 0));
                    teamNiz.add(new Bandit(getName(), i, 9));
                    break;
                case 2:
                    teamVerh.add(new Snaiper(getName(), i, 0));
                    teamNiz.add(new Snaiper(getName(), i, 9));
                    break;
                case 3:
                    teamVerh.add(new Magic(getName(), i, 0));
                    teamNiz.add(new Magic(getName(), i, 9));
                    break;
                case 4:
                    teamVerh.add(new Monk(getName(), i, 0));
                    teamNiz.add(new Monk(getName(), i, 9));
                    break;
                case 5:
                    teamVerh.add(new Peasant(getName(), i, 0));
                    teamNiz.add(new Peasant(getName(), i, 9));
                    break;
                case 6:
                    teamVerh.add(new Spearman(getName(), i, 0));
                    teamNiz.add(new Spearman(getName(), i, 9));
                    break;
                default:

                    break;
            }
        }
        System.out.println("Команда сверху:");
        for (Unit a : teamLeft) {
            System.out.printf("Name: %s, Position: x: %d,y: %d\n", a.name, a.position.getX(), a.position.getY());
        }
//                    (teamLeft.get(i).getInfoPos());
        System.out.println("Команда снизу:");
        for (Unit a : teamRight) {
            System.out.printf("Name: %s, Position: x: %d,y: %d\n", a.name, a.position.getX(), a.position.getY());
        }
//                    (teamRight.get(i).getInfoPos());

    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}