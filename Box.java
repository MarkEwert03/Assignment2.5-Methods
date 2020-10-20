//Mark Ewert
//Oct 16, 2020

import java.util.Scanner;

public class Box{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please imput a width: ");
        int width = sc.nextInt();
        System.out.print("Please imput a height: ");
        int height = sc.nextInt();
        System.out.println("");
        System.out.println("Here is your box");
        System.out.println("");
        displayBox(width, height);
    }

    public static void displayBox(int w, int h){
        for (int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}