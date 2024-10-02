package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(0.3, 0.7, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(0.5, 0.7, 0.1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(0.7, 0.7, 0.1);
		
		Color lime = new Color(163, 217, 128);
		
		StdDraw.setPenColor(lime);
		StdDraw.filledSquare(0.3, 0.5, 0.1);
		
		StdDraw.setPenColor(lime);
		StdDraw.filledSquare(0.5, 0.5, 0.1);
		
		StdDraw.setPenColor(lime);
		StdDraw.filledSquare(0.7, 0.5, 0.1);
		
		Color darkgreen = new Color(1, 150, 39);

		StdDraw.setPenColor(darkgreen);
		StdDraw.filledSquare(0.3, 0.3, 0.1);
		
		StdDraw.setPenColor(darkgreen);
		StdDraw.filledSquare(0.5, 0.3, 0.1);
		
		StdDraw.setPenColor(darkgreen);
		StdDraw.filledSquare(0.7, 0.3, 0.1);
	}
}
