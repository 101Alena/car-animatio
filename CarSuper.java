package car;

import java.util.Random;
import processing.core.PApplet;

//Animation Super class
public class CarSuper extends PApplet
{
	//PApplet object
	public PApplet _p = new PApplet();
	
	//render and move methods to be overwritten
	public void render()
	{
	}
	public void move()
	{
	}
	
	//randomizers
	public int Rand(int s, int b)
	{
		Random rng = new Random();
		int diff = b - s;
		int n = rng.nextInt(diff) + s;
		return n;
	}
	public int Rand(int width)
	{
		Random rng = new Random();
		int x = rng.nextInt(width);
		return x;
	}
	
	//move method. if left side goes off screen, returns back
	public int move(float l, float r, int v)
	{
		if(l > 400)
		{
			l = 0 - r;
			return (int) l;
		} 
		return (int) l + v;
	}
		
}
