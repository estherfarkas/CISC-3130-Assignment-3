import java.util.*;
import java.io.*;

public class MovieSearch {

	public static void main(String[] args) throws IOException {

		File infile= new File("/Users/estherfarkas/Desktop/movies.csv");
		Scanner input= new Scanner(infile);
		
		MovieTree tree= new MovieTree();
		
		while (input.hasNext()) {
			
			String line= input.nextLine();
			String [] tokens=line.split(",");
			
			String title= tokens[1];
			
			int index=0;
			for(int i=0; i<title.length(); i++) {
				if (title.charAt(i)=='('){
					index=i;
				}
			}
			String name= title.substring(0, index);
			String year= title.substring(index+1, title.length()-1);
			
			
			MovieNode newNode= new MovieNode(name,title);
			
			tree.insertNode(newNode);}
		
			input.close();
			
			tree.subSet("Casino", "Dear Frankie");
			tree.subSet("Now and Then", "Othello");
			tree.subSet("Wild Bill","Unforgettable");
			
		
		
	}

}
