

package ca;

import processing.core.PApplet;

//animation of trees and multiplication
public class Mountains extends CarSuper
{
	final float HWRATIO = (float) 0.3846;
	//random placement and color
	int x, h, c1, c2, c3;
	float l, r ,c;
	int mntRightX = width, mntLeftX = 0, mntTopX = width / 2;
	//random place and height
	
	Mountains(PApplet _p)
	{
		this._p = _p;
		this.x = Rand(-200, 200);
		this.h = Rand(280, 500);
		//colors
		this.c1 = Rand(87, 107);
		this.c2 = Rand(142, 162);
		this.c3 = Rand(138, 158);
		//x values for 3 points based on randomized x
		this.l = x;
		this.r = l + _p.width;
		this.c = (r + l) / 2;
	}

	public void move()
	{
		this.x = super.move(l, r, 2);	
	}
	// the circle also knows how to draw itself...
	@Override
	public void render() {
		_p.noStroke();
		//Set Up
		this.l = x;
		this.r = l + _p.width;
		this.c = (r + l) / 2;
		_p.fill(c1, c2, c3);
		//Shapes
		_p.triangle(l, h, r, h, c, _p.height - h);//mountain
		move();
	}
}
