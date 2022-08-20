mport java.util.Scanner; //Biblioteca para que se puedan usar Scanners

//Clase
public class Car {
    String Year;
    String Brand;
    double MaxSpeed;

    //Constructor - Inicializar la variable, Construye los objetos
    public Car (String Year, String Brand, double MaxSpeed) {
        this.Year = Year;
        this.Brand = Brand;
        this.MaxSpeed = MaxSpeed;
    }

    //Set Year - Metodo
    public void setYear(String Year) {
        this.Year = Year;
    }

    //Set Brand
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    //Set MaxSpeed
    public void setMaxSpeed(double MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    //Get Year - Retorna el año
    public String getYear() {
        return Year;
    }

    //Get Brand
    public String getBrand() {
        return Brand;
    }

    //Get MaxSpeed
    public double getMaxSpeed() {
        return MaxSpeed;
    }

    public static void main(String [] args) {

        //Define Variables
        String Year, Brand;
        double MaxSpeed;

        Scanner Input = new Scanner(System.in); //Define una variale llamada "Input" de tipo Scanner

        //The user enters the data (Year, Brand and MaxSpeed)
        System.out.println("Type the Car's Year");
        Year = Input.nextLine(); //Se guardan datos en la variable "Year". Lo que se ingreso en el Input,
        //Se guardara una cadena de texto

        System.out.println("Type the Car's Brand"); //Imprime un mensaje en la consola
        Brand = Input.nextLine();

        System.out.println("Type the Car's Max Speed");
        MaxSpeed = Input.nextDouble();

        Car userCar = new Car(Year, Brand, MaxSpeed);

        Year = userCar.getYear(); //Se guarda el resultado del metodo getYear en la variable Year
        Brand = userCar.getBrand();
        MaxSpeed = userCar.getMaxSpeed();

        System.out.println("-----Car's Information-----");
        System.out.println("Year: " + Year); //Une dos cadenas de texto
        System.out.println("Brand: " + Brand);
        System.out.println("Max Speed: " + MaxSpeed + " KM/H");
    }
}
