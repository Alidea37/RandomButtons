package RandomButton;
//Fig 12.43 GridLayout frame p.528 - JH
// Credit to Delanie for assitance with methods calling JFrame 
// Credit to Mr. Marshall for assistance in counter

// All if these items are being imported to be used throughout this class
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.util.Random;


public class GridLayoutFrame extends JFrame implements ActionListener // an inheritance. It also uses an actionlistener - JH
{
	private final JButton[] buttons; // create array of buttons - JH
	private static final String[] names = {"Door 1", "Door 2", "Door 3", "Door 4", "Door 5", "Door 6", "Door 7", "Door 8", "End Game"}; // - JH
	private final Container container;			// frame container - JH
	private final GridLayout gridLayout1;		// grid layout - JH
	
	private int countgame = 0; // Count starts at zero - AO
	
	Random random = new Random();			//Random number generator for the pictures. -JH
	
	public GridLayoutFrame()		//constructor with no arguments - JH
	{
		super("Select a Button");
		gridLayout1 = new GridLayout(3, 3, 5, 5); 	// grid layout has gaps of 5 between buttons - JH
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		
		for (int count = 0; count < names.length; count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);		// adds buttons to jframe - JH
		}
	}
		// handle button events. Add event to each button selection - JH
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		int randomValue = random.nextInt(7);
		
		if (event.getSource() == buttons[0]) // if 1 is selected - JH
				{if (countgame < 3){		// If the counter is less than 3 run game -AO
					countgame = countgame + 1; 	// counts the number of loops  - Assistance from Professor Marshall on where the counter should be located
					System.out.println("Number of chances used: " + countgame);
					JOptionPane.showMessageDialog(null, "You picked door number 1!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics1();}
					switch (randomValue) // Switch case statements randomizes which picture is presented  - idea from Professor Marshall - JH
			{
				case 0: {pic.getGraphics1(); break;}
				case 1: {pic.getGraphics2(); break;}
				case 2: {pic.getGraphics3(); break;}
				case 3: {pic.getGraphics4(); break;}
				case 4: {pic.getGraphics5(); break;}
				case 5: {pic.getGraphics6(); break;}
				case 6: {pic.getGraphics7(); break;}
				case 7: {pic.getGraphics8(); break;}		
		}}
			
				else  
					{
					JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
					System.exit(0);
					}}

		if (event.getSource() == buttons[1]) // if 2 is selected
				{if (countgame < 3){
					countgame = countgame + 1; 	
					System.out.println("Number of chances used: " + countgame);// prints the number of loops
					JOptionPane.showMessageDialog(null, "You picked door number 2!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics2();}	
					switch (randomValue)
				{
					case 0: {pic.getGraphics1(); break;}
					case 1: {pic.getGraphics2(); break;}
					case 2: {pic.getGraphics3(); break;}
					case 3: {pic.getGraphics4(); break;}
					case 4: {pic.getGraphics5(); break;}
					case 5: {pic.getGraphics6(); break;}
					case 6: {pic.getGraphics7(); break;}
					case 7: {pic.getGraphics8(); break;}
			}}
		
				else
					{
					JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
					System.exit(0);
					}}
		
		if (event.getSource() == buttons[2]) // if 3 is selected
				{if (countgame < 3){
					countgame = countgame + 1; 	// counts the number of loops
					System.out.println("Number of chances used: " + countgame);// prints the number of loops
					JOptionPane.showMessageDialog(null, "You picked door number 3!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics3();}	
					switch (randomValue)  
				{
					case 0: {pic.getGraphics1(); break;}
					case 1: {pic.getGraphics2(); break;}
					case 2: {pic.getGraphics3(); break;}
					case 3: {pic.getGraphics4(); break;}
					case 4: {pic.getGraphics5(); break;}
					case 5: {pic.getGraphics6(); break;}
					case 6: {pic.getGraphics7(); break;}
					case 7: {pic.getGraphics8(); break;}
					
			}}
			
			else
				{
				JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
				System.exit(0);
				}}	
		
		if (event.getSource() == buttons[3]) // if 3 is selected
				{if (countgame < 3){
					countgame = countgame + 1; 	// counts the number of loops
					System.out.println("Number of chances used: " + countgame);// prints the number of loops
					JOptionPane.showMessageDialog(null, "You picked door number 4!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics4();}	
					switch (randomValue)
				{
					case 0: {pic.getGraphics1(); break;}
					case 1: {pic.getGraphics2(); break;}
					case 2: {pic.getGraphics3(); break;}
					case 3: {pic.getGraphics4(); break;}
					case 4: {pic.getGraphics5(); break;}
					case 5: {pic.getGraphics6(); break;}
					case 6: {pic.getGraphics7(); break;}
					case 7: {pic.getGraphics8(); break;}
			}}
			
			else
				{
				JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
				System.exit(0);
				}}	
		
		if (event.getSource() == buttons[4]) // if 3 is selected
				{if (countgame < 3){
					countgame = countgame + 1; // counts the number of loops
					System.out.println("Number of chances used: " + countgame);// prints the number of loops
					JOptionPane.showMessageDialog(null, "You picked door number 5!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics5();}	
					switch (randomValue) 
				{
					case 0: {pic.getGraphics1(); break;}
					case 1: {pic.getGraphics2(); break;}
					case 2: {pic.getGraphics3(); break;}
					case 3: {pic.getGraphics4(); break;}
					case 4: {pic.getGraphics5(); break;}
					case 5: {pic.getGraphics6(); break;}
					case 6: {pic.getGraphics7(); break;}
					case 7: {pic.getGraphics8(); break;}
			}}
				
			else
				{
				JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
				System.exit(0);
				}}	
		
		if (event.getSource() == buttons[5]) // if 3 is selected
				{if (countgame < 3){
					countgame = countgame + 1; 	// counts the number of loops
					System.out.println("Number of chances used: " + countgame);// prints the number of loops
					JOptionPane.showMessageDialog(null, "You picked door number 6!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics6();}	
					switch (randomValue)
				{
					case 0: {pic.getGraphics1(); break;}
					case 1: {pic.getGraphics2(); break;}
					case 2: {pic.getGraphics3(); break;}
					case 3: {pic.getGraphics4(); break;}
					case 4: {pic.getGraphics5(); break;}
					case 5: {pic.getGraphics6(); break;}
					case 6: {pic.getGraphics7(); break;}
					case 7: {pic.getGraphics8(); break;}
					
				}}
	
				else
					{
					JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
					System.exit(0);
					}}	

		if (event.getSource() == buttons[6]) // if 3 is selected
				{if (countgame < 3){
					countgame = countgame + 1; 	// counts the number of loops
					System.out.println("Number of chances used: " + countgame);// prints the number of loops
					JOptionPane.showMessageDialog(null, "You picked door number 7!");
					LabelFrame pic = new LabelFrame();
					//pic.getGraphics7();}	
					switch (randomValue)
					{
						case 0: {pic.getGraphics1(); break;}
						case 1: {pic.getGraphics2(); break;}
						case 2: {pic.getGraphics3(); break;}
						case 3: {pic.getGraphics4(); break;}
						case 4: {pic.getGraphics5(); break;}
						case 5: {pic.getGraphics6(); break;}
						case 6: {pic.getGraphics7(); break;}
						case 7: {pic.getGraphics8(); break;}
					}}
	
				else
					{
					JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
					System.exit(0);
					}}	

		if (event.getSource() == buttons[7]) // if 3 is selected
			{if (countgame < 3){
				countgame = countgame + 1; // counts the number of loops
				System.out.println("Number of chances used: " + countgame);// prints the number of loops
				JOptionPane.showMessageDialog(null, "You picked door number 8!");
				LabelFrame pic = new LabelFrame();
				//pic.getGraphics8();}	
				switch (randomValue)
				{
					case 0: {pic.getGraphics1(); break;}
					case 1: {pic.getGraphics2(); break;}
					case 2: {pic.getGraphics3(); break;}
					case 3: {pic.getGraphics4(); break;}
					case 4: {pic.getGraphics5(); break;}
					case 5: {pic.getGraphics6(); break;}
					case 6: {pic.getGraphics7(); break;}
					case 7: {pic.getGraphics8(); break;}	
				}}
		
			else
				{
				JOptionPane.showMessageDialog(null, "You have been caught. The game is over.");
				System.exit(0);
				}}	
		
	
					else if(event.getSource() == buttons[8])
				{
						JOptionPane.showMessageDialog(null, "The game is over. You did not escape.");
						System.exit(EXIT_ON_CLOSE);
				}
	
	{// Set layout
					
		container.setLayout(gridLayout1);
	}
	}}
