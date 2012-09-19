package my.java.app.AreaOfShapes;

public class Area {
	
	public static void main (String[] args)
	{
		CalculateArea area = new CalculateArea();
		area.setAreaRectangle(20, 60);
		System.out.println("Area of rectangle is : " + area.areaOfShape);
	}
}
