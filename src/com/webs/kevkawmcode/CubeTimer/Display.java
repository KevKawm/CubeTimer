package com.webs.kevkawmcode.CubeTimer;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.webs.kevkawmcode.Graphics.Screen;
import com.webs.kevkawmcode.Graphics.Sprite;

public class Display extends JPanel implements Runnable{

	Screen timer;
	Sprite time;
	
	BufferedImage timeImg;
	Graphics timeG;
	
	Frame frame;

	long startTime;
	
	public Display(Frame frame) {
		startTime = System.currentTimeMillis();
		this.frame = frame;
		
		timer = new Screen(new Dimension(800,600),new Point(0,0));
		time = new Sprite(new Point(0,0),new Dimension(200,100),new BufferedImage(200,100,BufferedImage.TRANSLUCENT));
		timeImg = new BufferedImage(200,100,BufferedImage.TRANSLUCENT);
		timeG = timeImg.getGraphics();
		timeG.setFont(new Font("TimesRoman", Font.PLAIN, 100));
		
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		repaint();
		timeG.clearRect(0, 0, 200, 100);
		timeG.drawString(System.currentTimeMillis() + "", 0, 0);
		time.image = timeImg;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		timer.drawSprite(time, g);
	}

}
