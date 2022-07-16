package com.saurabhaneja;

import java.util.Scanner;

public class Main {

    static SnakeLadder snakeLadders = new SnakeLadder();

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Welcome To Snake And Ladder Game");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     It is Two Players Game");
        Scanner sc = new Scanner(System.in);

        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = sc.nextInt();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    entername();
                    break;

                case 2:
                    SnakesandLadders();
                    break;

                case 3:
                    rules();
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    printActions();
                    break;
            }

        }


    }

    public static void printActions () {
        System.out.println("Available Actions");
        System.out.println(" 0 -> To Leave this Game");
        System.out.println(" 1 -> To Enter in the Game");
        System.out.println(" 2 -> To See ladders and snakes in the Game ");
        System.out.println(" 3 -> To See the rules of the Game ");
    }

    public static void entername () {
        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println("Enter first Player name: ");
        player1.getName();
        System.out.println("Enter second Player name: ");
        player2.getName();

        player1.score = 0;
        player2.score = 0;


        while(true) {
            System.out.println("Press 9 " + player1.name + ", for next move");
            int ch = (int) sc.nextInt();
            if (ch == 9) {

                int nextnum = (int) (Math.random() * 6 + 1);

                System.out.print(player1.name + " get " + nextnum  );
                int temp = player1.score + nextnum;
                if (temp <= 100)
                    player1.score += nextnum;
                player1.score = checkSnakeLadder(player1.score);
                System.out.println("\t Your score :" + player1.score);
            }

            System.out.println("Press 8 " + player2.name + ", for next move");
            int ch1 = (int) sc.nextInt();
            if (ch1 == 8) {

                int nextnum2 = (int) (Math.random() * 6 + 1);
                System.out.print(player2.name + " get " + nextnum2 );
                int temp = player2.score + nextnum2;
                if(temp <= 100)
                    player2.score += nextnum2;
                player2.score = checkSnakeLadder(player2.score);
                System.out.println("\t Your score :" + player2.score);
            }
            if( ch1 ==0 || ch == 0)
                break;

            if (player1.score == 100 || player2.score == 100) {
                if (player1.score == 100 && player2.score == 100)
                    System.out.println("Match is Tie");
                else if (player1.score == 100)
                    System.out.println("\nt\t\t\t\t\t\t\t\t\t\t\t\tHurra " + player1.name + " has won\n\n");
                else if(player2.score == 100)
                    System.out.println("\nt\t\t\t\t\t\t\t\t\t\t\t\tHurra " + player2.name + " has won\n\n");
                break;}
        }

    }

    public static void staring(){
    }

    private static int checkSnakeLadder(int score){
        return snakeLadders.SnakeLadder(score);
    }


    private static void SnakesandLadders() {
        snakeLadders.SnakesandLadders();
    }

    private static void rules() {
        System.out.println(
              "1. Player name should not be blank\n" +
              "2. For rolling dice player should press right button\n\tPlayer 1 press '9' and Player 2 press '8' \n\totherwise you miss your 1 dice roll\n"  +
              "3. There are some Ladder and Snake presents in the way to reach victory('score = 100') \n" +
              "4. For rolling the dice doesn't press any character\n" +
              "\t\t\t\t\t\t\t Thank You \n\t\t\t\t\t\t\tBest Wishes"
        );
    }

}




