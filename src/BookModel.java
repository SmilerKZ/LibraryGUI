import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.SimpleIntegerProperty;
//import javafx.scene.control.Hyperlink;

public class BookModel {
	private final SimpleStringProperty author;
	private final SimpleStringProperty title;
	private final SimpleStringProperty year;
	private final SimpleStringProperty isbn;
	private final SimpleStringProperty publisher;
	private final SimpleStringProperty llc;
	private final SimpleStringProperty stock;
	//private final SimpleStringProperty links;
	private final SimpleStringProperty hyperlink;
    
	BookModel(String author, String title, String year, String isbn,
    		String publisher, String llc, String stock, String hyperlink) { //String hyperlink
        this.author = new SimpleStringProperty(author);
        this.title = new SimpleStringProperty(title);
        this.year = new SimpleStringProperty(year);
        this.isbn = new SimpleStringProperty(isbn);
        this.publisher = new SimpleStringProperty(publisher);
        this.llc = new SimpleStringProperty(llc);
        this.stock = new SimpleStringProperty(stock);
        this.hyperlink = new SimpleStringProperty(hyperlink);
    }
	
	void replace(BookModel newBookModel) {
		this.setAuthor(newBookModel.getAuthor());
		this.setTitle(newBookModel.getTitle());
		this.setYear(newBookModel.getYear());
		this.setIsbn(newBookModel.getIsbn());
		this.setPublisher(newBookModel.getPublisher());
		this.setLlc(newBookModel.getLlc());
		this.setStock(newBookModel.getStock());
		this.setHyperlink(newBookModel.getHyperlink());
	}
	
    public String getAuthor() {
        return author.get();
    }

    public void setAuthor(String newAuthor) {
        author.set(newAuthor);
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String newTitle) {
        title.set(newTitle);
    }

    public String getYear() {
        return year.get();
    }

    public void setYear(String newYear) {
        year.set(newYear);
    }
    public String getIsbn() {
        return isbn.get();
    }

    public void setIsbn(String newISBN) {
        isbn.set(newISBN);
    }

    public String getPublisher() {
        return publisher.get();
    }

    public void setPublisher(String newPublisher) {
        publisher.set(newPublisher);
    }

    public String getLlc() {
        return llc.get();
    }

    public void setLlc(String newLLC) {
        llc.set(newLLC);
    }
    public String getStock() {
        return stock.get();
    }

    public void setStock(String newStock) {
        stock.set(newStock);
    }
    public String getHyperlink() {
        return hyperlink.get();
    }

    public void setHyperlink(String newHyperlink) {
        hyperlink.set(newHyperlink);
    }
    
}
