package ImproviseGuesserGame;

import java.util.Scanner;

class Guesser1 {
	int secret;

	int guessNumber1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("HELLO WHAT IS YOUR NAME");
		String gussername = sc.nextLine();

		System.out.println("OK " + gussername.toUpperCase() + " NOW " + "GIVE SECRET NUMBER FROM 1-30");
		secret = sc.nextInt();
		return secret;
	}

	int anotherround() {

		Scanner sc = new Scanner(System.in);
		System.out.println("GIVE ANOTHER SECRET NUMBER FROM 1-30");
		secret = sc.nextInt();
		if (secret > 30) {
			System.out.println("only between 1-30");
			secret = sc.nextInt();

		}
		return secret;
	}

}

class Player1 {
	int pguessNum1;

	public int guessNumber2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1 guess the number");
		pguessNum1 = sc.nextInt();
		return pguessNum1;
	}
}

class Player2 {
	int pguessNum2;

	public int guessNumber3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player2 guess the number");
		pguessNum2 = sc.nextInt();
		return pguessNum2;
	}
}

class Player3 {
	int pguessNum3;

	public int guessNumber4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player3 guess the number");
		pguessNum3 = sc.nextInt();
		return pguessNum3;
	}
}

class Umpire1 {
	int secretNumber;
	int numPlayer1;
	int numPlayer2;
	int numPlayer3;
	int counter = 0;

	// method 1
	public void rounds() {
		if (counter>0 || counter<=1) {
			System.out.println("Round " + counter++);
			
			collectPlayersGuessedNum();
			compare();

		} else if (counter == 2) {
			System.out.println("Round " + counter++);
			Guesser1 g = new Guesser1();
			g.anotherround();
			collectPlayersGuessedNum();
			compare2();
		} else if (counter == 3) {
			System.out.println("Round " + counter++);
			Guesser1 g = new Guesser1();
			g.anotherround();
			collectPlayersGuessedNum();
			compare();
		}

		else if (counter >= 4) {
			System.out.println("Game Over");
		}

	}

//method2
	public void collectSecretNum() {
		Guesser1 g = new Guesser1();
		secretNumber = g.guessNumber1();

		if (secretNumber > 30) {
			System.out.println("only between 1-30");
			Scanner sc = new Scanner(System.in);
			secretNumber = sc.nextInt();
		}
	}

	// method 3
	public void collectPlayersGuessedNum() {
		Player1 p1 = new Player1();
		numPlayer1 = p1.guessNumber2();

		Player2 p2 = new Player2();
		numPlayer2 = p2.guessNumber3();

		Player3 p3 = new Player3();
		numPlayer3 = p3.guessNumber4();

	}

	public void collectPlayersGuessedNum1_2() {
		Player1 p1 = new Player1();
		numPlayer1 = p1.guessNumber2();

		Player2 p2 = new Player2();
		numPlayer2 = p2.guessNumber3();

	}
	
	public void collectPlayersGuessedNum1_3() {
		Player1 p1 = new Player1();
		numPlayer1 = p1.guessNumber2();

		Player3 p3 = new Player3();
		numPlayer3 = p3.guessNumber4();

	}
	public void collectPlayersGuessedNum2_3() {
		Player2 p2 = new Player2();
		numPlayer2 = p2.guessNumber3();

		Player3 p3 = new Player3();
		numPlayer3 = p3.guessNumber4();

	}
	
	

	void compare() {
		if (secretNumber == numPlayer1) {
			if (secretNumber == numPlayer2 && secretNumber == numPlayer3) {
				System.out.println("Tie all three correct "+counter );
			
			} else if (secretNumber == numPlayer2) {
				System.out.println("player 1 and 2 Guessed it Correct " + counter);
			
			} else if (secretNumber == numPlayer3) {
				System.out.println("player 1 and 3 Guessed it Correct " + counter);
				
			} else {
				System.out.println("_____________________________________________________________________");
				System.out.println(
						"Player1 " + "(*-*) CONGRATULATIONS (*-*)  YOU Are  Right in " + counter + " ATTEMPT  ");
				System.out.println("_____________________________________________________________________");
				
			
			}

		} else if (secretNumber == numPlayer2) {
			if (secretNumber == numPlayer2 && secretNumber == numPlayer3) {
				System.out.println(" player 2 and 3 Guessed it Correct" + counter);
			} else {
				System.out.println("_____________________________________________________________________");
				System.out.println(
						"Player2" + "(*-*) CONGRATULATIONS (*-*)  YOU Are  Right in " + counter + " ATTEMPT  ");
				System.out.println("_____________________________________________________________________");
			
			}

		} else if (secretNumber == numPlayer3) {
			System.out.println("_____________________________________________________________________");
			System.out.println("Player3" + "(*-*) CONGRATULATIONS (*-*)  YOU Are  Right in " + counter + " ATTEMPT  ");
			System.out.println("_____________________________________________________________________");
			
		} else {
			System.out.println("Game Lost" + counter + " ATTEMPT  ");

		}

	}

