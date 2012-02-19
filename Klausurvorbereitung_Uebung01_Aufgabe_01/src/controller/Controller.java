package controller;

import java.awt.Color;

import model.*;
import view.*;

public class Controller {
	private Model mod;
	private View view;
	
	public Controller(){
		mod = new Model();
		view = new View(mod);
	}
	
	public void start(){
		view.drawLine(view.getGraphics(), 10, 60, 254, 123, Color.red, Color.BLACK);
		view.drawLine(view.getGraphics(), 450, 90, 50, 50, Color.green, Color.BLUE);
	}
}
