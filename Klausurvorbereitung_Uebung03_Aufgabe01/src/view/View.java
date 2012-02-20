package view;

import java.awt.*; 
import java.awt.event.*;
import model.*;

public class View extends Frame{
	int W = 500;
	int H = 400;
	private Model mod;
	private ShowOrgPic sop;
	private Translation tra;
	
	public View(Model mod){
		super("Translation");
		this.mod = mod;
		setLayout(new GridLayout(2,1));
		sop = new ShowOrgPic(this, W, H);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		add(sop);
		pack();
		setBounds(50, 50, 600, 800);
		setVisible(true);
	}
}
