package my.java.app.myBicycle;

public interface BicycleInterface {
	
	void changeCadence(int newValue);
	void changeGear(int newValue);
	void speedUp(int increment);
	void applyBrakes(int decrement);
}
