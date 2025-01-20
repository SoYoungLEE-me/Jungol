package q105;

import java.text.NumberFormat;

class City{
	private String name;
	private int population;
	private int increase;
	
	public City(String name, int population, int increase) {
		this.name = name;
		this.population = population;
		this.increase = increase;
	}
	
	NumberFormat nf = NumberFormat.getInstance();
	
	public String getName() {
		return name;
	}
	
	public String getPopulation() {
		return nf.format(population);
	}
	public String getIncrease() {
		return "+" + nf.format(increase);
	}
}

public class Main {

	public static void main(String[] args) {
		City[] city = {
				new City("Seoul", 10312545, 91375),
				new City("Pusan", 3567910, 5868),
				new City("Incheon", 2758296, 64888),
				new City("Daegu", 2511676, 17230),
				new City("Gwangju", 1454636, 29774)
		};
		
		for(int i=0; i<city.length; i++) {
			System.out.printf("%15s%15s%15s\n", city[i].getName(), city[i].getPopulation(), city[i].getIncrease());
		}
	}

}
