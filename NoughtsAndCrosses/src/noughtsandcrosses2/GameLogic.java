package noughtsandcrosses2;
import java.util.Scanner;


class GameLogic {

    Field field = new Field();
    Scanner keyboardInput = new Scanner(System.in);
    String playerInput1, playerInput2, playerInput3, playerInput4, playerInput5;
    String computerInput1, computerInput2, computerInput3, computerInput4;
    int randomNumber;
    boolean gameOver = false;
    String winner = null;


    void player() {

        if (playerInput1 == null) {
            System.out.println("=> Твой ход 1: ");
            playerInput1 = keyboardInput.next();
            System.out.println("Ты ввёл: " + playerInput1);

            if (!gameOver)
                computer();

        } else if (playerInput2 == null) {
            System.out.println("=> Твой ход 2: ");
            playerInput2 = keyboardInput.next();
            System.out.println("Ты ввёл: " + playerInput2);

            if (!gameOver)
                computer();

        } else if (playerInput3 == null) {
            System.out.println("=> Твой ход 3: ");
            playerInput3 = keyboardInput.next();
            System.out.println("Ты ввёл: " + playerInput3);

            if (!gameOver)
                computer();

        } else if (playerInput4 == null) {
            System.out.println("=> Твой ход 4: ");
            playerInput4 = keyboardInput.next();
            System.out.println("Ты ввёл: " + playerInput4);

            if (!gameOver)
                computer();

        } else {
            System.out.println("=> Твой ход 5: ");
            playerInput5 = keyboardInput.next();
            System.out.println("Ты ввёл: " + playerInput5);

            if (playerInput5 != null) {
                gameOver();
            }
        }
    }

    void computer() {

        if (computerInput1 == null) {
            computerInput1 = getRundomNumber();
            System.out.println();
            System.out.println("=> Компьютер ввёл: " + computerInput1);
            System.out.println("-------------------");

        } else if (computerInput2 == null) {
            computerInput2 = getRundomNumber();
            System.out.println();
            System.out.println("=> Компьютер ввёл: " + computerInput2);
            System.out.println("-------------------");

        } else if (computerInput3 == null) {
            computerInput3 = getRundomNumber();
            System.out.println();
            System.out.println("=> Компьютер ввёл: " + computerInput3);
            System.out.println("-------------------");

        } else {
            computerInput4 = getRundomNumber();
            System.out.println();
            System.out.println("=> Компьютер ввёл: " + computerInput4);
            System.out.println("-------------------");
        }
    }

    String getRundomNumber() {
        randomNumber = (int) (Math.random() * 10);
        return Integer.toString(randomNumber);
    }

    void isWinnerHorizontal() {
        if (playerInput1 == "1" & playerInput2 == "2" & playerInput3 == "3"
                | playerInput1 == "3" & playerInput2 == "2" & playerInput3 == "1"
                | playerInput1 == "3" & playerInput2 == "1" & playerInput3 == "2"
                | playerInput1 == "2" & playerInput2 == "1" & playerInput3 == "3") {
            gameOver = true;
            winner = "player";
        } else if (playerInput1 == "3" & playerInput2 == "2" & playerInput3 == "1")
    }

    void gameOver() {

        gameOver = true;
        System.out.println();
        System.out.println("==============");
        System.out.println("Игра окончена!");
        System.out.println("==============");

    }



    void start() {

        while(!gameOver) {
            player();
        }
    }
}
