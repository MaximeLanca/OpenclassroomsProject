package com.hemebiotech.analytics;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapForSymptoms {
	

	public void BigMap (String Values) {

		HashMap<Integer,String> MapForSymptoms=new HashMap<Integer,String>();
		
		int Icounter = 0;
		do {
			Icounter ++;
			MapForSymptoms.put(Icounter,Values);
			} while (Values !=null);
		
		for(Entry m : MapForSymptoms.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
