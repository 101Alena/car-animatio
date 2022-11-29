package ca;

import processing.core.PApplet;

//animation of trees and multiplication
public class Trees extends CarSuper
{
	final float HWRATIO = (float) 0.3846;
	int x, h, bh, bw, by, c1, c2, c3;
	float l, r ,c;

	Trees(PApplet _p)
	{
		//PApplet
		this._p = _p;
		//random placement on screen
		this.x = Rand(-20, 400);
		//random top size
		this.h = Rand(100, 155);
		//trunk random size
		this.bh = Rand(5, 20);
		this.bw = Rand(5, 10);
		//y for top of trunk = horizon y - trunk height
		this.by = 260 - bh;
		//colors
		this.c1 = Rand(40, 60);
		this.c2 = Rand(140, 160);
		this.c3 = Rand(40, 60);
		//x values for 3 points based on randomized x
		this.l = x;
		this.r = x + (h * HWRATIO);
		this.c = x + (h * HWRATIO / 2);
	}
	@Override
	public void move()
	{
		//increases x through super class method move(float, float, int)
		this.x = super.move(x, r, 4);
	}
	//knows how to draw itself...
	@Override
	public void render() {
		_p.noStroke();
		//Set Up
		_p.fill(c1, c2, c3);
		//Shapes
		this.l = x;
		this.r = x + (h * HWRATIO);
		this.c = x + (h * HWRATIO / 2);
		_p.triangle(l, by, r, by, c, (by) - h);
		_p.rect(c - (bw / 2), by, bw, bh);
	}
}
