package com.webs.kevkawmcode.Graphics;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

public class Sprite {

	public Point position;
	public Dimension size;
	public Image image;
	
	public Sprite(Point p, Dimension size, Image img){
		this.position = p;
		this.size = size;
		this.image = img;
	}
	
}
