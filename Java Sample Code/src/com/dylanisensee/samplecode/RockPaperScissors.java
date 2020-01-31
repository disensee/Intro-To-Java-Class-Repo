package com.dylanisensee.samplecode;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	// First look over the code
	// Then implement the code in determineWinnerOfRound()
	
	public static void main(String[] args) {
		
		RockPaperScissors game = new RockPaperScissors();
		
		while(game.playRound());
	}
	
	public static final char ROCK = 'R';
	public static final char PAPER = 'P';
	public static final char SCISSORS = 'S';
	
	private int humanScore = 0;
	private int computerScore = 0;
	
	public boolean playRound() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your choice...");
		System.out.println("(R)ock");
		System.out.println("(P)aper");
		System.out.println("(S)cissors");
		System.out.println("To quit, press 'Q'");
		
		String inputStr = keyboard.next();
		char humanChoice = inputStr.toUpperCase().charAt(0);
		if(humanChoice == 'Q') {
			return false;
		}
		
		System.out.println("\n\n\n\n\n\n");
		char computerChoice = generateRandomChoice();
		determineWinnerOfRound(humanChoice, computerChoice);
		displayScore();
		return true;
	}
	
	public void displayScore() {
		System.out.println("SCOREBOARD - Human: " + humanScore + " Computer: " + computerScore + "\n");
	}
	
	private char generateRandomChoice() {
		
		Random r = new Random();
		int min = 1, max = 3;
		int randomNumber = r.nextInt(max - min + 1) + min;
		
		char randomChoice = 0;
		
		switch(randomNumber) {
		case 1:
			randomChoice = ROCK;
			break;
		case 2:
			randomChoice = PAPER;
			break;
		case 3:
			randomChoice = SCISSORS;
			break;
		}
		
		return randomChoice;
	}
	
		
	private void determineWinnerOfRound(char humanChoice, char computerChoice) {
		
		System.out.println("The human chooses " + humanChoice + " and the computer chooses " + computerChoice);		
		
		// Determine who wins the round (the human or the computer), or if it was a draw
		// If the human wins, then increment the humanScore variable by one and print "The human wins the round!"
		// If the computer wins, then increment the computerScore variable by one and print "The computer wins the round!"
		// If neither the human nor the computer wins, then simply print "It's a draw!"
		
		if(humanChoice == ROCK && computerChoice == SCISSORS) {
			System.out.println("The human wins the round!");
			humanScore++;
		}else if(humanChoice == SCISSORS && computerChoice == PAPER) {
			System.out.println("The human wins the round!");
			humanScore++;
		}else if(humanChoice == PAPER && computerChoice == ROCK) {
			System.out.println("The human wins the round!");
			humanScore++;
		}else if(humanChoice == ROCK && computerChoice == PAPER) {
			System.out.println("The computer wins the round!");
			computerScore++;
		}else if(humanChoice == SCISSORS && computerChoice == ROCK) {
			System.out.println("The computer wins the round!");
			computerScore++;
		}else if(humanChoice == PAPER && computerChoice == SCISSORS) {
			System.out.println("The computer wins the round!");
			computerScore++;
		}
		
		
		
		
	}
	

}