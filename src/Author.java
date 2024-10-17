public class Author {
    private String name;
    private String family;

    public Author(String name, String family) {
        this.name = name;
        this.family = family;

    }

    public String getName() {
        return this.name;
    }

    public String getFamily() {
        return this.family;
    }

    public boolean equals(Author author) {
        return this.name.equals(author.getName()) && this.family.equals(author.getFamily());
    }

    public String toString() {
        return "Имя автора " + name + " его фамилия " + family;
    }

    public int hashCod() {
        return this.hashCode();
    }
}
