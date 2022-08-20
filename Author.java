import java.util.Scanner;
public class Author {
    String FirstName;
    String LastName;

    public Author (String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void setFirstName (String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName (String LastName) {
        this.LastName = LastName;
    }
    public  String getFirstName(){
        return FirstName;
    }
    public  String getLastName() {
        return LastName;

    }
    public static void main(String [] args) {
        String FirstName, LastName;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter he first name of the author   ");
        FirstName = Input.nextLine();
        System.out.println("Enter the author's last name   ");
        LastName = Input.nextLine();

        Author userAuthor = new Author(FirstName, LastName);
        FirstName = userAuthor.getFirstName();
        LastName = userAuthor.getLastName();

        System.out.println("-----Author information-----");
        System.out.println("First name  " + FirstName);
        System.out.println("Last name   " + LastName);

    }

}
