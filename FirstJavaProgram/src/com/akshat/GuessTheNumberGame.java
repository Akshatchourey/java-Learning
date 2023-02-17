package com.akshat;
import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner sc = new Scanner(System.in);
    Random re = new Random();

    int c_g_no1; int h_g_no1; int ans;

    public Game(){
        c_g_no1 = re.nextInt(100);
    }

    public void userInput(){
        System.out.print("no please:-- ");
        h_g_no1 = sc.nextInt();
        ans += 1;
        check(c_g_no1, h_g_no1);
    }

    public void check(int c_g_no1, int h_g_no1){
        if(c_g_no1 == h_g_no1){
            System.out.printf("You won this game in %d steps.\nCongrats", ans);
        } else if (c_g_no1 < h_g_no1){
            System.out.println("Your guessed no is grater then computer generated number");
            userInput();
        }else{
            System.out.println("Your guessed no is smaller then computer generated number");
            userInput();
        }
    }
}

public class GuessTheNumberGame{
    public static void main(String[] args){
        Game akshat = new Game();
        akshat.userInput();
    }
}
