package view;

import java.awt.*;
import java.awt.image.*;

public class ShowOrgPic extends Component{
	final int W, H;
	public int[] m_ImgPix;
	Image m_Img;
	MemoryImageSource m_ImgSrc;
	
	
	public ShowOrgPic(int W, int H, Frame father){
		this.W = W;
		this.H = H;
		m_ImgPix = new int[W*H];
		try{
			FileDialog diag = new FileDialog(father);
			diag.setVisible(true);
			m_Img = getToolkit().getImage(diag.getDirectory() + diag.getFile())
					.getScaledInstance(W, H, Image.SCALE_SMOOTH);
			MediaTracker mt = new MediaTracker(this);
			mt.addImage(m_Img, 0);
			mt.waitForAll();
			PixelGrabber grab = new PixelGrabber(m_Img, 0, 0, W, H, m_ImgPix, 0, W);
			grab.grabPixels();
			m_ImgSrc = new MemoryImageSource(this.W, this.H, m_ImgPix, 0, this.W);
			m_Img = createImage(m_ImgSrc);
		}catch(InterruptedException x){}
	}
	
	@Override
	public void update(Graphics g){
		paint(g);
	}
	
	@Override
	public void paint(Graphics g){
		g.drawImage(m_Img, 0, 0, this);
	}
}
