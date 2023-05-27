package SelfJava.Constructor;

public class BoardTest {
    public static void main(String[] args) {
        Board board1 = new Board("login id", "date", "yuni", "today", 0);
        Board board2 = new Board("login id2", "date2", "yuni2");
        Board board3 = new Board("login id3", "date3");

        System.out.println(board1.title);
        System.out.println(board2.content);
        System.out.println(board3.title);


    }
}
