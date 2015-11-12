package RandomButton;
// Fig 12.6 LabelFrame.java pp 473-474 - AO
// Credit to Cordell for assistance in creating JLabels 
// Credit to Delanie for assistance in creating methods for each JFrame

import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
	//LabelFrame constructor adds JLabel to JFrame - AO
	
	public Graphics getGraphics1(){ 				// create method to hold a jframe containing the witch picture
		JPanel Witch = new JPanel(); 				// creates a new JPanel
		LabelFrame pic = new LabelFrame();			// show the image
		pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 	// Closes JFrame without ending program
		pic.setSize(600, 450);
		
		final JLabel label1; // JLabel with text and Icon		
		Icon witch = new ImageIcon(getClass().getResource("witch.jpg"));
		label1 = new JLabel(); // JLabel constructor no arguments
		label1.setText("You met a witch, she turned you into a toad!");
		label1.setIcon(witch); // add icon to JLabel
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Witch.add(label1);// add label1 to JFrame	
		pic.add(Witch);
		pic.setVisible(true);	
		return null;
	}
			// create a method for the jframe containing treasure
		public Graphics getGraphics2(){ 		
			JPanel Gold = new JPanel();
			LabelFrame pic = new LabelFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(600, 450);
			
			final JLabel label2; 		// JLabel with text and Icon
			Icon gold = new ImageIcon(getClass().getResource("treasure.jpg"));
			label2 = new JLabel();		 // JLabel constructor no arguments
			label2.setText("You found the treasure!");
			label2.setIcon(gold);			 // add icon to JLabel
			label2.setHorizontalTextPosition(SwingConstants.CENTER);
			label2.setVerticalTextPosition(SwingConstants.BOTTOM);
			Gold.add(label2); 		// add label to JFrame
			pic.add(Gold);
			pic.setVisible(true);
			return null;
		}
			// create a method for jframe containing troll
		public Graphics getGraphics3(){ 		
			JPanel Troll = new JPanel();
			LabelFrame pic = new LabelFrame();
			pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			pic.setSize(600, 450);
			
			final JLabel label3; // JLabel with text and Icon
			Icon troll = new ImageIcon(getClass().getResource("troll.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("You were eaten by a troll!");
			label3.setIcon(troll); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			Troll.add(label3); // add label to JFrame
			pic.add(Troll);
			pic.setVisible(true);
			return null;
		}
		// create a method for jframe containing tower
		public Graphics getGraphics4(){ 		
				JPanel Tower = new JPanel();
				LabelFrame pic = new LabelFrame();
				pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				pic.setSize(600, 450);
					
				final JLabel label4; // JLabel with text and Icon
				Icon tower = new ImageIcon(getClass().getResource("TowerWindow.jpg"));
				label4 = new JLabel(); // JLabel constructor no arguments
				label4.setText("You jumped through the window!");
				label4.setIcon(tower); // add icon to JLabel
				label4.setHorizontalTextPosition(SwingConstants.CENTER);
				label4.setVerticalTextPosition(SwingConstants.BOTTOM);
				Tower.add(label4); // add label to JFrame
				pic.add(Tower);
				pic.setVisible(true);
				return null;
			}
				// create a method for jframe containing the dragon
				public Graphics getGraphics5(){ 		
					JPanel Dragon = new JPanel();
					LabelFrame pic = new LabelFrame();
					pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					pic.setSize(600, 450);
					
					final JLabel label5; // JLabel with text and Icon
					Icon dragon = new ImageIcon(getClass().getResource("dragon.jpg"));
					label5 = new JLabel(); // JLabel constructor no arguments
					label5.setText("You met a dragon!");
					label5.setIcon(dragon); // add icon to JLabel
					label5.setHorizontalTextPosition(SwingConstants.CENTER);
					label5.setVerticalTextPosition(SwingConstants.BOTTOM);
					Dragon.add(label5); // add label to JFrame
					pic.add(Dragon);
					pic.setVisible(true);
					return null;
				}
				// create a method for jframe containing the rats
				public Graphics getGraphics6(){ 		
					JPanel Rats = new JPanel();
					LabelFrame pic = new LabelFrame();
					pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					pic.setSize(600, 450);
					
					final JLabel label6; // JLabel with text and Icon
					Icon rats = new ImageIcon(getClass().getResource("Rats.jpg"));
					label6 = new JLabel(); // JLabel constructor no arguments
					label6.setText("You were eaten by giant rats!");
					label6.setIcon(rats); // add icon to JLabel
					label6.setHorizontalTextPosition(SwingConstants.CENTER);
					label6.setVerticalTextPosition(SwingConstants.BOTTOM);
					Rats.add(label6); // add label to JFrame
					pic.add(Rats);
					pic.setVisible(true);
					return null;
				}
				// create a method for jframe containing the Ghost
				public Graphics getGraphics7(){ 		
					JPanel Ghost = new JPanel();
					LabelFrame pic = new LabelFrame();
					pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					pic.setSize(600, 450);
					
					final JLabel label7; // JLabel with text and Icon
					Icon ghost = new ImageIcon(getClass().getResource("Ghost.jpg"));
					label7 = new JLabel(); // JLabel constructor no arguments
					label7.setText("You were killed by a ghost!");
					label7.setIcon(ghost); // add icon to JLabel
					label7.setHorizontalTextPosition(SwingConstants.CENTER);
					label7.setVerticalTextPosition(SwingConstants.BOTTOM);
					Ghost.add(label7); // add label to JFrame
					pic.add(Ghost);
					pic.setVisible(true);
					return null;
				}
				// create a method for jframe containing the Dungeon
				public Graphics getGraphics8(){ 		
					JPanel Dungeon = new JPanel();
					LabelFrame pic = new LabelFrame();
					pic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					pic.setSize(600, 450);
					
					final JLabel label8; // JLabel with text and Icon
					Icon dungeon = new ImageIcon(getClass().getResource("Dungeon.jpg"));
					label8 = new JLabel(); // JLabel constructor no arguments
					label8.setText("You were locked in the dungeon by a disgruntled Knight!");
					label8.setIcon(dungeon); // add icon to JLabel
					label8.setHorizontalTextPosition(SwingConstants.CENTER);
					label8.setVerticalTextPosition(SwingConstants.BOTTOM);
					Dungeon.add(label8); // add label to JFrame
					pic.add(Dungeon);
					pic.setVisible(true);
					return null;
				}

}
