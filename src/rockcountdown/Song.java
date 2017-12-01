/**
 * CS 106 Theory & Practice II
 * CRN: 62502
 * Assignment: RockCountdown
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Hideaki Yoshida
 */

package rockcountdown;

public class Song {

	private int rank = 0;
	private String title = "";
	private String artist = "";

	// Rank getter.
	public int getRank() {
		return rank;
	}

	// Rank setter.
	public void setRank(int rank) {
		this.rank = rank;
	}

	// Title getter.
	public String getTitle() {
		return title;
	}

	// Title setter.
	public void setTitle(String title) {
		this.title = title;
	}

	// Artist getter.
	public String getArtist() {
		return artist;
	}

	// Artist setter.
	public void setArtist(String artist) {
		this.artist = artist;
	}

	// Created a constructor.
	public Song(int rank, String title, String artist) {
		// super(): Calling constructors of super class.
		super();
		this.title = title;
		this.artist = artist;
		this.rank = rank;
	}

	// One-String constructor, Split String.
	public Song(String rockSong) {
		super();
		String[] tokenArray = rockSong.split("\t");
		rank = Integer.parseInt(tokenArray[0]);
		title = tokenArray[1];
		artist = tokenArray[2];
	}
}