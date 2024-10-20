import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {

       ChessMain main = new ChessMain();
       ArrayList <Player> players = main.createPlayers();
       for (Player player : players){
           System.out.println(player);
       }
       HashMap <String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);

//        System.out.println("The player 1 name is " + whitePlayer.getName());
//       System.out.println("The player 2 name is " + blackPlayer.getName());

//       System.out.println(whitePlayer);
//        System.out.println(blackPlayer);
//
//        try {
//            whitePlayer.setRank(10000);
//        }
//        catch (IllegalArgumentException err){
//            System.out.println("please update rank to valid");
//        }
//        System.out.println(whitePlayer.getRank());
//       blackPlayer.setRank(-100);
//
//



    }

    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasily Borgov", "Vasily.Borgov@yandex.ru", false, 2500, 45);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;

    }

    public HashMap<String, Piece> createPieces() {


    King whiteKing = new King (new Spot("h", 7), "white_king",true);
        King blackKing = new King(new Spot("d", 8), "black king", true);
        Rook whiteRook1 = new Rook(new Spot("a", 7), "white rook1", true);
        Rook whiteRook2 = new Rook(new Spot("g", 7), "white rook2", true);
        Knight blackKnight1 = new Knight(new Spot("d", 6), "black_knight1", false);


        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight1.getId(), blackKnight1);

        return pieceHashMap;

    }

    public void play(ArrayList<Player> players, HashMap<String, Piece>hashMap){
        //move1
        try {
            players.get(0).movePiece(hashMap.get("black king"), new Spot("a", 8));
        }
        catch (IllegalArgumentException error){
            System.out.println("The move is incorrect, please try again");
            //retry functionality
        }
        players.get(1).movePiece(hashMap.get("black_knight1"), new Spot("c",8));
    }
    }
