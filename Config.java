public class Config {
    public static String printRules() {
        return "Pick between ROCK, PAPER, or SCISSORS.";
    }

    // 0 = Draw, 1 = Player Wins, -1 = NPC Wins
    public static int calculateWinner(int pChoice, int npcChoice) {
        if (pChoice == npcChoice) {
            return 0; // Draw if both choices are the same
        } else if ((pChoice == 0 && npcChoice == 2) || (pChoice == 1 && npcChoice == 0) || (pChoice == 2 && npcChoice == 1)) {
            return 1; // Player wins
        } else {
            return -1; // NPC wins
        }
    }

    public static String printOutcome(int result) {
        if (result == 1) {
            return "The Player Wins!";
        } else if (result == -1) {
            return "The Computer Wins!";
        } else {
            return "It's a Draw!";
        }
    }

    public static String printPlayerChoice(int pcChoice) {
        String choiceString = "";
        if(pcChoice == 0) {
            choiceString = "ROCK";
        } else if(pcChoice == 1) {
            choiceString = "PAPER";
        } else if(pcChoice == 2) {
            choiceString = "SCISSORS";
        }
        return choiceString;
    }

    public static String printNpcChoice(int npcChoice) {
        String choiceString = "";
        if(npcChoice == 0) {
            choiceString = "ROCK";
        } else if(npcChoice == 1) {
            choiceString = "PAPER";
        } else if(npcChoice == 2) {
            choiceString = "SCISSORS";
        }
        return choiceString;
    }
}
