public class Alien {

    //These two integers are public integers
    public int energyLevel;
    public int hostilityLevel;

    //This is a constructor that uses the parameters above
    public Alien(int PenergyLevel,int PhostilityLevel){
        energyLevel = PenergyLevel;
        hostilityLevel = PhostilityLevel;

    }

    //This is a method that prints out the parameters in a readable way
    public void printInfo(){
        System.out.println("The energy level is " + energyLevel + " and the hostility level is " + hostilityLevel);
    }


}
