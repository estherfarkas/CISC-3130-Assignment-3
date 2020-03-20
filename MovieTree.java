
public class MovieTree {
	public MovieNode first;



	public MovieTree() {
	first=null;}

	public void insertNode (MovieNode movie) {
		
		String name=movie.title;
		
		if(first==null) {
			first=movie;}
		
		else { 
			MovieNode current=first;
			
			while(current.left!=null&&current.right!=null) {
				
				if (current.title.compareToIgnoreCase(name)<=0){
					current=current.right;}
				else {current=current.left;}
				}
			
				if (current.title.compareToIgnoreCase(name)<=0){
					current.right=movie;}
		
				else {current.left=movie;}
		}
	}
	
	public void subSet (String start, String end) {
		
		MovieNode current=first;
		while(current.left!=null&&current.right!=null) {
		
		if (current.title.contentEquals(start)) {
			System.out.println(start);
			while(!current.title.equals(end)) {
				traverseTree(current, end);}}
		
		else {	if (current.title.compareToIgnoreCase(start)<=0){
				current=current.right;}
				else {current=current.left;}
			}	
		}
	}

	
	public void traverseTree(MovieNode movie, String end) {
		
		if (movie.left==null&&movie.right==null) {
			System.out.println(movie.title);}
		if (movie.title.contentEquals(end)) {
			System.out.println(end);}
		
		else if (movie.left==null) {
				traverseTree(movie.right, end);}
		else {movie=movie.left;}
			}
		
		
		}
	
	

	

			
			
			



