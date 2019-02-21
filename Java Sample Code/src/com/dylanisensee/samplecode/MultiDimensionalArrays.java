package com.dylanisensee.samplecode;
public class MultiDimensionalArrays {

    public static void main(String[] args) {
       
        /*
         Lets say that you are conducting a study of the average temperature
         every season for 3 years! Could you store all that data in an array?
         
         Yes, but unless you create some sort of class to record temps for a year,
         you will need to use a multi-dimensional array.
         
         In a multi-dimensional array, each element is another array!
         */
    	
    	
    	// STEP 1 - Let's start with the short-cut syntax for declaring and populate a 2-D array
    	int[][] seasonalTemps = {
    			{40, 65, 60, 30},
    			{45, 60, 55, 35},
    			{55, 90, 65, 40}
    	};
       
    	
    	// STEP 2 - You can declare the array in one statement, and then use a whole bunch of other statements to populate it
        int[][] years = new int[3][4];
        years[0][0] = 40;
        years[0][1] = 65;
        years[0][2] = 60;
        years[0][3] = 30;
        
        years[1][0] = 45;
        years[1][1] = 60;
        years[1][2] = 55;
        years[1][3] = 35;
        
        years[2][0] = 55;
        years[2][1] = 90;
        years[2][2] = 65;
        years[2][3] = 40;
          
        // STEP 3 - Using nested loops to iterate through a 2-D array
        /*
         See if you can write nested for loops to iterate through all the data
         and out it to the user like this
         YEAR 1 - 40, 65, 60, 30
         YEAR 2 - 45, 60, 55, 35
         YEAR 3 - 55, 90, 65, 40
         */
        String str = "";
        for(int x = 0; x < years.length; x++) {
        	str += "YEAR " + (x+1) + " - ";
        	for(int i = 0; i < years[x].length; i++) {
        		str += years[x][i];
        		if(i < years[x].length - 1)
        			str += ", ";
        	}
        	str += "\n";
        }
        System.out.println(str);
        
        // STEP 4
        // I've had to work with CSV data many times in my career.
        // First I would add code to read the data into my program (File I/O)
        // Here's a string that you might get from from reading a file into your program
        // TAKE A LOOK AT THE Sales-and-Expenses.csv file that was included with this item in Blackboard
        
        // It would come in as one big long line...
        String data = 	",2016,2017,2018(Forecast)\nSales,10000,12000,15000\nExpenses,7000,8000,9000";
        
        /*
        // But this is easier to make sense of...
        String data = 	",2016,2017,2018(Forecast)\n";
        data +=			"Sales,10000,12000,15000\n";
        data += 		"Expenses,7000,8000,9000";	
        */
        
        String[] rows = data.split("\n");
        for(int x = 0; x < rows.length; x++) {
        	//System.out.println(rows[x]);
        	String[] cells = rows[x].split(",");
        	for(int i = 0; i < cells.length; i++) {
        		//System.out.println(cells[i]);
        		String dataInCell = cells[i];
        		//System.out.print(dataInCell);
        		String formattedData = String.format("%20s", dataInCell);
        		System.out.print(formattedData);
        	}
        	System.out.println("\n");
        }
        
        
           
        
        // STEP 5 - Can you think of a use case for a 3-D array?
    }

}