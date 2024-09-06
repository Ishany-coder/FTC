public class library {
    public static class Book {
        private int price;
        public String author;
        public String title;

        public Book(int price, String author, String title) {
            this.price = price;
            this.author = author;
            this.title = title;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public static class Ebook extends Book {
            public Ebook(int price, String author, String title) {
                super(price, author, title);
            }

            @Override
            public void setPrice(int price) {
                if (price < 0) {
                    throw new IllegalArgumentException("Price cannot be negative");
                }
                super.setPrice(price);
            }
        }

        public static class Printed extends Book {
            public Printed(int price, String author, String title) {
                super(price, author, title);
            }
        }
    }

    public static void mymethod() {
        System.out.println("Hello from mymethod");
    }

    public static void main(String[] args) {
        mymethod();
        Book book = new Book(10, "John Doe", "Java for Dummies");
        Book.Ebook ebook = new Book.Ebook(5, "Jane Doe", "Advanced Java");
        Book.Printed printed = new Book.Printed(15, "John Doe", "Java for Dummies");
        System.out.println(book.getPrice());
        System.out.println(book.author);
        System.out.println(book.title);
        System.out.println(ebook.author);
        System.out.println(ebook.getPrice());
        System.out.println(ebook.title);
        System.out.println(printed.getPrice());
        System.out.println(printed.author);
        System.out.println(printed.title);
    }
}