// sudoku
import java.util.*;

public class prog35 {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        for(int i = 0; i <=8 ; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        for(int j = 0; j <=8 ; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for(int i = startRow; i < startRow+3;i++){
            for(int j = startCol; j < startCol+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudoku(int sudoku[][], int row, int col){
        //base
        if( row == 9){
            return true;
        }
        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row + 1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudoku(sudoku, nextRow, nextCol);
        }
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudoku(sudoku, row, col)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sudoku1[][] = {  {7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}   
     }  ;
        Boolean s = sudoku(sudoku1, 9, 9);
        if(s){
            System.out.println("solved");
            System.out.println("Print sudoku");
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    System.out.print(sudoku1[i][j]+ " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("not solved");
        }
    }
}