package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(0.05);
		StdDraw.point(0.5, 0.5);
		
		StdDraw.setPenColor(255, 255, 255);
        StdDraw.filledRectangle(3,3,3,4);
        
        StdDraw.point(7, 7);
        
        StdDraw.setPenColor(233, 0, 0);
        StdDraw.filledCircle(0.5,.5,0.3);
        StdDraw.show();
		
	}
}