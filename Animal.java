public class Animal{
	public String name;
	public int numLegs;

	public Animal(String aName, int aLegs){
		this.name = aName;
		this.numLegs = aLegs;
	}
	
	public int getLegs(){
		return numLegs;
	}	
}
