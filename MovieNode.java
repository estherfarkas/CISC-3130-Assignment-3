
public class MovieNode {
	public String title;
	public String releaseYear;
	public MovieNode left;
	public MovieNode right;
	
	
	public MovieNode() {
		title= null;
		releaseYear= null;
	}
	
	public MovieNode(String a, String b) {
		title=a;
		releaseYear=b;
		left=null;
		right=null;
	}
	
	
	

}
