package car;

import processing.core.PApplet;

//non moving objects
public class Car extends CarSuper
{
	int x = 125, y = 210, s = 150;
	Car(PApplet _p)
	{
		this._p = _p;
	}
	
	@Override
	public void render()
	{
		//grass
		_p.fill(82, 162, 79);
		_p.rect(0, (3 * _p.height) / 4, _p.width, _p.height / 4);
		
		//road
		_p.fill(129, 125, 117);
		_p.rect(0, (9 * _p.height) / 14, _p.width, _p.height / 8);
		
		//car base
		_p.fill(160, 32, 2);
		_p.rect(x, y + 10, s, s / 5);
		//cartop
		_p.triangle(x + 40, y + 10, x + 70, y + 10, x + 70, s + 40);
		//cartop
		_p.rect(x + 70,  s + 40, 80, 40);
		
		//wheels
		//x, y, width, height
		_p.fill(59, 45, 47);
		_p.ellipse(160, y + 40, 25, 25);
		_p.ellipse(230, y + 40, 25, 25);
	}
}
