package car;

import java.util.ArrayList;

import processing.core.PApplet;

public class ArrList extends CarSuper
{
	//Array Lists
	ArrayList<Trees> trees = new ArrayList<Trees>();
	ArrayList<Mountains> mountains = new ArrayList<Mountains>();
	ArrayList<PApplet> idek = new ArrayList<PApplet>();
	public void keyPressed() 
	{
		if (key == 't') 
		{
			Trees tree = new Trees(_p);
			trees.add(tree);
			tree.render();
		}
		else if(key == 'm')
		{
			Mountains mountain = new Mountains(_p);
			mountains.add(mountain);
			mountain.render();
		}
	}
	
	public void treesRendMove()
	{
		for(int i = 0; i < trees.size(); i++)
		{
			(trees.get(i)).render();
			(trees.get(i)).move();
		}
	}
}
