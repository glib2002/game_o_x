/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_o_x;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Глеб
 */
public class Game_O_X {

    public static Scanner scanner = new Scanner(System.in);
    public static char c[][] = new char[3][3];

    public static void startGame() {

        int l = 0;
        for (int b = 0; b < 3; b++) {
            c[0][b] = 0;
        }

        for (int b = 0; b < 3; b++) {
            c[1][b] = 0;
        }
        for (int b = 0; b < 3; b++) {
            c[2][b] = 0;
        }
        for (int x = 0; x < 1;) {
            System.out.println("Make enter");
            System.out.println("X");
            int userInput_X = Integer.parseInt(scanner.nextLine());
            System.out.println("Y");
            int userInput_Y = Integer.parseInt(scanner.nextLine());

            if (c[userInput_X][userInput_Y] != 0) {
                System.out.println("Please reenter");
                System.out.println("X");
                userInput_X = Integer.parseInt(scanner.nextLine());
                System.out.println("Y");
                userInput_Y = Integer.parseInt(scanner.nextLine());

            }
            System.out.println("Comp enter");
            int compX = (int) (Math.random() * 3);
            int compY = (int) (Math.random() * 3);
            if (c[userInput_X][userInput_Y] == 0) {

                c[userInput_X][userInput_Y] = 2;
            }
            if (c[compX][compX] == 0){
            c[compX][compY] = 1;
            }
            System.out.println(compX + " " + compY);
            l++;

            if (l == 9) {
                System.out.println("Drau");
            }

            if (c[compX][compY] != 0) {

                compX = (int) (Math.random() * 3);
                compY = (int) (Math.random() * 3);
                System.out.println("comp enter" + compX + " " + compY);

            } else {
                if (c[0][0] == 2 && c[1][1] == 2 && c[2][2] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[0][0] == 1 && c[1][1] == 1 && c[2][2] == 1) {
                    System.out.println("You lose");
                    x++;
                }
                //cor
                if (c[1][0] == 2 && c[1][1] == 2 && c[1][2] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[1][0] == 1 && c[1][1] == 1 && c[1][2] == 1) {
                    System.out.println("You lose");
                    x++;
                }
                //cor
                if (c[0][0] == 2 && c[0][1] == 2 && c[0][2] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[0][0] == 1 && c[0][1] == 1 && c[0][2] == 1) {
                    System.out.println("You lose");
                    x++;
                }
                //cor
                if (c[2][0] == 2 && c[2][1] == 2 && c[2][2] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[2][0] == 1 && c[2][1] == 1 && c[2][2] == 1) {
                    System.out.println("You lose");
                    x++;
                }//cor
                if (c[0][0] == 2 && c[1][0] == 2 && c[2][0] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[0][0] == 1 && c[1][0] == 1 && c[2][0] == 1) {
                    System.out.println("You lose");
                    x++;
                }//cor            
                if (c[0][2] == 2 && c[1][2] == 2 && c[2][2] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[0][2] == 1 && c[1][2] == 1 && c[2][2] == 1) {
                    System.out.println("You lose");
                    x++;
                }//cor
                if (c[2][0] == 2 && c[1][1] == 2 && c[0][2] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[2][0] == 1 && c[1][1] == 1 && c[0][2] == 1) {
                    System.out.println("You lose");
                    x++;
                }//cor
                if (c[0][1] == 2 && c[1][1] == 2 && c[2][1] == 2) {
                    System.out.println("You win");
                    x++;
                } else if (c[0][1] == 1 && c[1][1] == 1 && c[2][1] == 1) {
                    System.out.println("You lose");
                    x++;
                }//cor
            }

        }
    }
}
