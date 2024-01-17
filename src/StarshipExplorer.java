import java.util.ArrayList;


import java.util.ArrayList;
public class StarshipExplorer {

    //This is the arraylist of UFOs
    public ArrayList<Alien> UFOs = new ArrayList<Alien>();

    //This is the constructor of the StarshipExplorer class
    public StarshipExplorer() {

        //This for loop adds 100 Aliens to the UFOs arraylist and
        // adds random energy levels and hostility levels to the arraylist
        for (int n=0; n<100; n++){
            UFOs.add(new Alien((int) (Math.random() * 50) + 1, (int) (Math.random() * 20) + 1));
        }

        //This calls the displayAliens method
        displayAliens();
        System.out.println("Below is the sorted list");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //This calls the bubbleSort methods and sorts by energy levels
        //bubbleSort();
        selectionSort();
        //This then calls the displayAlines methods again to make sure sorting was successful
        displayAliens();

    }
    public static void main(String[] args){
        //This is the StarshipExplorer object
        StarshipExplorer StarshipExplorer = new StarshipExplorer();

        //This is a print statement showing the class works
        System.out.println("Hello World! Good luck on your exams!");

    }

    //This methods loops through the UFOs arraylist and then uses the printInfo() method to print the information
    public void displayAliens(){
        for (int i=0; i<100; i++){
            UFOs.get(i).printInfo();
        }

    }

    //This is a bubbleSort method
    //It uses two for loops and then goes through the energy level
    //of one index then compares it to the next. It switches their values if the orginial is greater
    //Then it continues to switch until it reaches the end
    public void bubbleSort() {
        for (int w = 0; w < UFOs.size()-1; w++){
            for (int y = 0; y < UFOs.size()-1; y++){
                //This line compares the original energy level to the index above it
                //If the original is bigger, it goes to the three lines below
                if(UFOs.get(y).energyLevel> (UFOs.get(y+1).energyLevel)){

                    //These three lines of code swap the bigger number with the smaller number
                    //So the order will be correct
                    //You use the temporary variable because you would lose get(y) if you did not have it
                    //You are storing the second element in the first index, so you have the set the first element
                    //To the temporary element so you do not lose it
                    Alien temp = UFOs.get(y);
                    UFOs.set(y, UFOs.get(y+1));
                    UFOs.set(y+1,temp);
                }

            }
        }

    }

    //This method sorts the hostility levels by selectionSort
    //It sets a minimum value then goes through the rest of the values and see if any other elemt is less than the minimum
    //If it is, it sets the minimum to the new element
    //And if not it goes through and swaps the minimum with the first non-switched element
    //See visualGo for a visual
    public void selectionSort() {
        for( int v=0; v<UFOs.size()-1; v++){
            int min = v;
            for (int c=v+1; c<UFOs.size(); c++) {
                if (UFOs.get(c).hostilityLevel < UFOs.get(min).hostilityLevel) {
                    min = c;

                }
                Alien temp = UFOs.get(v);
                UFOs.set(v, UFOs.get(min));
                UFOs.set(min, temp);

            }
        }
    }

}
