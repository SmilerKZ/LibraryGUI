import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import java.awt.Desktop;
import java.net.URI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
//Set time!!!

public class PlayGround extends Application{
		static TableDisplay tableDisplay = new TableDisplay();
	    public static void main(String[] args) {
	    	
	        launch(args);
	    }
	   
	    @Override
	    public void start(Stage primaryStage) {
	    	new ReadCSV(tableDisplay);
	        primaryStage.setTitle("Sign in");
	        
	        

	        // Create the registration form grid pane
	        GridPane gridPane = createRegistrationFormPane();
	        // Add UI controls to the registration form grid pane
	        addUIControls(gridPane);
	        // Create a scene with registration form grid pane as the root node
	        Scene scene = new Scene(gridPane, 800, 500);
	        // Set the scene in primary stage	
	        primaryStage.setScene(scene);
	        
	        primaryStage.show();
	    }


	    private GridPane createRegistrationFormPane() {
	        // Instantiate a new Grid Pane
	        GridPane gridPane = new GridPane();

	        // Position the pane at the center of the screen, both vertically and horizontally
	        gridPane.setAlignment(Pos.CENTER);

	        // Set a padding of 20px on each side
	        gridPane.setPadding(new Insets(40, 40, 40, 40));

	        // Set the horizontal gap between columns
	        gridPane.setHgap(10);

	        // Set the vertical gap between rows
	        gridPane.setVgap(10);

	        // Add Column Constraints

	        // columnOneConstraints will be applied to all the nodes placed in column one.
	        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
	        columnOneConstraints.setHalignment(HPos.RIGHT);

	     
	        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
	        columnTwoConstrains.setHgrow(Priority.ALWAYS);

	        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

	        return gridPane;
	    }

	    private void addUIControls(GridPane gridPane) {
	        // Add Header
	        Label headerLabel = new Label("Sign in");
	        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
	        gridPane.add(headerLabel, 0,0,2,1);
	        GridPane.setHalignment(headerLabel, HPos.CENTER);
	        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

	        // Add Name Label
	        Label nameLabel = new Label("Full Name : ");
	        gridPane.add(nameLabel, 0,1);

	        // Add Name Text Field
	        TextField nameField = new TextField();
	        nameField.setPrefHeight(40);
	        gridPane.add(nameField, 1,1);
	        String userN = "";
			String passW="";
	        
	        final Label message = new Label("");
	        gridPane.add(message, 1, 4);

	        // Add Password Label
	        Label passwordLabel = new Label("Password : ");
	        gridPane.add(passwordLabel, 0, 3);

	        // Add Password Field
	        PasswordField passwordField = new PasswordField();
	        passwordField.setPrefHeight(40);
	        gridPane.add(passwordField, 1, 3);

	        // Add Submit Button
	        Button submitButton = new Button("Submit");
	        submitButton.setPrefHeight(40);
	        submitButton.setDefaultButton(true);
	        submitButton.setPrefWidth(100);
	        gridPane.add(submitButton, 0, 5, 2, 1);
	        GridPane.setHalignment(submitButton, HPos.CENTER);
	        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));
	        
	        
	        
	        
	        submitButton.setOnAction(new EventHandler<ActionEvent>()  {
	            @Override
	            public void handle(ActionEvent event) {
	            	
          		  
	            	Stage stage = new Stage();
	            	
	            	BufferedReader br;

	        	    try {
	        	        br = new BufferedReader(new FileReader("registered.rtf"));
	        	        //br.readLine();
	        	        String line;
	        	        while ((line = br.readLine()) != null) {
	        	        	String adminINFO[] = line.split(";", -1);
	        	        	if(nameField.getText().equals(adminINFO[0]) && passwordField.getText().equals(adminINFO[1])) {
	        	        		//niceEntrance(stage);
	        	        		System.out.print("true");
	        	        		final VBox vbox = new VBox();
	        			        Scene scene = new Scene(vbox);
	        		        	FlowPane menuPane = new FlowPane();
	        		        	
	        			        vbox.setStyle("-fx-background-color: #32cd32");
	        			        menuPane.getChildren().addAll(tableDisplay.addPane1);
	        			        stage.setTitle("LEMbraty 1.0.0 DEMO by e-LEMON-ators");
	        			        stage.setWidth(900);//745
	        			        stage.setHeight(530);
	        			        stage.getIcons().add(new Image("http://icons.iconarchive.com/icons/google/noto-emoji-food-drink/1024/32345-lemon-icon.png"));
	        			         final Label label = new Label("Address Book");
	        			        label.setFont(new Font("Arial", 20));
	        			        vbox.setSpacing(5);
	        			        vbox.setPadding(new Insets(10, 10, 5, 10));
	        			        vbox.setPrefWidth(690);
	        			        vbox.getChildren().addAll(label, menuPane, tableDisplay.table, tableDisplay.addPane);
	        			        vbox.setVgrow(tableDisplay.table, Priority.ALWAYS);
	        			 
	        			        stage.setScene(scene);
	        			        stage.show();
	        			        ((Node)(event.getSource())).getScene().getWindow().hide();
	        	        	}
	        	        	/*if(!nameField.getText().equals(adminINFO[0]) || !passwordField.getText().equals(adminINFO[1])) {
	    	            		message.setText("Your username or password is incorrect!");
	    			            message.setTextFill(Color.rgb(210, 39, 30));
	    	                    return;
	    	                }*/
	        	        }
	        	        
	        	        
	        	    } catch (FileNotFoundException ex) {
	        	        Logger.getLogger( PlayGround.class.getName())
	        	                .log(Level.SEVERE, null, ex);
	        	    } catch (IOException ex) {
	        	        Logger.getLogger( PlayGround.class.getName())
	        	                .log(Level.SEVERE, null, ex);
	        	    }
	        	    
	                /*
	            	if(!nameField.getText().equals("Baur") | !passwordField.getText().equals("1111")) {
	            		message.setText("Your username or password is incorrect!");
			            message.setTextFill(Color.rgb(210, 39, 30));
	                    return;
	                }*/
	            	
	            	
	               
	    	        
	            	
	        };
	    } ) ;  	
	    }	
	       /* void niceEntrance(Stage stage) {
	        	final VBox vbox = new VBox();
		        Scene scene = new Scene(vbox);
	        	FlowPane menuPane = new FlowPane();
	        	
		        vbox.setStyle("-fx-background-color: #32cd32");
		        menuPane.getChildren().addAll(tableDisplay.addPane1);
		        stage.setTitle("LEMbraty 1.0.0 DEMO by e-LEMON-ators");
		        stage.setWidth(900);//745
		        stage.setHeight(530);
		        stage.getIcons().add(new Image("http://icons.iconarchive.com/icons/google/noto-emoji-food-drink/1024/32345-lemon-icon.png"));
		         final Label label = new Label("Address Book");
		        label.setFont(new Font("Arial", 20));
		        vbox.setSpacing(5);
		        vbox.setPadding(new Insets(10, 10, 5, 10));
		        vbox.setPrefWidth(690);
		        vbox.getChildren().addAll(label, menuPane, tableDisplay.table, tableDisplay.addPane);
		        vbox.setVgrow(tableDisplay.table, Priority.ALWAYS);
		 
		        stage.setScene(scene);
		        stage.show();
		        ((Node)(event.getSource())).getScene().getWindow().hide();
	        }*/
}
