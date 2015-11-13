package RandomButton;
// Original Castle Game was created by Alissa O'Dea. Reference to page numbers is from Java: How to Program by Paul and Harvey Deitel.
// p528-529 Fig 12.43 GridLayoutFrame - JH

import javax.swing.JFrame;
import javax.swing.JOptionPane; // imports JFrame from swing. - JH

public class GridLayoutDemo // SuperClass
{
	
	public static void main(String[] args) // main method for the entire program
	{	// JFrame prompts player to select a button - AO
		
		JOptionPane.showMessageDialog(null, "You are in the center of a massive castle. \nYou only have 3 chances left to explore your \nsurroundings before you get caught trespassing\n\nSelect a door to check out your surroundings."); // JFrame tells player to select a button - AO
	{
		GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();   // Frame to hold buttons - JH
		gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes JFrame when exit is selected
		gridLayoutFrame.setSize(300, 200); // Creates size
		gridLayoutFrame.setVisible(true); // Makes it visible to the user.

	}
}}
