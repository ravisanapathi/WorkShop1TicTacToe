package com.bridgelabz;
import java.util.Scanner;

public class PrintBoard {
	static char[] board = new char[10];
	static char playerLetter;
	static char computerLetter;
	public static void main(String[] args)
	{
		createEmptyBoard();
		selectLetter();
		showBoard();

	}

	//UC1
	private static void createEmptyBoard()
	{
		for(int index=1; index<board.length;index++)
		{
			board[index] = ' ';
		}
	}

	//UC2
	private static void selectLetter()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a letter :: X or O : ");
		playerLetter = scanner.next().toUpperCase().charAt(0);
		computerLetter = (playerLetter == 'X') ? 'O' : 'X';
	}
	
	//UC3
	private static void showBoard()
	{
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
	
}