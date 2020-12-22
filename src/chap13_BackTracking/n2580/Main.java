package chap13_BackTracking.n2580;

import java.util.Scanner;

public class Main {

	public static int[][] arr;

	final static int end = 9;
	final static int size = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		arr = new int[end][end];

		for (int i = 0; i < end; i++) {
			for (int j = 0; j < end; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		sudoku(0, 0);
	}

	public static void sudoku(int row, int col) {

		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}

		if (row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
			return;

		}

		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibility(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}

		sudoku(row, col + 1);

	}

	public static boolean possibility(int row, int col, int value) {

		// row check
		for (int i = 0; i < end; i++) {
			if (arr[i][col] == value) {
				return false;
			}
		}

		// col check
		for (int i = 0; i < end; i++) {
			if (arr[row][i] == value) {
				return false;
			}
		}

		int set_row = (row / size) * size;
		int set_col = (col / size) * size;

		for (int i = set_row; i < set_row + size; i++) {
			for (int j = set_col; j < set_col + size; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;


	}
}
