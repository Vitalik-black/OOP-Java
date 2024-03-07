import java.util.*;


/* Добавить в файл интерфейса метод void step() это будет основной метод взаимодействыия с объектами. Добавить интерфейс в базовый абстрактный класс.
Реализовать этот метод во всех классах наследниках. Для начала просто заглушкой.Доработать классы лучников.
Лучник должен во первых проверить жив ли он и есть ли у него стрелы, если нет то завершить метод.
Есль всё да, то найти ближайшего противника и выстрелить по немы и, соответственно потратить одну стрелу.
Реализовать весь функционал лучников в методе step().
Добавить в абстрактный класс int поле инициатива. В классах наследников инициализировать это поле. Крестьянин = 0, маги=1, пехота=2, лучники=3.
В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих комманд а с наименьшей в конце.

 */
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random random = new Random();

        List<Unit> team1 = new ArrayList<>();
        List<Unit> team2 = new ArrayList<>();

        Names[] names = Names.values();

        for (int i = 0; i < teamCount; i++) {
            int indexVerh = random.nextInt(names.length - 1);
            int indexNiz = random.nextInt(names.length + 1);

            String verhName = names[indexVerh].toString();
            String nizName = names[indexNiz].toString();

            int val = random.nextInt(7);
            int X1 = random.nextInt(10);
            int X2 = random.nextInt(10);

            Position xy1 = new Position(X1, 0);
            Position xy2 = new Position(X2, 9);

            switch (val) {
                case 0:
                    team1.add(new Crossbowman(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Crossbowman(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
                case 1:
                    team1.add(new Bandit(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Bandit(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
                case 2:
                    team1.add(new Snaiper(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Snaiper(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
                case 3:
                    team1.add(new Magic(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Magic(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
                case 4:
                    team1.add(new Monk(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Monk(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
                case 5:
                    team1.add(new Peasant(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Peasant(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
                case 6:
                    team1.add(new Spearman(verhName, xy1.getX(), xy1.getY(), 1));
                    team2.add(new Spearman(nizName, xy2.getX(), xy2.getY(), 2));
                    break;
            }
        }
        System.out.println("-".repeat(16));
        ArrayList<Unit> all = new ArrayList<>();
        all.addAll(team1);
        all.addAll(team2);
        all.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o1.getPriority() - o2.getPriority();
            }
        });
        all.forEach(n -> System.out.println(n.to.Info()));
        System.out.println("Команда сверху:");
        for (Unit a : team1) {
            System.out.printf("Name: %s, Position: x: %d, y: %d\n", a.name, a.position.getX(), a.position.getY());
        }

        System.out.println("Команда снизу:");
        for (Unit a : team2) {
            System.out.printf("Name: %s, Position: x: %d, y: %d\n", a.name, a.position.getX(), a.position.getY());
        }
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

}
*/

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random random = new Random();

        List<Unit> team1 = new ArrayList<>();
        List<Unit> team2 = new ArrayList<>();

        Names[] names = Names.values();

        for (int i = 0; i < teamCount; i++) {
            int indexVerh = random.nextInt(names.length - 1);
            int indexNiz = random.nextInt(names.length + 1);

            String verhName = names[indexVerh].toString();
            String nizName = names[indexNiz].toString();

            int val = random.nextInt(7);
            int X1 = random.nextInt(10);
            int X2 = random.nextInt(10);

            Position xy1 = new Position(X1, 0);
            Position xy2 = new Position(X2, 9);

            switch (val) {
                case 0:
                    team1.add(new Bandit(verhName, xy1.getX(), xy1.getY(), 1, "ближний бой"));
                    team2.add(new Bandit(nizName, xy2.getX(), xy2.getY(), 2, "ближний бой"));
                    break;
                case 1:
                    team1.add(new Crossbowman(verhName, xy1.getX(), xy1.getY(), 1, "дальний стрелы"));
                    team2.add(new Crossbowman(nizName, xy2.getX(), xy2.getY(), 2, "дальний стрелы"));
                    break;
                case 2:
                    team1.add(new Snaiper(verhName, xy1.getX(), xy1.getY(), 1, "дальний стрелы"));
                    team2.add(new Snaiper(nizName, xy2.getX(), xy2.getY(), 2, "дальний стрелы"));
                    break;
                case 3:
                    team1.add(new Magic(verhName, xy1.getX(), xy1.getY(), 1, "дальний магия"));
                    team2.add(new Magic(nizName, xy2.getX(), xy2.getY(), 2, "дальний магия"));
                    break;
                case 4:
                    team1.add(new Monk(verhName, xy1.getX(), xy1.getY(), 1, "дальний магия"));
                    team2.add(new Monk(nizName, xy2.getX(), xy2.getY(), 2, "дальний магия"));
                    break;
                case 5:
                    team1.add(new Peasant(verhName, xy1.getX(), xy1.getY(), 1, "ближний бой"));
                    team2.add(new Peasant(nizName, xy2.getX(), xy2.getY(), 2, "ближний бой"));
                    break;
                case 6:
                    team1.add(new Spearman(verhName, xy1.getX(), xy1.getY(), 1, "ближний бой"));
                    team2.add(new Spearman(nizName, xy2.getX(), xy2.getY(), 2, "ближний бой"));
                    break;
            }
        }
        System.out.println("-".repeat(16));
        ArrayList<Unit> all = new ArrayList<>();
        all.addAll(team1);
        all.addAll(team2);
        all.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o1.getPriority() - o2.getPriority();
            }
        });
        all.forEach(n -> {
            n.step();
            System.out.println(n.toInfo());
        });
        System.out.println("Команда сверху:");
        for (Unit a : team1) {
            System.out.printf("Name: %s, Position: x: %d, y: %d\n", a.getName(), a.getPosition().getX(), a.getPosition().getY());
        }

        System.out.println("Команда снизу:");
        for (Unit a : team2) {
            System.out.printf("Name: %s, Position: x: %d, y: %d\n", a.getName(), a.getPosition().getX(), a.getPosition().getY());
        }
    }
}
