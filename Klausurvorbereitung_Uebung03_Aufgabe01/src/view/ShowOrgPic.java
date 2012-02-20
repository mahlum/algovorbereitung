package view;

import java.awt.*;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;

public class ShowOrgPic extends Component{
	int W, H;
	Image m_Img;
	public int[] m_Pix;
	MemoryImageSource m_ImgSrc;
	
	public ShowOrgPic(Frame father, int W, int H) {
		this.W = W;
		this.H = H;
		m_Pix = new int[W*H];
		try {
			FileDialog file = new FileDialog(father);
			file.setVisible(true);
			m_Img = getToolkit().getImage(file.getDirectory() + file.getFile())
					.getScaledInstance(W, H, Image.SCALE_SMOOTH);
			MediaTracker mt = new MediaTracker(this);
			mt.addImage(m_Img, 0);
			mt.waitForAll();
			PixelGrabber grab = new PixelGrabber(m_Img, 0, 0, W, H, m_Pix, 0, W);
			grab.grabPixels();
			m_ImgSrc = new MemoryImageSource(W, H, m_Pix, 0, W);
			m_Img = createImage(m_ImgSrc);
		} catch(InterruptedException x){
			
		}
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
