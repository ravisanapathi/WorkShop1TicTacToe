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
}