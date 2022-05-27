import java.awt.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

public class MazeGenerator {

    public class Maze {
        //maybe add something that allows user to input size
        int size = 400;
        int x, y;
        public final int cols = 20;
        public final int rows = 20;
        int[][] North;
        int[][] East;
        int[][] South;
        int[][] West;
        int[][] CurrentPos;
        int[][] GenMaze = new int[cols][rows];
        //create pathing for answer to maze
        public void CreateMaze(int cols, int rows) {

            //CurrentPos = 0,1 (START) 19, 18 (END)
            //Alright so, set 1 random from North,East, South, West = @
            //@ = White space (movable) ; # = Black space (WALL)
            //IF X OR Y POS = 0 or 19, AUTOMATICALLY # (except end) HOW TO FIND END???
            //The end thing will be 19,18 MAYBE NOT FOR GENERATOR

            for (int i = 0; i < 45; i++)
            {
                System.out.println("| | | -- - ||| ");
            }



        }






















    }
}


