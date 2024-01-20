import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    static class Pair{
        String name;
        int score;

        Pair(String name, int score){
            this.name=name;
            this.score=score;
        }

        @Override
        public String toString() {
            return (name+"->"+score);
        }
    }
     public static List<Pair> playersScore;
    public Game(){
     playersScore = new ArrayList<>();
    }
    public static void start(){

        System.out.println("you have to guess a number between 1 to 100");
        System.out.println("a random number is generated in the game if you guess the correct number: you won!!!");
        System.out.println("you have only 5 attempts to guess the number");
        System.out.println("Lets start the Game");
        System.out.println("Please Enter Your Name : ");

        // use to taking input from the player
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Welcome "+name+ " your game is started");
        int randomNumber = (int)(Math.random()*100)+1;
        int attempts =5;
//        System.out.println(randomNumber);

        for(int i=0;i<5;i++){
            System.out.println("chances left :"+ attempts--);
            System.out.println("please enter your number :");
            int num = sc.nextInt();

            if(num==randomNumber){
                System.out.println("the number is :"+ num);
                System.out.println(" Correct guess! You Won!!!");
                System.out.println("your Score is :"+ (attempts+1)*20);
                playersScore.add(new Pair(name,(attempts+1)*20));
                break;

            }else if(Math.abs(num-randomNumber) <= 5){
                System.out.println("too close");
            }else if((num-randomNumber) >5){
                System.out.println("too high");
            }else{
                System.out.println("too low");
            }
            if(i==4){
                System.out.println("Oops !!! "+"the correct answer is :"+ randomNumber+" Better luck next time");
                System.out.println("SCORE : 00");
                playersScore.add(new Pair(name,0));
            }
            }

        System.out.println("to restart the game press: 1");
        System.out.println("to Exit the game Enter: 0");
        System.out.println("players scores: 2");
        int res = sc.nextInt();
        if(res==1){
        start();
        }else if(res==0){
            return;
        }else if(res==2){
            printScores(playersScore);
            System.out.println("to restart the game press: 1");
            System.out.println("to Exit the game Enter: 0");

              res = sc.nextInt();
            if(res==1){
                start();
            }else if(res==0){
                return;
            }
        }

    }
    public static void printScores(List<Pair> li){
        for(Pair p : li){
            System.out.println(p.name+" -->  "+p.score);
        }
    }

}
