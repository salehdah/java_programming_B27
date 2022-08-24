package practice;

import java.util.Scanner;

public class soccerTime {
    public static void main(String[] args) {
        int munite=80;


        String timeLeft ="aqeel";
        if (munite>=0 && munite<=90){
            if (munite>=75 && munite<=90){
                timeLeft = "game just getting started";
            } else if (munite>= 60 && munite<=74) {
                timeLeft ="players are doing great";
                
            } else if (munite>=30 && munite<=59) {
                timeLeft ="middle of the game is going great";
                
            } else if (munite>=0 && munite<=29) {
                timeLeft = "the end of the game is approaching";
                
            }

        }else {
            if (munite<0){
                timeLeft ="minutes cannot be a negative number";
            } else if (munite>90) {
                timeLeft= "games cannot be longer than 90 minutes";

            }
        }
        System.out.println(timeLeft);

        }
}
