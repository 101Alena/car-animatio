package car;

import processing.core.PApplet;

//animation of lines on road
public class RoadLines extends CarSuper
{
	int x1;
	public RoadLines(PApplet _p)
	{
		this._p = _p;
		x1 = 0;
	}

	//increases x
	@Override
	public void move()
	{
		this.x1 += 10;
	}

	//knows how to draw itself
	@Override
	public void render()
	{
		lines(this.x1);
	}
	
	//creates row of many rectangles for street lines
	public void lines(int x)
	{
		_p.fill(237, 208, 43);
		for(int i = 0; i < 61; i++)
		{
			_p.rect((x + (i * 13)) % 400, (9 * _p.height) / 14 + 10, 6, 3);
		}
	}
}
