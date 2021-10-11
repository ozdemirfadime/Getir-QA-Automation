package Week2;

import java.util.Scanner;

public class DiceGame {
    /*
   Write a script that simulates a simple dice gambling game.
    The game is played as follows: roll a six sided die.
    If you roll a 1 or 2 the game is over.If you roll a 3, no money is earned and the you has the right to roll the dice again.
    If you roll a 4, 5, or 6, you win that many dollars ($4, $5, or $6), and then roll again.
    With each additional roll, you have the chance to win more money, or you might roll a game-ending 1 or  2at which time the game is over and you keep whatever winnings you have accumulated.
    When your total winnings are $ 50, the game is ended by giving the message "You have earned the maximum amount of money you can earn".
    Note: You can use
    Random random = new Random();
    int die = random.nextInt(6) + 1;
    for random dice number generation
     */

    public static void main(String[] args) {

        Dice dice = new Dice();
        System.out.println("Do you wants game Y/N");
        Scanner scanner = new Scanner(System.in);
        Character chooose = scanner.next().charAt(0);
        int prize = 0;
        boolean devam = true;

        if (chooose.equals('Y')) {
            while (devam && prize < 50) {
                System.out.println("your prize is :" + prize + "continue ? Y/N");
                Character devamke = scanner.next().charAt(0);
                if (devamke.equals('Y')) {
                    int diceAmount = dice.rollTheDice();
                    System.out.println("Dice Amount" + diceAmount);

                    if ((diceAmount == 1) || (diceAmount == 2)) {
                        System.out.println("Game over try again!");
                        prize = 0;
                        devam = false;
                    }
                    if ((diceAmount == 3)) {
                        System.out.println("You cant earn money Try again");
                    } else {
                        prize = prize + diceAmount;
                    }
                } else if (devamke.equals('N')) {
                    System.out.println("Your prize is " + prize);
                } else {
                    System.out.println("Game is over try again!");
                }
            }
        }
        scanner.close();
    }
        
}