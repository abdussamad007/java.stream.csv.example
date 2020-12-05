package com.abdus.practice.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//1. Read the CSV file.
//2. Read each line
//3.Tokenize the line.
//4.store the tokelized element in a list.
// Store the list in a map<lineNo,list>
public class CsvOperationUsingStream {
public static void main(String[] args) {
	Map<Integer, List<String>> tokenizedRecords = new HashMap<Integer, List<String>>();
	try {
		int[] count = {1};
		List<String> allRows = Files.lines(Paths.get("abc.txt"))
				//.filter(x->x.startsWith("p"))
				.collect(Collectors.toList());
		allRows.forEach(x->tokelizeRow(count[0]++,x,tokenizedRecords));
		
		System.out.println(tokenizedRecords.size());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

static void tokelizeRow(int count,String row,Map<Integer, List<String>> tokenizedRecords) {
	
	//Perf
	//tokenizedRecords.put(count,Arrays.asList((row.split(""))));
}

}
