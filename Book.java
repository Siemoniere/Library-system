package wypozyczanie;
/**
 * Klasa reprezentująca książkę w systemie wypożyczeń.
 */
public final class Book {

    private final String title;

    /**
     * Konstruuje nową książkę z podanym tytułem.
     *
     * @param title Tytuł książki
     */
    public Book(final String title) {
        this.title = title;
    }

    /**
     * Zwraca tytuł książki.
     *
     * @return Tytuł książki.
     */
    public String getTitle() {
        return title;
    }
}
