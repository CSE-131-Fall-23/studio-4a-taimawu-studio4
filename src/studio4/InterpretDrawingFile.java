package studio4;

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
		
		String type = in.nextLine();
		
		if (type == "rectangle") {
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			
			if (isFilled) {
				StdDraw.setPenRadius(0.05);
				StdDraw.point(0.5, 0.5);
				
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		        StdDraw.rectangle(x, y, halfWidth, halfHeight);
		        StdDraw.show();
			}
			
			else {
				StdDraw.setPenRadius(0.05);
				StdDraw.point(0.5, 0.5);
				
				StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		        StdDraw.rectangle(x, y, halfWidth, halfHeight);
		        StdDraw.show();
			}
		
	        
		}
		//if (type == "ellipse") {
			
			
			//double x = in.nextDouble();
			//double y = in.nextDouble();
			//double semiMajorAxis = in.nextDouble();
			//double semiMinorAxis = in.nextDouble();
			
			//StdDraw.setPenRadius(0.05);
	        //StdDraw.setPenColor(StdDraw.BLUE);
	        //StdDraw.point(0.5, 0.5);
	        //StdDraw.setPenColor(StdDraw.MAGENTA);
	        //StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
		//}
		//if (type == "triangle") {
			//double x1 = in.nextDouble();
			//double y1 = in.nextDouble();
			//double x2 = in.nextDouble();
			//double y2 = in.nextDouble();
			//double x3 = in.nextDouble();
			//double y3 = in.nextDouble();
			//StdDraw.setPenRadius(0.05);
	        //StdDraw.setPenColor(StdDraw.BLUE);
	        //StdDraw.point(0.5, 0.5);
	        //StdDraw.setPenColor(StdDraw.MAGENTA);
	  //      StdDraw.triangle(x1, y1, x2, y2, x3, y3);
		//}
		
	}
}
