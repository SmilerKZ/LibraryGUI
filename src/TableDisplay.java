import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
/*
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;*/
//import javafx.scene.control.Hyperlink;
import java.util.ArrayList;

public class TableDisplay {
		
		 final TextField addAuthor = new TextField();
		 final TextField addTitle = new TextField();
		 final TextField addIsbn = new TextField();
		 final TextField addYear = new TextField();
		 final TextField addPublisher = new TextField();
		 final TextField addLlc = new TextField();
	 final HBox addPane = new HBox();
	 final HBox addPane1 = new HBox();
	 final TableView<BookModel> table = new TableView<BookModel>();//make private
	 final ObservableList<BookModel> dataList  = FXCollections.observableArrayList();//make private
	 final ObservableList<BookModel> filteredData = FXCollections.observableArrayList();
 
	 TableColumn authorCol = new TableColumn("Author");
	 TableColumn titleCol = new TableColumn("Title");
	 TableColumn yearCol = new TableColumn("Year");
	 TableColumn isbnCol = new TableColumn("ISBN");
	 TableColumn publisherCol = new TableColumn("Publisher");
	 TableColumn llcCol = new TableColumn("LLC");
	 TableColumn stockCol = new TableColumn("Stock");
	 TableColumn hyperlinkCol = new TableColumn("Amazone library");
	 
	 //void sortedTableDisplay() 
	 
