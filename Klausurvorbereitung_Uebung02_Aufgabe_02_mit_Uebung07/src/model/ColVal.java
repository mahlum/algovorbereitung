package model;

import java.awt.*;
import java.util.*;

public class ColVal {
	Color col;
	int colVal;
	int count;
	private LinkedList<Point> points = new LinkedList<Point>();
	
	public ColVal(Color col, int x, int y){
		this.col = col;
		colVal = col.getRGB();
		count = 0;
		points.add(new Point(x, y)); 
	}
	
	public void addPoint(int x, int y){
		points.add(new Point(x, y));
		++count;
	}
	
	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}

	public LinkedList<Point> getPoints() {
		return points;
	}
}
