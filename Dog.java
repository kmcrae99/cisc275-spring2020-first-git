public class Dog extends Animal{
//	public String name;
//	public int numLegs;

	public Dog(String aName, int aLegs){
		super(aName,aLegs);
		this.name = aName;
		this.numLegs = aLegs;
	}
	
	public String toString(){
		return name + ", " + numLegs;
	}
}
