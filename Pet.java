import java.util.Scanner;

public class Pet {

    //Define Variables
    String Name;
    String Animal;
    int Age;

    //Constructor
    public Pet (String Name, String Animal, int Age) {
        this.Name = Name;
        this.Animal = Animal;
        this.Age = Age;
    }

    //Set Name
    public void setName(String Name) {
        this.Name = Name;
    }

    //Set Animal
    public void setAnimal (String Animal) {
        this.Animal = Animal;
    }

    //Set Age
    public void setAge(int Age) {
        this.Age = Age;
    }

    //Get Name
    public String getName() {
        return Name;
    }

    //Get Animal
    public String getAnimal () {
        return Animal;
    }  

    //Get Age
    public int getAge() {
        return Age;
    }
    
    public static void main(String [] args) {
        
        String Name, Animal;
        int Age;

        Scanner Input = new Scanner(System.in);

        //The user enters the Name, Type of Pet and Age
        System.out.println("Type the Pet's Name");
        Name = Input.nextLine();

        System.out.println("Type the Type of Pet");
        Animal = Input.nextLine();

        System.out.println("Type the Pet's Age");
        Age = Input.nextInt();

        Pet userPet = new Pet(Name, Animal, Age);

        Name = userPet.getName();
        Animal = userPet.getAnimal();
        Age = userPet.getAge();

        //Prints the Pet's Information
        System.out.println("-----Pet's Information-----");
        System.out.println("Name: " + Name);
        System.out.println("Type of Pet: " + Animal);
        System.out.println("Age: " + Age);
    }
}
