package chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import static chess.Bishop.COUNTBISHOP;
import static chess.ChessBoard.cell;
import static chess.King.COUNTKING;
import static chess.Knight.COUNTKNIGHT;
import static chess.Pawn.COUNTPAWNS;
import static chess.Quen.COUNTQUEEN;
import static chess.Rook.COUNTROOK;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        firstBlock:
        {
            System.out.println("Create a board?");
            System.out.println("1 - y");
            System.out.println("2 - n");
            int choose = Integer.parseInt(reader.readLine());
            switch (choose) {
                case 1 : new ChessBoard();
                    break;
                case 2 :
                    System.out.println("You choosed not to create a board");
                    break firstBlock;
                default:
                    System.out.println("Error");
            }

            Thread.sleep(200);
            System.out.println("Выберите фигуру");

            System.out.println("1 - " + "Король");
            System.out.println("2 - " + "Королева");
            System.out.println("3 - " + "Слон");
            System.out.println("4 - " + "Конь");
            System.out.println("5 - " + "Ладья");
            System.out.println("6 - " + "Пешка");
            System.out.println("Введите координаты");

            for (int i = 0; i < cell.length; i++) {
                int input = Integer.parseInt(reader.readLine());
                int x = Integer.parseInt(reader.readLine());
                int y = Integer.parseInt(reader.readLine());

                switch (input) {
                    case 1:
                        if (COUNTKING >= 1) {
                            System.out.println("More than one kings can't be");
                            break;
                        } else if (COUNTKING < 1) {
                            cell[i] = new King(x, y);
                            break;
                        }
                    case 2:
                        if (COUNTQUEEN >= 1) {
                            System.out.println("More than one queen can't be");
                            break;
                        } else if (COUNTQUEEN < 1) {
                            cell[i] = new Quen(x, y);
                            break;
                        }
                    case 3:
                        if (COUNTBISHOP >= 2) {
                            System.out.println("More than two bishops can't be");
                            break;
                        } else if (COUNTBISHOP < 2) {
                            cell[i] = new Bishop(x, y);
                            break;
                        }
                    case 4:
                        if (COUNTKNIGHT >= 2) {
                            System.out.println("More than two knights can't be");
                            break;
                        } else if (COUNTKNIGHT < 2) {
                            cell[i] = new Knight(x, y);
                            break;
                        }
                    case 5:
                        if (COUNTROOK >= 2) {
                            System.out.println("More than two rooks can't be");
                            break;
                        } else if (COUNTROOK < 2) {
                            cell[i] = new Rook(x, y);
                            break;
                        }
                    case 6:
                        if (COUNTPAWNS >= 8) {
                            System.out.println("More than 8 pawns can't be");
                            break;
                        } else if (COUNTPAWNS < 8) {
                            cell[i] = new Pawn(x, y);
                            break;
                        }


                }


            }
            System.out.println(Arrays.toString(cell));
        }
    }

}