	void compare2() {
		if (counter == 1 && secretNumber == numPlayer1 && secretNumber == numPlayer2 && secretNumber == numPlayer3) 
		{
			System.out.println("Again All player  Guessed it Correct" + counter);
		} else if (counter == 1 && secretNumber == numPlayer1 && secretNumber == numPlayer2) {
			System.out.println("Again player 1 and 2 Guessed it Correct" + counter);
		} else if (counter == 1 && secretNumber == numPlayer1 && secretNumber == numPlayer3) {
			System.out.println("Again player 1 and 3 Guessed it Correct");
		}
		else if (counter == 1 && secretNumber == numPlayer2 && secretNumber == numPlayer3) {
			System.out.println("Again player 2 and 3 Guessed it Correct");
		} else {
			System.out.println("Game Lost" + counter + " ATTEMPT");
		}
		
		
		if (counter == 2 && secretNumber == numPlayer1 && secretNumber == numPlayer2 && secretNumber == numPlayer3)
		{
			System.out.println("Again All player  Guessed it Correct" + counter);
		} else if (counter == 2 && secretNumber == numPlayer1 && secretNumber == numPlayer2) {
			System.out.println("Again player 1 and 2 Guessed it Correct" + counter);
		} else if (counter == 2 && secretNumber == numPlayer1 && secretNumber == numPlayer3) {
			System.out.println("Again player 1 and 3 Guessed it Correct");
		}
		else if (counter == 2 && secretNumber == numPlayer2 && secretNumber == numPlayer3) {
			System.out.println("Again player 2 and 3 Guessed it Correct");
		} else {
			System.out.println("Game Lost" + counter + " ATTEMPT");
		}
		
		if (counter == 3 && secretNumber == numPlayer1 && secretNumber == numPlayer2 && secretNumber == numPlayer3) {
			System.out.println("Again All player  Guessed it Correct" + counter);
		} else if (counter == 3 && secretNumber == numPlayer1 && secretNumber == numPlayer2) {
			System.out.println("Again player 1 and 2 Guessed it Correct" + counter);
		} else if (counter == 3 && secretNumber == numPlayer1 && secretNumber == numPlayer3) {
			System.out.println("Again player 1 and 3 Guessed it Correct");
		}
		else if (counter == 3 && secretNumber == numPlayer2 && secretNumber == numPlayer3) {
			System.out.println("Again player 2 and 3 Guessed it Correct");
		} else {
			System.out.println("Game Lost" + counter + " ATTEMPT");
		}
		
	}

	void tie() {
		for(counter=0;counter<=1;counter++) {
		if ( secretNumber == numPlayer1 && secretNumber == numPlayer2 && secretNumber == numPlayer3 ||
			(secretNumber == numPlayer1 && secretNumber == numPlayer2)||
			( secretNumber == numPlayer1 && secretNumber == numPlayer3)||
			( secretNumber == numPlayer2 && secretNumber == numPlayer3))
		{
			Guesser1 g = new Guesser1();
			g.anotherround();
			collectPlayersGuessedNum();
			compare();

		} 
		}{System.out.println("game over");}
		
		
		for(counter=2;counter<=2;counter++) {
			if ( secretNumber == numPlayer1 && secretNumber == numPlayer2 && secretNumber == numPlayer3 ||
				(secretNumber == numPlayer1 && secretNumber == numPlayer2)||
				( secretNumber == numPlayer1 && secretNumber == numPlayer3)||
				( secretNumber == numPlayer2 && secretNumber == numPlayer3))
			{
				Guesser1 g = new Guesser1();
				g.anotherround();
				collectPlayersGuessedNum();
				compare2();

			}
				else if (counter == 2 && secretNumber == numPlayer1 && secretNumber == numPlayer2) {
					Guesser1 g = new Guesser1();
					g.anotherround();
					collectPlayersGuessedNum1_2();
					compare2();
					}
				else if (counter == 2 && secretNumber == numPlayer1 && secretNumber == numPlayer3) {
					
					Guesser1 g = new Guesser1();
					g.anotherround();
					collectPlayersGuessedNum1_3();
					compare2();
				}
				else if (counter == 2 && secretNumber == numPlayer2 && secretNumber == numPlayer3) {
					Guesser1 g = new Guesser1();
					g.anotherround();
					collectPlayersGuessedNum2_3();
					compare2();
					

				}
			} 
			
			
		  while( counter>=3 ) 
		  { 
			  if(counter>4){
		  System.out.print(" GAME OVER  ");
		  } 
		else if(counter == 4 && secretNumber >= numPlayer1 && secretNumber >= numPlayer2) {
		  System.out.println("NO! Try Again THINK HIGHER"); 
		  } 
		else if(counter == 4 && secretNumber >= numPlayer1 && secretNumber >= numPlayer3) {
			  System.out.println("NO! Try Again THINK HIGHER"); 
			  } 
		else if(counter == 4 && secretNumber >= numPlayer2 && secretNumber >= numPlayer3) {
			  System.out.println("NO! Try Again THINK HIGHER"); 
			  } 
		else if(counter == 4 && secretNumber <= numPlayer1 && secretNumber <= numPlayer2 && secretNumber <= numPlayer3 )
		  {
			  System.out.println("No! Try Again Its LOWER ");
		  }
		else if(counter == 4 && secretNumber <= numPlayer1 && secretNumber <= numPlayer2 )
		  {
			  System.out.println("No! Try Again Its LOWER ");
		  }else if(counter == 4 && secretNumber <= numPlayer1 && secretNumber <= numPlayer3 )
		  {
			  System.out.println("No! Try Again Its LOWER ");
		  }else if(counter == 4 && secretNumber <= numPlayer2 && secretNumber <= numPlayer3 )
		  {
			  System.out.println("No! Try Again Its LOWER ");
		  }
			 if(counter==4 && secretNumber >= 1 && secretNumber <=10) {
		  System.out.println("HINT: its between 1-10");
		  } 
			 if(counter==4 && secretNumber>= 11 && secretNumber <=20) 
			 { System.out.println("HINT: its between 11-20");
		  } 
			 if(counter==4 && secretNumber >= 21 && secretNumber <=30)
			 {
		  System.out.println("HINT: its between 21-30"); 
		  }
		  
		  }
		
		  counter++;
	}

}

public class LaunchGame {

	public static void main(String[] args) {
		Umpire1 u = new Umpire1();

		u.collectSecretNum();
		u.rounds();
		u.collectPlayersGuessedNum();
		u.compare();
		u.tie();
		

	}

}
