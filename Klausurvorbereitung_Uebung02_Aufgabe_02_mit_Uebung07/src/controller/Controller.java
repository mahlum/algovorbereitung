package controller;

import model.*;
import view.*;

public class Controller {
	Model mod;
	View view;
	
	public Controller(){
		mod = new Model(500, 300);
		view = new View(mod);
	}
	
	public void runner(){
		mod.countColors(view.sop.m_ImgPix);
		mod.sortColors();
		mod.outputColors();
		mod.compressColors(50);
	}
}
