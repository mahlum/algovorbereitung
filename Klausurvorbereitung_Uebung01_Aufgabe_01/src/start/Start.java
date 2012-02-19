package start;

import controller.*;

public class Start {
	public static void main(String[] args){
		Controller c = new Controller();
		try{
			Thread.sleep(300);
		}catch(InterruptedException x){	}
		c.start();
	}
}
