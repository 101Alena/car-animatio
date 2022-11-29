package car;

import java.util.ArrayList;
import processing.core.PApplet;

public class CarAnimation extends PApplet
{
	RoadLines roadlines;
	
	public void setup()
	{
		roadlines = new RoadLines(this);
		noStroke();
		size(400, 400);
	}
 
	public void draw()
	{
		//background
		background(162, 223, 255);
		//moves and renders mountains
		mountainsRendMove();
		//moves and renders trees
		treesRendMove();
		//car contains all nonmoving things
		Car carThing = new Car(this);
		carThing.render();
		//moves and renders road lines
		roadlines.render();
		roadlines.move();
	}
	
	//array list containing tree objects and mountain objects
	ArrayList<Trees> trees = new ArrayList<Trees>();
	ArrayList<Mountains> mountains = new ArrayList<Mountains>();
	//pressed key = a new tree or mountain
	public void keyPressed() 
	{
		if (key == 't') 
		{
			trees.add(new Trees(this));
		}
		else if(key == 'm')
		{
			mountains.add(new Mountains(this));
		}
	}
	
	//methods that render and move trees/mountains
	public void treesRendMove()
	{
		for(int i = 0; i < trees.size(); i++)
		{
			(trees.get(i)).render();
			(trees.get(i)).move();
		}
	}
	public void mountainsRendMove()
	{
		for(int i = 0; i < mountains.size(); i++)
		{
			(mountains.get(i)).render();
			(mountains.get(i)).move();
		}
	}
	public static void main(String args[])
	{
		PApplet.main(new String[] { carr.CarAnimation.class.getName() });
	}
}
