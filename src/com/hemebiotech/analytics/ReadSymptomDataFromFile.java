package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile  {


	public void PrintSymptoms(String File, String Line) {
		
			try {
				BufferedReader reader = new BufferedReader (new FileReader(File));
				
				while (reader.readLine() != null) {
					Line = reader.readLine();
					System.out.println(Line);
				}
				
			} catch (IOException e) {
				System.out.println("An error occured.");
				e.printStackTrace();
			}
			
		}
	}