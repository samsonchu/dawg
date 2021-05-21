package dawg.switchstatement;

public class ClassicSwitchStatement {
    enum Person {
        MOZART, PICASSO, GOETHE, DOSTOEVSKY, PROKOFIEV, DALI
    }

    public static void main(String[] args) {
        print(Person.DOSTOEVSKY);
    }

    static void print(Person person) {
        switch (person) {
            case DALI:
            case PICASSO:
                System.out.printf("%s was a painter%n", person);
                break;
            case MOZART:
            case PROKOFIEV:
                System.out.printf("%s was a composer%n", person);
                break;
            case GOETHE:
            case DOSTOEVSKY:
                System.out.printf("%s was a writer%n", person);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("Unknown person: %s", person));
        }
    }
}
