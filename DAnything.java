//Mark Ewert
//Oct 13, 2020

import java.util.Scanner;

public class DAnything{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean continuing = true;
        while (continuing) {
            int total = 0;

            System.out.print("How many dice do you want to roll? ");
            int rolls = sc.nextInt();
            System.out.print("How many sides do these dice have? ");
            int sides = sc.nextInt();
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < rolls; i++){
                int currentRoll = rollDice(sides);
                System.out.print(currentRoll + " ");
                total += currentRoll;
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            System.out.print("Again? [y, n] ");
            String response = sc.next();
            if ("y".equals(response)) System.out.println("");
            else if ("n".equals(response)){
                System.out.println("Goodbye!");
                continuing = false;
            } else {
                System.out.println("That is not a valid response. Terminating game now");
                continuing = false;
            }
        }
    }
    public static int rollDice(int s){
        return (int)(Math.random()*s)+1;
    }
}