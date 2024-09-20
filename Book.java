public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 0.0;
    }

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("--------------------------------");
        System.out.println("       Book Information         ");
        System.out.println("--------------------------------");
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN   : " + this.ISBN);
        System.out.printf("Price  : $%.2f\n", this.price);
        System.out.println(" ");
    }

    // Additional method to apply a discount to the book's price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            this.price -= this.price * (discountPercentage / 100);
        }
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        Book book1 = new Book("Jamila", "Ch. Aitmatov", "9780743273565", 10.99);
        Book book2 = new Book("1984", "George Orwell", "9780451524935", 14.99);

        book1.displayInfo();
        book2.displayInfo();

        // Applying a discount and displaying the updated information
        book1.applyDiscount(10);  // Apply 10% discount
        book1.displayInfo();
    }
} 
