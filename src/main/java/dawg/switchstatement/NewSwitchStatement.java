package dawg.switchstatement;

public class NewSwitchStatement {
    enum Person {
        MOZART, PICASSO, GOETHE, DOSTOEVSKY, PROKOFIEV, DALI
    }

    public static void main(String[] args) {
        print(Person.MOZART);
    }

    static void print(Person person) {
        String title = switch (person) {
            case DALI, PICASSO -> "painter";
            case MOZART, PROKOFIEV -> "composer";
            case GOETHE, DOSTOEVSKY -> "writer";
        };
        System.out.printf("%s was a %s%n", person, title);
    }
}
