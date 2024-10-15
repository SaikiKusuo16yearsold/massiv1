public class Main {

    public static void main(String[] args) {
        Author writerDima = new Author("dima", "davydov");
        Author writerSasha = new Author("sasha", "eblanov");
        Book firstBook = new Book("Voina i Mir", writerDima, 1984);
        Book secondBook = new Book("Prestuplenie i nakazanie", writerSasha, 1978);

        System.out.println(secondBook.getYearPublication());
        secondBook.setYearPublication(1967);
        System.out.println(secondBook.getYearPublication());
        System.out.println(writerDima.getName());
        System.out.println(writerDima.getFamily());


    }
}
