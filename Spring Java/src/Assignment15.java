import java.io.*;
import java.util.*;
public class Assignment15 {
	public static void main(String[] args) {
		BufferedReader is = null;
		String inString = null;
		StringTokenizer token; // for reading in a line of text
		int i = 0;
		ArrayList distances = new ArrayList();
		try {
		      is = new BufferedReader(new InputStreamReader (new FileInputStream("Input2.txt")));
		    }
		    catch(IOException e) {
		      System.out.print("Error : " + e);
		      System.exit(1);
		    }
		   while (true) {
		    try {
		        inString = is.readLine();
		      }
		      catch(IOException e) {
		        System.out.print("Error : " + e);
		        System.exit(1);
		      }  
		      if(inString==null) break;
		      if(inString.length()==0) break;
		      token = new StringTokenizer(inString," \t\n\r");
		      try {
		        i = Integer.parseInt(token.nextToken());
		      }
		      catch(NumberFormatException e) {
		        System.out.print("Error : " + e);
		        System.exit(1);
		      }
		        distances.add(inString);
            //System.out.println(i);
		   }
		  // System.out.println();
		   for(int m = 0; m < distances.size();m++) {
		    	  System.out.println(distances.get(m));
		      }
		   for(int j = 0; j < distances.size();j++) {
		    	  distances.remove(j);
		      }
		      System.out.println();
		   	for (int k = 0; k < distances.size(); k++) {
		   		System.out.println(distances.get(k));
		   	}
	}

}
