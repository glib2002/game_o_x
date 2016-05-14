/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_o_x;

import java.util.Scanner;

/**
 *
 * @author Глеб
 */
public class Game_O_X {

    public Scanner scanner = new Scanner(System.in);
    public char[][] grid = new char[3][3];

    public void startGame() {

        int l = 0;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                grid[r][c] = 0;
            }
        }

        for (int x = 0; x < 1;) {
            do {
                System.out.println("Make enter (1-3)");
                System.out.println("X");
                int userInput_X = Integer.parseInt(scanner.nextLine()) - 1;
                System.out.println("Y");
                int userInput_Y = Integer.parseInt(scanner.nextLine()) - 1;

                if (grid[userInput_X][userInput_Y] == 0) {
                    grid[userInput_X][userInput_Y] = 2;
                    break;
                }
            } while (true);
            
            
            
            if (validate(2)) {
                
            }

            // TODO: LOOP HERE
            System.out.println("Comp enter");
            int compX = (int) (Math.random() * 3);
            int compY = (int) (Math.random() * 3);

            if (grid[compX][compX] == 0) {
                grid[compX][compY] = 1;
            }
            System.out.println(compX + " " + compY);
            l++;

            if (l == 9) {
                System.out.println("Draw");
            }

            if (grid[compX][compY] != 0) {

                compX = (int) (Math.random() * 3);
                compY = (int) (Math.random() * 3);
                System.out.println("comp enter" + compX + " " + compY);

            }
            
            if (validate(1)) {
                
            }

            // TODO: Optimize algorithm (for).
            if (grid[0][0] == 2 && grid[1][1] == 2 && grid[2][2] == 2) {
                System.out.println("You win");
                x++;
            } else if (grid[0][0] == 1 && grid[1][1] == 1 && grid[2][2] == 1) {
                System.out.println("You lose");
                x++;
            }
            
            //cor
            if (grid[2][0] == 2 && grid[2][1] == 2 && grid[2][2] == 2) {
                System.out.println("You win");
                x++;
            } else if (grid[2][0] == 1 && grid[2][1] == 1 && grid[2][2] == 1) {
                System.out.println("You lose");
                x++;
            }//cor
            if (grid[0][0] == 2 && grid[1][0] == 2 && grid[2][0] == 2) {
                System.out.println("You win");
                x++;
            } else if (grid[0][0] == 1 && grid[1][0] == 1 && grid[2][0] == 1) {
                System.out.println("You lose");
                x++;
            }//cor            
            if (grid[0][2] == 2 && grid[1][2] == 2 && grid[2][2] == 2) {
                System.out.println("You win");
                x++;
            } else if (grid[0][2] == 1 && grid[1][2] == 1 && grid[2][2] == 1) {
                System.out.println("You lose");
                x++;
            }//cor
            if (grid[2][0] == 2 && grid[1][1] == 2 && grid[0][2] == 2) {
                System.out.println("You win");
                x++;
            } else if (grid[2][0] == 1 && grid[1][1] == 1 && grid[0][2] == 1) {
                System.out.println("You lose");
                x++;
            }//cor
            if (grid[0][1] == 2 && grid[1][1] == 2 && grid[2][1] == 2) {
                System.out.println("You win");
                x++;
            } else if (grid[0][1] == 1 && grid[1][1] == 1 && grid[2][1] == 1) {
                System.out.println("You lose");
                x++;
            }//cor

        }
    }

    private boolean validate(int val) {
        for (int i = 0; i < 3; i++) {
            int k = 0;
            
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == val) {
                    k++;
                }
            }

            if (k == 3) {
                System.out.println("You win");
                return true;
            }
        }

        return false;
    }
}
