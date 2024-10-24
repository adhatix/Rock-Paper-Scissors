import java.util.Scanner;
import java.util.Random;

public class Player {
    private String choice;

    public int getPcChoice() {
        //TODO
        Scanner askChoice = new Scanner(System.in);
        boolean RPSsaid = false;
        int intPcChoice = 0;
        while(RPSsaid == false) {
            choice = askChoice.nextLine().toUpperCase();
            if (choice.equals("ROCK") || choice.equals("PAPER") || choice.equals("SCISSORS")) {
                RPSsaid = true;
            } else {
                System.out.println("HEY LOSER ACTUALLY SAY ROCK, PAPER or SCISSORS");
            }
        }
        if(choice.equals("ROCK")) {
            intPcChoice = 0;
        } else if(choice.equals("PAPER")) {
            intPcChoice =  1;
        } else if(choice.equals("SCISSORS")) {
            intPcChoice = 2;
        }
        return intPcChoice;
    }

    public int getNpcChoice() {
        //TODO
        Random npcChoice = new Random();
        int npcPick = npcChoice.nextInt(3); // Randomly picks 0, 1, or 2
        return npcPick;
    }
}
