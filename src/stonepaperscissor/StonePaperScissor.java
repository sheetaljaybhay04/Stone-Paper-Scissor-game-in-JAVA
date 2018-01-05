
package stonepaperscissor;

import java.util.*;

enum Select {
	STONE, PAPER, SCISSOR;
}

public class StonePaperScissor {

    static Select player, computer;
    static int tie, pw, cw, count;
	
	public static void main(String args[])
	{
		System.out.println("\n>>> ||| STONE-PAPER-SCISSOR GAME IN JAVA ||| <<<\n\n");	
		Random r = new Random();
		
		int option=0;
		do {
			computer=Select.values()[r.nextInt(3)];
			
			try {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("\nYOUR TURN:\n\nSelect an option:\n1. STONE\n2. PAPER\n3. SCISSOR\n4. EXIT\n");
                            option=sc.nextInt();
                        }
                        catch(Exception e) {
                            System.out.println("Invalid option");
                            option=0;
                            continue;
                        }
			switch(option)
			{
				case 1: 	player=Select.values()[0];
					break;
				case 2: 	player=Select.values()[1];
					break;
				case 3: 	player=Select.values()[2];
					break;
				case 4: 	continue;
				default:	System.out.println("Invalid option");
                                                continue;
			}
			System.out.println("\nYou selected\t\t: "+player+"\nComputer selected\t: "+computer+"\n");
			if(player==computer)		
				tie++;
			else if(((player==Select.STONE)&&(computer==Select.SCISSOR))||((player==Select.PAPER)&&(computer==Select.STONE))||((player==Select.SCISSOR)&&(computer==Select.PAPER)))
				pw++;
			else if(((computer==Select.STONE)&&(player==Select.SCISSOR))||((computer==Select.PAPER)&&(player==Select.STONE))||((computer==Select.SCISSOR)&&(player==Select.PAPER)))
				cw++;
			count++;
			
			System.out.println("\n>>>  RESULTS OF ROUND "+count+"  <<<\n\nYour Score\t\t: "+pw+"\nComputer's Score\t: "+cw+"\nTie\t\t\t: "+tie+"\n");
			
		}while(option!=4);	
		System.out.println("\n>>>>>  FINAL SCORE  <<<<<\n\nYOU\t\t: "+pw+"\nCOMPUTER\t: "+cw+"\nTIE\t\t: "+tie);	
		if(pw>cw)           System.out.println("\nYOU WON THE GAME!!!\n");
		else if(cw>pw)      System.out.println("\nCOMPUTER WON THE GAME!!!\n");
		else                System.out.println("\nIT'S A TIE!!!\n");	
	}   

    
}
