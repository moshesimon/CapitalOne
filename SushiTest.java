import java.util.*;

public class SushiTest {// Test Class

    public void printMenu(){
        System.out.println("Which Sushi would you like?");
        System.out.println("1) Spicy Tuna");
        System.out.println("2) California Roll");
        System.out.println("3) Philadelphia Roll");
    }

    public int options(Scanner input){
        int option;
        while(true){
            printMenu();
            try{
                option = input.nextInt();
                if(Arrays.asList(1,2,3).contains(option)){
                    break;
                }
                else{
                    System.out.println("Please make sure the option you entered is listed:");
                }
            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("\nExeptions: %s\n", inputMismatchException);
                System.out.println("Please only enter an integer");
                input.nextLine();
            }
        }
        return option;
    }

    public void printSushi(Sushi sushi){
        System.out.println(sushi.getName() + ":");
        System.out.println("Fish: " + sushi.getFishString());
        System.out.println("Veg: " + sushi.getVegString());
        System.out.println("Sauce: " + sushi.getSauceString());
    }

    public static void main(String[] args){
        SushiTest sushiTest = new SushiTest();// SushiTest Object
        Scanner input = new Scanner(System.in);
        Order order = new Order();// Order Object

        int option = sushiTest.options(input);
        if(option == 1){
            BuildSushi buildSpicySushi = new BuildSpicyTuna();// Polymorphism
            order.setSushiBuilder(buildSpicySushi);
        }
        else if(option == 2){
            BuildSushi buildCalSushi = new BuildCaliforniaRoll();// Polymorphism
            order.setSushiBuilder(buildCalSushi);
        }
        else if(option == 3){
            BuildSushi buildPhilSushi = new BuildPhiladelphiaRoll();// Polymorphism
            order.setSushiBuilder(buildPhilSushi);
        }

        order.constructSushi();
        Sushi sushi = order.getSushi();
        sushiTest.printSushi(sushi);
    }
}
