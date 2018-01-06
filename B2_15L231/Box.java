
public class Box {

	private double height;
	private double weight;
	private double depth;
	Box(double height,double weigth,double depth)
	{
		this.height=height;
		this.depth=depth;
		this.weight=weigth;
	}
	public double volume()
	{
		return height*depth*weight;
		
	}
}
