package com.hemebiotech.analytics;

import java.util.*;



public class treemapForSymptoms {
	
	public TreeMap<String,Integer> BigMap (ArrayList<String> Symptoms) {
		
		 TreeMap<String,Integer> mapForSymptoms=new TreeMap<String,Integer>();
		 
		 for (String FirstStringSymptoms : Symptoms) {
			 
			 if (mapForSymptoms.get(FirstStringSymptoms)!= null) {
				 
				 Integer value=mapForSymptoms.get(FirstStringSymptoms);
				 value++;
				 mapForSymptoms.put(FirstStringSymptoms,value);
				
		 	} 
			 else { mapForSymptoms.put(FirstStringSymptoms,1);	
			 
			 	}	
			 
		 	} return mapForSymptoms;
}
}