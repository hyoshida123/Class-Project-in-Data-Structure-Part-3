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

import java.io.*;
import java.util.*;

import org.apache.commons.io.*;

public class Main {

	public static void main(String[] args) {
		// Getting a file name.
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		// Reading the file given the file name and store the file data.
		File file = new File(fileName);
		try {
			// (Step 2) Convert the file data to String.
			String fileData = FileUtils.readFileToString(file);
			// (Step 3) Store the list of the file data into an array.
			String[] tokenArray = fileData.split("\r\n");
			// (Step 4) Create an ArrayList of type Song.
			ArrayList<Song> songList = new ArrayList<Song>();
			// (Step 5)
			for (int i = 0; i < tokenArray.length; i++) {
				// Create a Song object.
				Song song = new Song(tokenArray[i]);
				// Insert file data into ArrayList.
				songList.add(song);
			}
			// Create a StringBuilder object.(Step 6)
			StringBuilder sb = new StringBuilder();
			// (Step 7)
			for (int i = songList.size() - 1; i >= 0; i--) {
				sb.append(songList.get(i).getRank());
				sb.append("\t");
				sb.append(songList.get(i).getTitle());
				sb.append("\r\n");
			}
			// (Step 8)
			System.out.println(sb);
			// (Step 9)
			System.out.println("Complete");
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}