import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

//Selection Sort
public class SortingAlgorithm {
	static BookModel temp = new BookModel("X", "X", "0", "X", "X", "X", "0", "X");

	//UNI
	static void descSort(TableDisplay tableDisplay, String type)
    {
		//FXCollections.sort(tableDisplay.dataList.);
        int n = tableDisplay.dataList.size();
        switch(type) {
        	case "Author":
        		for (int i = 0; i < n-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getAuthor().compareTo(tableDisplay.dataList.get(min_idx).getAuthor())>0) {
                            min_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(min_idx));
                    tableDisplay.dataList.get(min_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "Title":
        		for (int i = 0; i < n-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getTitle().compareTo(tableDisplay.dataList.get(min_idx).getTitle())>0) {
                            min_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(min_idx));
                    tableDisplay.dataList.get(min_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "Year":
        		for (int i = 0; i < n-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getYear().compareTo(tableDisplay.dataList.get(min_idx).getYear())>0) {
                            min_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(min_idx));
                    tableDisplay.dataList.get(min_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "ISBN":
        		for (int i = 0; i < n-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getIsbn().compareTo(tableDisplay.dataList.get(min_idx).getIsbn())>0) {
                            min_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(min_idx));
                    tableDisplay.dataList.get(min_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "Publisher":
        		for (int i = 0; i < n-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getPublisher().compareTo(tableDisplay.dataList.get(min_idx).getPublisher())>0) {
                            min_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(min_idx));
                    tableDisplay.dataList.get(min_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "LLC":
        		for (int i = 0; i < n-1; i++)
                {
                    int min_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getLlc().compareTo(tableDisplay.dataList.get(min_idx).getLlc())>0) {
                            min_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(min_idx));
                    tableDisplay.dataList.get(min_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        }
        for(int i=0; i<n; i++) {
        	tableDisplay.table.getItems().set(i, tableDisplay.dataList.get(i));
        }

}
	static void ascSort(TableDisplay tableDisplay, String type)
    {
		//FXCollections.sort(tableDisplay.dataList.);
        int n = tableDisplay.dataList.size();
        switch(type) {
        	case "Author":
        		for (int i = 0; i < n-1; i++)
                {
                    int max_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getAuthor().compareTo(tableDisplay.dataList.get(max_idx).getAuthor())<0) {
                            max_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(max_idx));
                    tableDisplay.dataList.get(max_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "Title":
        		for (int i = 0; i < n-1; i++)
                {
                    int max_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getTitle().compareTo(tableDisplay.dataList.get(max_idx).getTitle())<0) {
                            max_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(max_idx));
                    tableDisplay.dataList.get(max_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "Year":
        		for (int i = 0; i < n-1; i++)
                {
                    int max_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getYear().compareTo(tableDisplay.dataList.get(max_idx).getYear())<0) {
                            max_idx = j;
                        //break;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(max_idx));
                    tableDisplay.dataList.get(max_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "ISBN":
        		for (int i = 0; i < n-1; i++)
                {
                    int max_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getIsbn().compareTo(tableDisplay.dataList.get(max_idx).getIsbn())<0) {
                            max_idx = j;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(max_idx));
                    tableDisplay.dataList.get(max_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "Publisher":
        		for (int i = 0; i < n-1; i++)
                {
                    int max_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getPublisher().compareTo(tableDisplay.dataList.get(max_idx).getPublisher())<0) {
                            max_idx = j;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(max_idx));
                    tableDisplay.dataList.get(max_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        	case "LLC":
        		for (int i = 0; i < n-1; i++)
                {
                    int max_idx = i;
                    for (int j = i+1; j < n; j++) 
                        if (tableDisplay.dataList.get(j).getLlc().compareTo(tableDisplay.dataList.get(max_idx).getLlc())<0) {
                            max_idx = j;
                    	
                    }
                    temp.replace(tableDisplay.dataList.get(max_idx));
                    tableDisplay.dataList.get(max_idx).replace(tableDisplay.dataList.get(i));
                    tableDisplay.dataList.get(i).replace(temp);
                }
        		break;
        }
        for(int i=0; i<n; i++) {
        	tableDisplay.table.getItems().set(i, tableDisplay.dataList.get(i));
        }

}
}