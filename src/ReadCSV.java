import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadCSV {
	ReadCSV(TableDisplay tableDisplay) {
	    String CsvFile = "lmsdb.csv";
	    String FieldDelimiter = ";";

	    BufferedReader br;

	    try {
	        br = new BufferedReader(new FileReader(CsvFile));
	        //br.readLine();
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] fields = line.split(FieldDelimiter, -1);

	            BookModel book = new BookModel(fields[0], fields[1], fields[2],
	                    fields[3], fields[4], fields[5], fields[6], fields[7]); //fields[7]
	            tableDisplay.dataList.add(book);
	        }
	        
	        
	    } catch (FileNotFoundException ex) {
	        Logger.getLogger( PlayGround.class.getName())
	                .log(Level.SEVERE, null, ex);
	    } catch (IOException ex) {
	        Logger.getLogger( PlayGround.class.getName())
	                .log(Level.SEVERE, null, ex);
	    }

	}

}
