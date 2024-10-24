package week1.Day2;

public class Car {
	public void brake()
	{
		System.out.println("brake has been applied");
	}
    public void soundHorn() {
    	System.out.println("sound horn has been applied");
    }
	public static void main(String[] args)
	{
	Car obj=new Car();
	obj.brake();
	obj.soundHorn();
	}

}
