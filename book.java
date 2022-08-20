import java.util.*;
import java.util.Scanner;

public class book {
    String title;
    String author;
    double price;

    public book(String title, String author, double price){

        this.title=title;
        this.author=author;
        this.price=price;

    }

    public void settitle(String title){

        this.title=title;

    }

    public void setauthor(String author){

        this.author=author;

    }

    public void setprice(double price){

        this.price=price;

    }

    public String gettitle(){

        return title;

    }


    public String getauthor(){

        return author;

    }

    public double getprice(){

        return price;

    }

    public String toString (){

        return "EL libro se llama "+title+" del autor "+author+" con el precio de $ : "+price;

    }

    public static void main (String []args){

        String title, author;
        double price;
        Scanner tec=new Scanner(System.in);
        System.out.println("Escribir el titulo del libro: ");
        title=tec.nextLine();
        System.out.println("Escribir el autor del libro: ");
        author=tec.nextLine();
        System.out.println("Digite el precio del libro: ");
        price=tec.nextDouble();
        book nuevolibro=new book(title, author, price);
        title=nuevolibro.gettitle();
        author=nuevolibro.getauthor();
        price=nuevolibro.getprice();
        System.out.println(nuevolibro);

    }
}

class demobook{

    public static void main(String []args){

        String title, author;
        double price;
        title="Developing Java Software";
        author="Russel Winderand";
        price=79.75;
        book demobook=new book(title,author,price);
        System.out.println(demobook);
    }

}
