package model;

import java.util.*;
import java.awt.*;

public class Model {
	private int W, H;
	Vector<ColVal> colors;
	
	public Model(int widthPic, int heigthPic){
		W = widthPic;
		H = heigthPic;
	}

	public int getW() {
		return W;
	}

	public void setW(int w) {
		W = w;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}
	
	public void countColors(int[] m_Pix){
		colors = new Vector<ColVal>();
		for(int y = 0; y < H; ++y){
			for(int x = 0; x < W; ++x){
				boolean done = false;
				for(int i = 0; i < colors.size(); ++i){
					if(m_Pix[y+y*x] == colors.get(i).colVal){
						colors.get(i).addPoint(x, y);
						done = true;
					}
				}
				if(!done){
					colors.addElement(new ColVal(new Color(m_Pix[y+y*x]), x, y));
				}
			}
		}
	}
	
	public void sortColors(){
		QuickSort.quick_sort(colors);
	}
	
	public void outputColors(){
		System.out.println("colVal\t\t\tcount");
		for(int i = 0; i < colors.size(); ++i){
			System.out.println(colors.get(i).colVal+"\t\t\t"+colors.get(i).count);
		}
	}
	
	public void compressColors(double p){
		int stayColors = (int)(colors.size() * (p/100));
		System.out.println(stayColors + " " + colors.size());
		//erstmal die Farben finden: 
		
		
	}
}
