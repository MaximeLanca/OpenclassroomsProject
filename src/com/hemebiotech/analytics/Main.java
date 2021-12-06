package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/**
		 * String LineSymptoms is a variable for save "symptoms.txt"'s line
		 */
		String fileSymptoms = "C:\\Users\\maxim\\eclipse-workspace\\symptoms.txt";
		ArrayList <String> lineSymptoms;
		lineSymptoms = new ArrayList <String>();
		TreeMap<String, Integer> mapSymptomsForCounter=new TreeMap<>();
	

		try {
		/*
		 * STEP_01
		 * 	Class for to read file symptoms.txt
		 */
		readSymptomDataFromFile Read = new readSymptomDataFromFile();
		Read.printSymptoms(fileSymptoms , lineSymptoms);
		
		/*
		 * STEP_02
		 * Use Map for explode line to exploit lines
		 */
		ArrayList<String> lineForNextClassOne = lineSymptoms;
		treemapForSymptoms mapSymptoms = new treemapForSymptoms();
		mapSymptomsForCounter=mapSymptoms.BigMap(lineForNextClassOne);
		
		/*for (Map.Entry<String,Integer> m:mapSymptomsForCounter.entrySet()) {
		 *System.out.println(m.getKey()+" "+m.getValue());
		 */
		
	

		/*
		 * STEP_03
		 * it's a class to exploit information from map
		*/
		TreeMap<String,Integer> lineForNextClasstwo = mapSymptomsForCounter;
		analyticsCounter analyticsCounters = new analyticsCounter();
		analyticsCounters.counter(lineForNextClasstwo);

		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: "
                    +  e.getMessage());
             } 
		
		finally {
					System.out.println("Stop PrintWriter");
	}
		
	
}
}