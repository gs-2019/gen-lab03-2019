package ch.heig.gen.lab03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ask for the number of players
        int playerCount = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Select the number of players (2-8):");

            try {
                playerCount = input.nextInt();
            }
            catch (InputMismatchException e) {
                playerCount = 0;
            }
        }
        while (playerCount < 2 || playerCount > 8);

        // create and run game
        MonopolyGame game = new MonopolyGame(playerCount);
        game.play();
    }
}
