package view;

import model.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;

public class View extends Frame{
	Image m_Img;
	private Model mod;
	public ShowOrgPic sop;
	public ShowComPic scp;
	
	public View(Model mod){
		super("Compress Pic");
		this.mod = mod;
		sop = new ShowOrgPic(mod.getW(), mod.getH(), this);
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setLayout(new GridLayout(2, 1));
		add(sop);
		pack();
		setBounds(100, 100, 600, 600);
		setVisible(true);
	}
	
	
		
}
