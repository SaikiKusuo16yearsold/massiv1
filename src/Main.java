public class Main {

    public static void main(String[] args) {
        Author writerDima = new Author("dima", "davydov");
        Author writerSasha = new Author("sasha", "sasha");
        Book firstBook = new Book("Voina i Mir", writerDima, 1984);
        Book secondBook = new Book("Voina i Mir", writerDima, 1984);

        System.out.println(secondBook.getYearPublication());
        System.out.println(secondBook.getYearPublication());
        System.out.println(writerDima.getName());
        System.out.println(secondBook);
        System.out.println(firstBook.equals(secondBook));
        System.out.println(writerSasha);
        System.out.println(writerSasha.equals(writerSasha));
        System.out.println(firstBook.hashCode());
        System.out.println(secondBook.hashCode());
        System.out.println(firstBook.hashCod());
        System.out.println(writerDima.hashCod());
    }
}