	 TableDisplay() {
		 
		 table.setEditable(true);
		
		 
		 //authorCol
	     authorCol.prefWidthProperty().bind(table.widthProperty().divide(8));//setPrefWidth(100);
	     authorCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("author"));
	     authorCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     authorCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setAuthor(t.getNewValue());
	            }
	        }
	      );
	      
	     
	     //titleCol
	     titleCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     titleCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("title"));
	     titleCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     titleCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setTitle(t.getNewValue());
	            }
	        }
	      );
	        
	     //yearCol
	     yearCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     yearCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("year"));
	     yearCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     yearCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setYear(t.getNewValue());
	            }
	        }
	      );
	        
	     //isbnCol
	     isbnCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     isbnCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("isbn"));
	     isbnCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     isbnCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setIsbn(t.getNewValue());
	            }
	        }
	      );
	        
	     //publisherCol
	     publisherCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     publisherCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("publisher"));
	     publisherCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     publisherCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setAuthor(t.getNewValue());
	            }
	        }
	      );
	        
	     //llcCol
	     llcCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     llcCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("llc"));
	     llcCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     llcCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setLlc(t.getNewValue());
	            }
	        }
	      );
	        
	     //stockCol
	     stockCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     stockCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("stock"));
	     stockCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     stockCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setStock(t.getNewValue());
	            }
	        }
	      );
	     
	   //hyperlinks
	     
	     
	     filteredData.addAll(dataList);
	       
	        
	        dataList.addListener(new ListChangeListener<BookModel>() {
		            @Override
		            public void onChanged(ListChangeListener.Change<? extends BookModel> change) {
		                updateFilteredData();
		            }
		        });
	        
	      
	     
	     hyperlinkCol.prefWidthProperty().bind(table.widthProperty().divide(8));
	     hyperlinkCol.setCellValueFactory(
	     	new PropertyValueFactory<BookModel, String>("hyperlink"));
	     hyperlinkCol.setCellFactory(TextFieldTableCell.forTableColumn());
	     hyperlinkCol.setOnEditCommit(
	     	new EventHandler<CellEditEvent<BookModel, String>>() {
	        	@Override
	            public void handle(CellEditEvent<BookModel, String> t) {
	            	((BookModel) t.getTableView().getItems().get(
	                	t.getTablePosition().getRow())
	                	).setHyperlink(t.getNewValue());
	            }
	        }
	      );
	      
	        
	     table.setItems(dataList);
	        table.setItems(filteredData);
	       
	        table.getColumns().addAll(authorCol, titleCol,
	        		yearCol, isbnCol, publisherCol, llcCol, stockCol,hyperlinkCol); 
	        
	        
	        
	    
	        
	      
	   		 addAuthor.textProperty().addListener(new ChangeListener<String>() {
	   	            @Override
	   	            public void changed(ObservableValue<? extends String> observable,
	   	                    String oldValue, String newValue) {

	   	                updateFilteredData();
	   	            }
	   	        }); 
	        addAuthor.setPromptText("Author");
	        addAuthor.setPrefWidth(100);//addAuthor.setMaxWidth(authorCol.getPrefWidth());
	        
	        addTitle.textProperty().addListener(new ChangeListener<String>() {
   	            @Override
   	            public void changed(ObservableValue<? extends String> observable,
   	                    String oldValue, String newValue) {

   	                updateFilteredData();
   	            }
   	        }); 
	        addTitle.setPrefWidth(100);
	        addTitle.setPromptText("Title");
	        
	        
	        addYear.textProperty().addListener(new ChangeListener<String>() {
   	            @Override
   	            public void changed(ObservableValue<? extends String> observable,
   	                    String oldValue, String newValue) {

   	                updateFilteredData();
   	            }
   	        }); 
	        addYear.setPromptText("Year");
	        addYear.setPrefWidth(100);
	        
	        addIsbn.textProperty().addListener(new ChangeListener<String>() {
   	            @Override
   	            public void changed(ObservableValue<? extends String> observable,
   	                    String oldValue, String newValue) {

   	                updateFilteredData();
   	            }
   	        }); 
	        addIsbn.setPromptText("ISBN");
	        addIsbn.setPrefWidth(100);
	        
	        
	        addPublisher.textProperty().addListener(new ChangeListener<String>() {
   	            @Override
   	            public void changed(ObservableValue<? extends String> observable,
   	                    String oldValue, String newValue) {

   	                updateFilteredData();
   	            }
   	        }); 
	        addPublisher.setPrefWidth(100);
	        addPublisher.setPromptText("Publisher");
	        
	        
	        
	        addLlc.textProperty().addListener(new ChangeListener<String>() {
   	            @Override
   	            public void changed(ObservableValue<? extends String> observable,
   	                    String oldValue, String newValue) {

   	                updateFilteredData();
   	            }
   	        });
	        addLlc.setPromptText("LLC");
	        addLlc.setPrefWidth(100);
	        final TextField addStock = new TextField();
	        addStock.setPromptText("Stock");
	        addStock.setPrefWidth(100);
	        
	        final TextField addHyperlink = new TextField();
	        addHyperlink.setPromptText("Hyperlink");
	        addHyperlink.setPrefWidth(100);
	        
	        final Button addBtn = new Button("Add");
	        addBtn.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	                dataList.add(new BookModel(
	                    addAuthor.getText(),
	                    addTitle.getText(),
	                    addYear.getText(),
	                    addIsbn.getText(),
	                    addPublisher.getText(),
	                    addLlc.getText(),
	                    addStock.getText(),
	                    addHyperlink.getText()
	                ));
	                addAuthor.clear();
	                addTitle.clear();
	                addYear.clear();
	                addIsbn.clear();
	                addPublisher.clear();
	                addLlc.clear();
	                addStock.clear();
	                addHyperlink.clear();
	            }
	        });
	        
	        final Button dltButton = new Button("Delete");
	        dltButton.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent e) {
	           BookModel selectedItem = table.getSelectionModel().getSelectedItem();
	            table.getItems().remove(selectedItem);
	            dataList.remove(selectedItem);
	            }}
	        );
	        
	        
	        Button credits = new Button("Credits");

	        credits.setOnAction(event -> {
        		
        		Stage credits_stage = new Stage();
        		VBox credits_pane = new VBox();
        		credits_pane.setAlignment(Pos.TOP_CENTER);
        		Scene credits_scene = new Scene (credits_pane,500, 500);
        		credits_stage.getIcons().add(new Image("http://icons.iconarchive.com/icons/hopstarter/soft-scraps/256/User-Group-icon.png"));
        		ImageView lemonPlanet = new ImageView(new Image("lemon-planet.png"));
        		credits_pane.getChildren().add(new Label("Bagdat: abc\n2xxxxx\n\n"));
        		credits_pane.getChildren().add(new Label("Baurzhan: abc\n2xxxxx\n\n"));
        		credits_pane.getChildren().add(new Label("Mukhtar: abc\n2xxxxx\n\n"));
        		credits_pane.getChildren().add(lemonPlanet);
        		credits_stage.setTitle("Credits");
        		credits_stage.setScene(credits_scene);
        		credits_stage.show();
        		
        		

        	});
	        
	        Button sort = new Button("Sort");
	        sort.setOnAction(event -> {
	        	Stage sort_stage = new Stage();
	        	//GridPane sort_pane;
	        	VBox sort_pane = new VBox();
	        	Scene sort_scene = new Scene(sort_pane, 500, 500);
	        	ChoiceBox<String> typeChoice = new ChoiceBox<>();
	        	typeChoice.getItems().add("Author");
	        	typeChoice.getItems().add("Title");
	        	typeChoice.getItems().add("Year");
	        	typeChoice.getItems().add("ISBN");
	        	typeChoice.getItems().add("Publisher");
	        	typeChoice.getItems().add("LLC");
	        	typeChoice.setValue("Author");
	        	Button ascSortBtn = new Button("Ascending Sort"),
	        			descSortBtn = new Button("Descending Sort");
	        	sort_pane.getChildren().addAll(typeChoice, ascSortBtn, descSortBtn);
	        	ascSortBtn.setOnAction(e ->{
	        	SortingAlgorithm.ascSort(PlayGround.tableDisplay, typeChoice.getValue());
	        	});
	        	descSortBtn.setOnAction(e ->{
		        	SortingAlgorithm.descSort(PlayGround.tableDisplay, typeChoice.getValue());
		        	});
	        	sort_stage.setTitle("Sort");
        		sort_stage.setScene(sort_scene);
        		sort_stage.show();
	        
        		
	        });
	        
	        final Button hyperlinkBtn = new Button("Go to the link");
	        
	        hyperlinkBtn.setOnAction(event -> {
	        	BookModel selectedItem = PlayGround.tableDisplay.table.getSelectionModel().getSelectedItem();
	            //tableDisplay.table.getItems();
	        	if(Desktop.isDesktopSupported())
	            {
	                try {
	                    Desktop.getDesktop().browse(new URI(selectedItem.getHyperlink()));
	                } catch (IOException e1) {
	                    e1.printStackTrace();
	                } catch (URISyntaxException e1) {
	                    e1.printStackTrace();
	                }
	            }
	        });
	        //final Button hyperlinkBtn = new Button("Go to the link");
	        
	        
	        //addPane.getChildren().addAll(addAuthor, addTitle, addYear, addIsbn,
	        //		addPublisher, addLlc, addStock, addBtn, dltButton); //addHyperlink
	        final Button export = new Button("Save the list");
	        export.setOnAction(new EventHandler<ActionEvent>() {

	            @Override
	            public void handle(ActionEvent e)  {
	              try {
	                write();
	              }
	              catch (Exception ex) {
	            ex.printStackTrace();
	        }

	            }
	            //
	            
	        });
	        
	        
	        addPane1.getChildren().addAll(credits,sort,hyperlinkBtn);
	        addPane.getChildren().addAll(addAuthor, addTitle, addYear, addIsbn,
	        		addPublisher, addLlc, addStock, addHyperlink, addBtn, dltButton,export);
	        addPane.getChildren().remove(dltButton);
	        
	 }
	 
	 
	 
	 public void write() throws Exception {
	        Writer writer = null;
	        try {
	            File file = new File("lmsdb.csv");
	            writer = new BufferedWriter(new FileWriter(file));
	            for (BookModel bookmodel : dataList) {

	                String text = bookmodel.getAuthor() + ";" + bookmodel.getTitle() + ";" + bookmodel.getYear() + ";"+ bookmodel.getIsbn() + ";"+ bookmodel.getPublisher() + ";"+ bookmodel.getLlc() + ";"+ bookmodel.getStock() + ";"+bookmodel.getHyperlink() +";\n";

	                writer.write(text);
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        finally {

	            writer.flush();
	             writer.close();
	        }
	        
            
	 }
	 
	 void updateFilteredData() {
         filteredData.clear();

         for (BookModel book : dataList) {
             if (matchesFilter(book))  {
                 filteredData.add(book);
             }
             
         }

         // Must re-sort table after items changed
         reapplyTableSortOrder();
     }
	 
	
	 
	 
	boolean matchesFilter(BookModel book) {
			String filterString =  addTitle.getText();
	        String lowerCaseFilterString = filterString.toLowerCase();
	        
	        String filterString1 =  addAuthor.getText();
	        String lowerCaseFilterString1 = filterString1.toLowerCase();
	        
	        String filterString2 =  addIsbn.getText();
	        String filterString3 =  addYear.getText();
	        
	        String filterString4 =  addPublisher.getText();
	        String lowerCaseFilterString4 = filterString4.toLowerCase();
	        
	        String filterString5 =  addLlc.getText();
	        String lowerCaseFilterString5 = filterString5.toLowerCase();
	        
	        if(filterString.isEmpty()) {
	        	filterString="";
	        	if(book.getTitle().toLowerCase().contains(lowerCaseFilterString) && book.getAuthor().toLowerCase().contains(lowerCaseFilterString1) 
	        			&& book.getIsbn().contains(filterString2)
	        			&& book.getYear().contains(filterString3)
	        			&& book.getPublisher().toLowerCase().contains(lowerCaseFilterString4)
	        			&& book.getLlc().toLowerCase().contains(lowerCaseFilterString5)) {
	        		return true;
	        	}
	        }
	        
	        else if(filterString1.isEmpty()) {
	        	filterString1="";
	        	if(book.getTitle().toLowerCase().contains(lowerCaseFilterString) && book.getAuthor().toLowerCase().contains(lowerCaseFilterString1) 
	        			&& book.getIsbn().contains(filterString2)
	        			&& book.getYear().contains(filterString3)
	        			&& book.getPublisher().toLowerCase().contains(lowerCaseFilterString4)
	        			&& book.getLlc().toLowerCase().contains(lowerCaseFilterString5)) {
	        		return true;
	        	}     	
	        }
	        else if(filterString2.isEmpty()) {
	        	filterString2="";
	        	if(book.getTitle().toLowerCase().contains(lowerCaseFilterString) && book.getAuthor().toLowerCase().contains(lowerCaseFilterString1) 
	        			&& book.getIsbn().contains(filterString2)
	        			&& book.getYear().contains(filterString3)
	        			&& book.getPublisher().toLowerCase().contains(lowerCaseFilterString4)
	        			&& book.getLlc().toLowerCase().contains(lowerCaseFilterString5)) {
	        		return true;
	        	}     	
	        }	
	        else if(filterString3.isEmpty()) {
	        	filterString2="";
	        	if(book.getTitle().toLowerCase().contains(lowerCaseFilterString) && book.getAuthor().toLowerCase().contains(lowerCaseFilterString1) 
	        			&& book.getIsbn().contains(filterString2)
	        			&& book.getYear().contains(filterString3)
	        			&& book.getPublisher().toLowerCase().contains(lowerCaseFilterString4)
	        			&& book.getLlc().toLowerCase().contains(lowerCaseFilterString5)) {
	        		return true;
	        	}     	
	        }	
	        
	        else if(filterString4.isEmpty()) {
	        	filterString2="";
	        	if(book.getTitle().toLowerCase().contains(lowerCaseFilterString) && book.getAuthor().toLowerCase().contains(lowerCaseFilterString1) 
	        			&& book.getIsbn().contains(filterString2)
	        			&& book.getYear().contains(filterString3)
	        			&& book.getPublisher().toLowerCase().contains(lowerCaseFilterString4)
	        			&& book.getLlc().toLowerCase().contains(lowerCaseFilterString5)) {
	        		return true;
	        	}     	
	        }
	       
	        else if (filterString.isEmpty() && filterString1.isEmpty()&&filterString2.isEmpty()&&filterString3.isEmpty()&&filterString4.isEmpty()&&filterString5.isEmpty()) {
	            // No filter --> Add all.
	            return true;
	        }
	        return false; // Does not match
	        
	        
	    }

	
	 

	private void reapplyTableSortOrder() {
	        ArrayList<TableColumn<BookModel, ?>> sortOrder = new ArrayList<>(table.getSortOrder());
	        table.getSortOrder().clear();
	        table.getSortOrder().addAll(sortOrder);
	    
	}
	
	
	
	 
}


