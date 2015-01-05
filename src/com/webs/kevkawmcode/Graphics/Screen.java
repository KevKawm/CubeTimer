package com.webs.kevkawmcode.Graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Screen{

	Dimension size;
	Point position;
	
	public Screen(Dimension size, Point pos){
		this.size = size;
		this.position = pos;
	}
	
	public void drawSprite(Sprite sprite, Graphics g){
		g.drawImage(sprite.image, sprite.position.x, sprite.position.y, sprite.size.width, sprite.size.height, null);
	}
	
}
