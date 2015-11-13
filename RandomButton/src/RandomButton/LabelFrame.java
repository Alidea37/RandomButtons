package RandomButton;
// Fig 12.6 LabelFrame.java pp 473-474 - AO
// Credit to Cordell for assistance in creating JLabels 
// Credit to Delanie for assistance in creating methods for each JFrame
// Original pictures for the images used in these JFrames were found on GoogleImages and altered in photoshop. Photo credit is cited below LabelFrame code

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
		
		final JLabel label1;                                                       // JLabel with text and Icon		
		Icon witch = new ImageIcon(getClass().getResource("witch.jpg"));
		label1 = new JLabel();                                                    
		label1.setText("You met a witch, she turned you into a toad!");
		label1.setIcon(witch);                         							   // add icon to JLabel
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Witch.add(label1);                             							  // add label1 to JFrame	
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
			
			final JLabel label2; 												// JLabel with text and Icon
			Icon gold = new ImageIcon(getClass().getResource("treasure.jpg"));
			label2 = new JLabel();											
			label2.setText("You found the treasure! But there is no way to move it.");
			label2.setIcon(gold);												 // add icon to JLabel
			label2.setHorizontalTextPosition(SwingConstants.CENTER);
			label2.setVerticalTextPosition(SwingConstants.BOTTOM);
			Gold.add(label2); 													// add label to JFrame
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
			
			final JLabel label3;                                  			   // JLabel with text and Icon
			Icon troll = new ImageIcon(getClass().getResource("troll.jpg"));
			label3 = new JLabel(); 
			label3.setText("You were eaten by a troll!");
			label3.setIcon(troll);												 // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			Troll.add(label3);													 // add label to JFrame
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
					
				final JLabel label4; 															// JLabel with text and Icon
				Icon tower = new ImageIcon(getClass().getResource("TowerWindow.jpg"));
				label4 = new JLabel(); 															// JLabel constructor no arguments
				label4.setText("You jumped through the window in an attempt to escape!");
				label4.setIcon(tower); 															// add icon to JLabel
				label4.setHorizontalTextPosition(SwingConstants.CENTER);
				label4.setVerticalTextPosition(SwingConstants.BOTTOM);
				Tower.add(label4); 																// add label to JFrame
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
					
					final JLabel label5; 														// JLabel with text and Icon
					Icon dragon = new ImageIcon(getClass().getResource("dragon.jpg"));
					label5 = new JLabel(); 														// JLabel constructor no arguments
					label5.setText("You met a dragon, he looks hungry!");
					label5.setIcon(dragon); 													// add icon to JLabel
					label5.setHorizontalTextPosition(SwingConstants.CENTER);
					label5.setVerticalTextPosition(SwingConstants.BOTTOM);
					Dragon.add(label5); 														// add label to JFrame
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
					
					final JLabel label6; 														// JLabel with text and Icon
					Icon rats = new ImageIcon(getClass().getResource("Rats.jpg"));
					label6 = new JLabel(); 														// JLabel constructor no arguments
					label6.setText("You were eaten by giant rats!");
					label6.setIcon(rats); 														// add icon to JLabel
					label6.setHorizontalTextPosition(SwingConstants.CENTER);
					label6.setVerticalTextPosition(SwingConstants.BOTTOM);
					Rats.add(label6); 															// add label to JFrame
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
					
					final JLabel label7; 													// JLabel with text and Icon
					Icon ghost = new ImageIcon(getClass().getResource("Ghost.jpg"));
					label7 = new JLabel(); 													// JLabel constructor no arguments
					label7.setText("You were killed by a ghost!");
					label7.setIcon(ghost); 													// add icon to JLabel
					label7.setHorizontalTextPosition(SwingConstants.CENTER);
					label7.setVerticalTextPosition(SwingConstants.BOTTOM);
					Ghost.add(label7); 														// add label to JFrame
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
					
					final JLabel label8; 														// JLabel with text and Icon
					Icon dungeon = new ImageIcon(getClass().getResource("Dungeon.jpg"));
					label8 = new JLabel(); 															// JLabel constructor no arguments
					label8.setText("You were locked in the dungeon by a disgruntled Knight!");
					label8.setIcon(dungeon); 														// add icon to JLabel
					label8.setHorizontalTextPosition(SwingConstants.CENTER);
					label8.setVerticalTextPosition(SwingConstants.BOTTOM);
					Dungeon.add(label8); 															// add label to JFrame
					pic.add(Dungeon);
					pic.setVisible(true);
					return null;
				}}



















// Photo credits for the image samples borrowed for image creation.

/*

www.pbs.org2048 × 1152Search by image
bat-flying

Big Brown Bat - photo by Craig Stihler

www.pinterest.com236 × 236Search by image
Plastic Black Rat

www.dollartree.com210 × 210Search by image
Plastic Squeaking Rats

www.amazon.com170 × 250Search by image
6" Plastic Rat

Free Texture - medieval black stones floor 1 - Medieval Pavement ...
www.lughertexture.com3500 × 2500Search by image
Download

nationalzoo.si.edu190 × 158Search by image
Chinese Water Dragon

Pro FX Fangs Gremlin Demon Veneer Teeth Dental Halloween Costume ...
www.theholidaystore.com

clickandlol.info900 × 2189Search by image
Medieval Knight

commons.wikimedia.org3888 × 2592Search by image
File:Rolling hills leading into the Piatra Craiului Mountains.jpg

imagegator.net400 × 289Search by image
Falling hazard sign images

Stone Texture cobblestone wall flag rock masonry grey large photo.jpg
www.texturex.com3414 × 5140Search by image

Old Female Witch - Free Halloween Vector Clipart Illustration
free.clipartof.com1072 × 1338Search by image

Giant Marine Toad for Sale | Reptiles for Sale
www.backwaterreptiles.com500 × 375Search by image

Free Toad Wallpaper download - Animals Town
www.animalstown.com1024 × 768Search by image

Toad Venom exposure | Jersey Village Vets Ltd
www.jerseyvets.co.uk1260 × 1040Search by image

Door-Dungeon Photo by kscountrygirl | Photobucket
Do You Know Where Your Association's Treasure Chest Is? | DSK ...
dsksolutions.com400 × 400Search by image

journaling4faith.com2062 × 2384Search by image
treasure chest

**/
