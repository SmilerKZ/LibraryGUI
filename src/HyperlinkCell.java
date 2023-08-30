import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class HyperlinkCell implements  Callback<TableColumn<BookModel, Hyperlink>, TableCell<BookModel, Hyperlink>> {
	 
    @Override
    public TableCell<BookModel, Hyperlink> call(TableColumn<BookModel, Hyperlink> arg) {
        TableCell<BookModel, Hyperlink> cell = new TableCell<BookModel, Hyperlink>() {
            @Override
            protected void updateItem(Hyperlink item, boolean empty) {
                setGraphic(item);
            }
        };
        return cell;
    }
}
