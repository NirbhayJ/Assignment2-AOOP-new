/**
 * @author Nirbhay Jadhav
 * Date :- 05 FEB 2015
 * program build to generate the hero's powers randomly.
 *@version 2.01
 */
import java.util.ArrayList;
import java.util.Arrays;

//declaring subclass which extends hero 
public class SuperHero extends Hero 
{
	//declaring private variables
	private String superPowers[];
	
	//defining constructor
	public SuperHero(String name)
	{
		super(name);
		this.superPowers = new String[3];
		this.generateRandomPowers();
	} 
	
	//generating method show powers
	public void showPowers()
	{
		System.out.println(this.name + " powers: ");
		
		for(int i = 0; i < superPowers.length; i++)
		{
			System.out.println(superPowers[i]);
		} 
	} 
	//generating methods random powers for the show power randomly 3 powers
	private void generateRandomPowers()
	{
		ArrayList<String> power = new ArrayList<String>(0);
		
		
		power.addAll(Arrays.asList
					("Super Speed", 
					 "Super Strength", 
					 "Body Armour", 
					 "Flight", 
					 "Fire Generation", 
					 "Weather Control"));
		
		for(int i = 0; i < 3; i++)
		{
			int powerNo = (int)( power.size() * Math.random());
			
			this.superPowers[i] = power.get(powerNo);
			
			power.remove(powerNo);
		}
	}
}
