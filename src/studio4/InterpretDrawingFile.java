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
//		JFileChooser chooser = new JFileChooser("resources");
//		chooser.showOpenDialog(null);
//		File f = new File(chooser.getSelectedFile().getPath());
//		Scanner in = new Scanner(f); //making Scanner with a File
//		String shape = in.next();
//		int red = in.nextInt();
//		int green = in.nextInt();
//		int blue = in.nextInt();
//		boolean filled = in.nextBoolean();
//		double parameterOne = in.nextDouble();
//		double parameterTwo = in.nextDouble();
//		double parameterThree = in.nextDouble();
//		double parameterFour = in.nextDouble();
//		if (shape.equals("rectangle")&&filled==false) {
//			StdDraw.setPenColor(red, green, blue);
//			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
//		}
//		else if (shape.equals("rectangle")&&filled==true) {
//			StdDraw.setPenColor(red, green, blue);
//			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
//		}
//		else if (shape.equals("ellipse")&&filled==false) {
//			StdDraw.setPenColor(red, green, blue);
//			StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
//		}
//		else if (shape.equals("ellipse")&&filled==true) {
//			StdDraw.setPenColor(red, green, blue);
//			StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
//			
//		}
		
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(.5, .5, .5, .25);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledEllipse(.5,.5,0.225,0.225);
		StdDraw.setPenColor(Color.GREEN);
		double xCord[] = {.35, .5, .65};
		double yCord[] = {.4, .65, .4};
		StdDraw.filledPolygon(xCord, yCord);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.5, 0.5, 0.07, 0.03);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledEllipse(0.5, 0.5, 0.025, 0.025);
		
		
	}
}
