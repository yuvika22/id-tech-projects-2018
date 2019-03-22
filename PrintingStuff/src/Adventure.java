/**

 * 
 */
	import java.util.Scanner; 
	import java.util.Random;
/**
 * @author iD Student
 *
 */
public class Adventure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random randomGenerator = new Random();
		// TODO Auto-generated method stub
		int playerLevel = 1;
		String playerName = "Horatio";
		double playerHealth = 10.0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your characters name?");
		playerName = userInput.nextLine();
		System.out.println("Welcome " +  playerName + "!");
		System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
		 System.out.println("1. Enter the Cave");
	    System.out.println("2. Run away to the safety of your warm bed");
	    int playerChoice;
        playerChoice = userInput.nextInt();
        if(playerChoice == 1) {
        	 System.out.println("You made it to the entrance of the cave.");
             playerLevel++;
             System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel);
        
             System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
             System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");
             int rockDamage;
             
             
             rockDamage = randomGenerator.nextInt(5);
           
             
             playerHealth -= rockDamage;
             
           
             System.out.println("The rocks hit you for " + rockDamage + "!");
             System.out.println("Now you have " + playerHealth + "health remaining. ");
            
          
             System.out.println("You pick yourself up from the cave floor and brush dust off your clothes. ");
             System.out.println("The cave narrows as you mak your way through a slightly larger cavern opening");
             System.out.println("Good Job!! You came across a treasure chest.");
        
             boolean hasSword = false;
             System.out.println("1. Open the chest");
             System.out.println("2. Ignore the chest. It is obviously a trap");
             playerChoice = userInput.nextInt();
             
             if(playerChoice == 1) {
            System.out.println("Uneasy after your brush with death, you slowly open the chest, and it reveals a magic sword");
            	 hasSword = true;
             }   
            
             
             for (int i = 0; i < 15; i++) { 
             System.out.println("You leave the cavern with the chest and continue your journey");
             System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
             System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
             System.out.println("You swallow hard and decide it is time to leave.");
             System.out.println("As you turn your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");
       		 } 
              
            	  
            
             
             
              int arr []= new int[5];
             
              
              arr [0]=1;
              arr [1]=2;
              arr [2]=3;
              arr [3]=4;
              arr [4]=5;
             
        
              
              
        
             } else {
           
        	 
             System.out.println(playerName + " runs home and goes to sleep.");
             System.exit(0);   
        
         }
        
    }
}

