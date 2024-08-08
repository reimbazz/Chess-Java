package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ChessMatch chessmatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

       while (!chessmatch.getCheckMate()) {
        try {
            UI.clearScreen();
            UI.printMach(chessmatch, captured);
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            boolean[][] possibleMoves = chessmatch.possibleMoves(source);
            UI.clearScreen();
            UI.printBoard(chessmatch.getPieces(), possibleMoves);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessmatch.performChessMove(source, target);

            if (capturedPiece != null) {
                captured.add(capturedPiece);
            }

            if (chessmatch.getPromoted() != null) {
                System.out.println("Enter piece for promotion (B/N/R/Q): ");
                String type = sc.nextLine().toUpperCase();
                while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")){
                    System.out.println("Invalid value :( \nEnter piece for promotion (B/N/R/Q): ");
                }
                chessmatch.replacePromotedPiece(type);
            }
            
        } catch (ChessException e) {
            System.out.println(e.getMessage());
            sc.nextLine();
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
            sc.nextLine();
        }
       }
       UI.clearScreen();
       UI.printMach(chessmatch, captured);
    }
}
