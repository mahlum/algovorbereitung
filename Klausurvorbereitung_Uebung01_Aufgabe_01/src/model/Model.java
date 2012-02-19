package model;

public class Model {
	private double dx, dy;
	
	public int calcColor(int i1, int i2, int p){
		int red = singleShuffle((i1>>16) & 255, (i2>>16) & 255, p);
		int green = singleShuffle((i1>>8) & 255, (i2>>8) & 255, p);
		int blue = singleShuffle(i1 & 255, i2 & 255, p);
		return (255 <<24) | (red << 16) | (green << 8) | blue;
	}
	
	private int singleShuffle(int i1_part, int i2_part, int p){
		return i1_part + (i2_part - i1_part) * p / 100;
	}
	
	public double calcLength(int x1, int y1, int x2, int y2){
		dx = x2-x1;
		dy = y2-y1;
		return Math.sqrt((dx*dx)+(dy*dy));
	}

	public double getDx() {
		return dx;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}

	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}
	
	
}
