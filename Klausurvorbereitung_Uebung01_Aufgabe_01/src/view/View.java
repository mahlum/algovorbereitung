package view;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import model.*;

public class View extends Frame{
	private Model mod;
	
	public View(Model mod){
		this.mod = mod;
		setBounds(50, 50, 400, 400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			
		});		
	}
	
	public void drawLine(Graphics g, int x1, int y1, int x2, int y2, Color cStart, Color cEnd){
		double dpoints = mod.calcLength(x1, y1, x2, y2);
		double actPosX = x1, actPosY = y1;
		for(int i = 0; i < dpoints; ++i){
			final int P = 100*i/(int)dpoints;
			final int COL = mod.calcColor(cStart.getRGB(), cEnd.getRGB(), P);
			Color test = new Color(COL);
			g.setColor(test);
			g.drawLine((int)actPosX, (int)actPosY, (int)(actPosX), (int)(actPosY));
			actPosX = actPosX + mod.getDx()/dpoints;
			actPosY = actPosY + mod.getDy()/dpoints;
		}
	}
	
}
