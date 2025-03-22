public class Book {
        public String title;
        public int releaseYear;
        public Author author;
        public int pages;

        public Book(String title, int releaseYear, Author author, int pages) {
            this.author = author;
            this.title = title;
            this.releaseYear = releaseYear;
            this.pages = pages;
        }

        public boolean isBig() {
            return pages > 500;
        }

    public boolean matches(String word) {
        return title.toLowerCase().contains(word.toLowerCase()) ||
                author.getName().toLowerCase().contains(word.toLowerCase()) ||
                author.getSurname().toLowerCase().contains(word.toLowerCase());
    }

    public int estimatePrice() {
            return Math.max((int) Math.floor(3 * pages * Math.sqrt(author.getRating())), 250);
    }
    public void printInfo() {
        System.out.println("Название: " + title);
        System.out.println("Год выпуска: " + releaseYear);
        System.out.println("Автор: " + author.getSurname() + " " + author.getName() + " Ratio: " +author.getRating());
        System.out.println("Страниц: " + pages);
        System.out.println("Книга большая? " + isBig());
        System.out.println("Оценочная стоимость: " + estimatePrice() + " руб.");
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Author kirill = new Author("Kirill", "Radiushin", 5);
        Book book1 = new Book("afafs",2005, kirill, 700);
        book1.printInfo();

        System.out.println("Cовпадения: " + book1.matches("kiril"));
        System.out.println("Cовпадения: " + book1.matches("uhgh"));

        System.out.println("Cовпадения: " + book1.matches("afa"));
        System.out.println("Cовпадения: " + book1.matches("uhgh"));
    }
}