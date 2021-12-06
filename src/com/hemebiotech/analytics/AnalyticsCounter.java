package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class analyticsCounter {
	
	public void counter(TreeMap<String, Integer> lineForNextClasstwo) throws IOException {

				
/*
 * Create new file result.out
 */
		File file= new File("C:\\Users\\maxim\\eclipse-workspace\\results.out.txt");
		
			
		
		
/*
 * Write symptoms in the file
 */	
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
				for (Map.Entry<String, Integer> entry : lineForNextClasstwo.entrySet()) {
				    
				    writer.write("Symptoms:"+entry.getKey()+"."+" Occurences:"+entry.getValue()+".");
				}
				
				writer.close();
			}
			
			
}
