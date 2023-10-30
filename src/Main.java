import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //let's create a Scanner
       Scanner myScanner = new Scanner(System.in);
       // let's ask the customer for their name
        System.out.println("Please tell me your name:");
        //Let's read teh customer's input
        String name = myScanner.nextLine();

//finally, let's greet this customer with their name!
        System.out.println("Hello " + name);
        System.out.println("What city do you live in");
        String city = myScanner.nextLine();
        if(city.equals("Allen")){
            System.out.println("Wow! that's where I am from too!");
        } else if(city.equals( "allen")) {
            System.out.println("Wow! that's where I am from too!");
        } else {
            System.out.println("Nice City!");
    }
        System.out.println("Feel Free to Give Me A Random Fact!");
        String RandomFact = myScanner.nextLine();
        System.out.println(RandomFact);
        System.out.println("What is your favorite number?");
        int FavNum = Integer.parseInt(myScanner.nextLine());
        if(FavNum == 3) {
            System.out.println("Awesome! That's my favorite number too!");
        } else {
            System.out.println("Cool!");
        }
        for(int i = 1; i < 101; i++) {
            if(FavNum % i == 0) {
                System.out.println("Your number is divisible by: ");
                System.out.println(i);
            }
        }

       double apples = 0.05;
        double bananas = 0.10;
        double mangoes = 0.15;
        double PackOfBlueberries = 4.56;
        double tomatoes = 0.40;
        double oranges = 1;
        double PackOfStrawberries = 5.24;
        System.out.println("your total is: ");
        System.out.println((apples + bananas + mangoes + PackOfBlueberries + tomatoes + oranges + PackOfStrawberries)* 1.0825);



    }}
