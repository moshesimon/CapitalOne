import java.util.*;

public class SushiTest {

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
        SushiTest sm = new SushiTest();
        Scanner input = new Scanner(System.in);
        Order order = new Order();

        int option = sm.options(input);
        if(option == 1){
            BuildSushi buildSpicSushi = new BuildSpicyTuna();
            order.setSushiBuilder(buildSpicSushi);
        }
        else if(option == 2){
            BuildSushi buildCalSushi = new BuildCaliforniaRoll();
            order.setSushiBuilder(buildCalSushi);
        }
        else if(option == 3){
            BuildSushi buildPhilSushi = new BuildPhiladelphiaRoll();
            order.setSushiBuilder(buildPhilSushi);
        }

        order.constructSushi();

        Sushi sushi = order.getSushi();
        sm.printSushi(sushi);
    }
}
