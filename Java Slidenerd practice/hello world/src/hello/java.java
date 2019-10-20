package hello;
import java.io.*;
import java.awt.Graphics;

class hello extends java.applet.Applet{
	private static final String Hello = null;

	public void paint( Graphics g){
		g.drawString(Hello, 5, 24);
	}
}

