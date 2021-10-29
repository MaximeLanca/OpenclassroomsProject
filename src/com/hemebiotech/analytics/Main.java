package com.hemebiotech.analytics;


public class Main {

	public static void main(String[] args) {
		
		/**
		 * String LineSymptoms is a variable for save "symptoms.txt"'s line
		 */
		String FileSymptoms = "C:\\Users\\maxim\\eclipse-workspace\\symptoms.txt";
		String LineSymptoms = null;
		
		try {
			
		/*
		 * 	Class for to read file symptoms.txt
		 */
		ReadSymptomDataFromFile Read = new ReadSymptomDataFromFile();
		Read.PrintSymptoms(FileSymptoms , LineSymptoms);
		
		
		/*
		 * Use Map for explode line to exploit lines
		 */
		String LineForNextClassOne = LineSymptoms;
		
		HashmapForSymptoms MapSymptoms = new HashmapForSymptoms();
		MapSymptoms.BigMap(LineForNextClassOne);
		
		String LineForNextClasstwo = LineForNextClassOne;
		
		/*
		 * it's a class to exploit information from map
		 */
		AnalyticsCounter analyticsCounters = new AnalyticsCounter();
		analyticsCounters.Counter(LineForNextClasstwo);
		
		System.out.println("LineSymptoms");
		
	
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: "
                    +  e.getMessage());
                          
                          
			} finally {
					System.out.println("Stop PrintWriter");
	}
		
	
}
}