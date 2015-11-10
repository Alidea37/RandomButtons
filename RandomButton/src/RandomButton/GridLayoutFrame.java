package RandomButton;
//Fig 12.43 GridLayout frame p.528
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
 

public class GridLayoutFrame extends JFrame implements ActionListener 
{
	private final JButton[] buttons; // create array of buttons
	private static final String[] names = {"one", "two", "three", "four", "five", "End Game"};
	//private boolean toggle = true; 				// switches between the two layouts
	private final Container container;			// frame container
	private final GridLayout gridLayout1;		// first grid layout
	
	private int countgame = 0;
	
	
	public GridLayoutFrame()		//constructor with no arguments
	{
		super("Press Red X End Game");
		gridLayout1 = new GridLayout(3, 3, 5, 5); 	// grid layout has gaps of 5 between buttons
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		
		for (int count = 0; count < names.length; count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);		// adds buttons to jframe
		}
	}
		// handle button events. Add event to each button selection
	@Override
	public void actionPerformed(ActionEvent event)
	{
		
		if (event.getSource() == buttons[0]) // if 1 is selected
			{if (countgame < 3){
			countgame = countgame + 1; 	// counts the number of loops
			System.out.println("Number of chances used: " + countgame);// prints the number of loops
			JOptionPane.showMessageDialog(null, "You picked door number 1!");
			LabelFrame pic = new LabelFrame();
			pic.getGraphics1();
		}
			
				else
					{
					JOptionPane.showMessageDialog(null, "You have run out of chances. The game is over.");
					System.exit(0);
					}}

		if (event.getSource() == buttons[1]) // if 2 is selected
				{if (countgame < 3){
				countgame = countgame + 1; 	// counts the number of loops
				System.out.println("Number of chances used: " + countgame);// prints the number of loops
				JOptionPane.showMessageDialog(null, "You picked door number 2!");
				LabelFrame pic = new LabelFrame();
				pic.getGraphics2();
				}
		
				else
					{
					JOptionPane.showMessageDialog(null, "You have run out of chances. The game is over.");
					System.exit(0);
					}}
		
		if (event.getSource() == buttons[2]) // if 3 is selected
				{if (countgame < 3){
				countgame = countgame + 1; 	// counts the number of loops
				System.out.println("Number of chances used: " + countgame);// prints the number of loops
				JOptionPane.showMessageDialog(null, "You picked door number 3!");
				LabelFrame pic = new LabelFrame();
				pic.getGraphics3();
				}
			
			else
				{
				JOptionPane.showMessageDialog(null, "You have run out of chances. The game is over.");
				System.exit(0);
				}}	
		
		if (event.getSource() == buttons[3]) // if 3 is selected
				{if (countgame < 3){
				countgame = countgame + 1; 	// counts the number of loops
				System.out.println("Number of chances used: " + countgame);// prints the number of loops
				JOptionPane.showMessageDialog(null, "You picked door number 4!");
				LabelFrame pic = new LabelFrame();
				pic.getGraphics4();}
			
			else
				{
				JOptionPane.showMessageDialog(null, "You have run out of chances. The game is over.");
				System.exit(0);
				}}	
		
		if (event.getSource() == buttons[4]) // if 3 is selected
				{if (countgame < 3){
				countgame = countgame + 1; // counts the number of loops
				System.out.println("Number of chances used: " + countgame);// prints the number of loops
				JOptionPane.showMessageDialog(null, "You picked door number 5!");
				LabelFrame pic = new LabelFrame();
				pic.getGraphics5();}
				
			else
				{
				JOptionPane.showMessageDialog(null, "You have run out of chances. The game is over.");
				System.exit(0);
				}}	
		
		else if(event.getSource() == buttons[5])
		{
			JOptionPane.showMessageDialog(null, "The game is over.");
			System.exit(EXIT_ON_CLOSE);
		}
	
	{// Set layout
					
		container.setLayout(gridLayout1);
	}
	}}
