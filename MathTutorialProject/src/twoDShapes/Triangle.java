package twoDShapes;
public class Triangle extends Closed2DShapes{
private int side1;
private int side2;
private int side3;	
public void surfaceArea()
	{
	double area=0;
	double s= (side1+side2+side3)/2;
	area= s*(s-side1)*(s-side2)*(s-side3);
	System.out.println("Surface Area is: "+ area);	
	}	
public void perimeter()
	{
	double peri=0;
	peri = side1+side2+side3;
	System.out.println("Perimeter is: "+ peri);		
	}
}

