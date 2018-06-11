package database;

public class CD {
	private String title;
	private String artist;
	private int numoftracks;
	private int playtime;
	private boolean getit=false;
	private String comment;
	
	public void print() {
		System.out.println(title+":"+artist);
	}
	
	public CD(String title, String artist, int numoftracks, 
			  int playtime, String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.numoftracks = numoftracks;
		this.playtime = playtime;
		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
