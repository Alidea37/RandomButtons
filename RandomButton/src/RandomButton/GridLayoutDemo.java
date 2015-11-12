package RandomButton;
// p528-529 Fig 12.43 GridLayoutFrame - JH

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GridLayoutDemo
{
	
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Select a button to fix your fate."); // JFrame tells player to select a button - AO
	{
		GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();   // Frame to hold buttons - JH
		gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridLayoutFrame.setSize(300, 200);
		gridLayoutFrame.setVisible(true);

	}
}}
