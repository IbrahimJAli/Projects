
public class Pet {

	int hunger;
	int hygiene;
	int happiness;
	boolean alive;

	public Pet(){
		//setting the stats of the new pet
		hunger = 3;
		hygiene = 3;
		happiness = 3;
		alive = true;
	}
	
	
	//functions to increase or decrease hunger
	public void hungerIncrease() {
		hunger += 1;
		System.out.println("Hunger increased: " + hunger);
	}
	public void hungerDecrease() {
		hunger -= 1;
		System.out.println("Hunger decreased: " + hunger);
	}
	
	
	
	//functions to increase or decrease hygiene
	public void hygieneIncrease() {
		hygiene += 1;
		System.out.println("Hygiene increased: " + hygiene);
	}
	public void hygieneDecrease() {
		hygiene -= 1;
		System.out.println("Hygiene decreased: " + hygiene);
	}
	
	
	//functions to increase or decrease happiness
	public void happinessIncrease() {
		happiness += 1;
		System.out.println("Happiness increased: " + happiness);
	}
	public void happinessDecrease() {
		happiness -= 1;
		System.out.println("Happiness decreased: " + happiness);
	}


}

