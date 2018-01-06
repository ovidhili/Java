
public class Patient {
	String pname;
	double weight;
	double height;
	 Patient(String pname, double weight, double height) {
		super();
		this.pname = pname;
		this.weight = weight;
		this.height = height;
	}
	public double BMI()
	{
		
		double bmi=(weight/(height*height))*703;
		return bmi;
	}		

}
