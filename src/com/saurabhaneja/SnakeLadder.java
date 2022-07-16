package com.saurabhaneja;

public class SnakeLadder {
    public static int SnakeLadder(int score ) {
        if(score >100)
            return score;
        else if(score == 3){
            score += 48;
            System.out.print("\tGet a ladder (03 to 51)");}
        else if(score == 6){
            score += 21;
            System.out.print("\tGet a ladder (06 to 27)");}
        else if (score == 20){
            score += 50;
            System.out.print("\tGet a ladder (20 to 70)");}
        else if (score == 36){
            score += 19;
            System.out.print("\tGet a ladder (36 to 55)");}
        else if (score == 63){
            score += 32;
            System.out.print("\tGet a ladder (63 to 95)");}
        else if (score == 68){
            score = 98;
            System.out.print("\tGet a ladder (68 to 98)");}
        // snakes
        else if (score == 25){
            score = 5;
            System.out.print("\tGet a snake (25 to 5)");}
        else if (score == 34){
            score = 2;
            System.out.print("\tGet a snake (34 to 02)");}
        else if (score == 47){
            score = 19;
            System.out.print("\tGet a snake (47 to 19)");}
        else if (score == 65){
            score = 52;
            System.out.print("\tGet a snake (65 to 52)");}
        else if (score == 87){
            score = 57;
            System.out.print("\tGet a snake (87 to 57)");}
        else if (score == 91){
            score = 61;
            System.out.print("\tGet a snake (91 to 61)");}
        else if (score == 99){
            score =36;
            System.out.print("\tGet a snake (99 to 36)");}

        return score;
    }
    public static void SnakesandLadders() {

        System.out.println("<====Ladders====>");
        System.out.println(" 1.  03 =i=i=> 51 ");
        System.out.println(" 2.  06 =i=i=> 27 ");
        System.out.println(" 3.  20 =i=i=> 70 ");
        System.out.println(" 4.  36 =i=i=> 55 ");
        System.out.println(" 5.  63 =i=i=> 95 ");
        System.out.println(" 6.  68 =i=i=> 98 ");
        System.out.println("<====Snakes====>");
        System.out.println(" 1.  25 =><=> 5 ");
        System.out.println(" 2.  34 =><=> 02 ");
        System.out.println(" 3.  47 =><=> 19 ");
        System.out.println(" 4.  65 =><=> 52 ");
        System.out.println(" 5.  87 =><=> 57 ");
        System.out.println(" 6.  91 =><=> 61 ");
        System.out.println(" 7.  99 =><=> 36 ");

    }
}
