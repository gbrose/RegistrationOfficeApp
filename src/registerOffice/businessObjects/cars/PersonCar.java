package registerOffice.businessObjects.cars;

public class PersonCar extends Car{

	//pole statyczne
	
	//pola prywatne
	
	//pola publiczne
	
	//konstruktory
	public PersonCar(String mark, String registerNumber)
	{
		this.mark=mark;
		this.registerNumber=registerNumber;
	}
	
	public PersonCar()
	{
		this("","");
	}
	
	//wlasciwosci
	
	//metody
	

	@Override
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return mark+" "+registerNumber;
	}

	@Override
	public Car Clone() {
		
		PersonCar returnValue =new PersonCar();
		returnValue.setRegisterNumber(this.registerNumber);
		
		return returnValue;
	}
}
