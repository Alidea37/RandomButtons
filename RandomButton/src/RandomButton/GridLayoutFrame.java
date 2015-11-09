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
	private static final String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private boolean toggle = true; 				// switches between the two layouts
	private final Container container;			// frame container
	private final GridLayout gridLayout1;		// first grid layout
	private final GridLayout gridLayout2;		// second grid layout
	
	public GridLayoutFrame()		//constructor with no arguments
	{
		super("Press Red X End Game");
		gridLayout1 = new GridLayout(3, 3, 5, 5); 	// grid layout has gaps of 5 between buttons
		gridLayout2 = new GridLayout(3, 2);			// no gaps between buttons
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
		// handle button events by toggling between the two layouts. Add event to each button selection
	@Override
	public void actionPerformed(ActionEvent event)
	{
		
		if (event.getSource() == buttons[0]) // if 1 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 1!");
			LabelFrame pic = new LabelFrame();
			pic.getGraphics1();
			}
		
		if (event.getSource() == buttons[1]) // if 2 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 2!");
			LabelFrame pic = new LabelFrame();
			pic.getGraphics2();
			}
		
		if (event.getSource() == buttons[2]) // if 3 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 3!");
			LabelFrame pic = new LabelFrame();
			pic.getGraphics3();
			}
		
		if (event.getSource() == buttons[3]) // if 4 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 4!");
			//LabelFrame pic = new LabelFrame();
			//pic.getGraphics1();
			}	
		
		if (event.getSource() == buttons[4]) // if 5 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 5!");
			//LabelFrame pic = new LabelFrame();
			//pic.getGraphics1();
			}
		
		if (event.getSource() == buttons[5]) // if 6 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 6!");
			//LabelFrame pic = new LabelFrame();
			//pic.getGraphics1();
			}	
		
		if (event.getSource() == buttons[6]) // if 7 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 7!");
			//LabelFrame pic = new LabelFrame();
			//pic.getGraphics1();
			}	
		
		if (event.getSource() == buttons[7]) // if 8 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 8!");
			//LabelFrame pic = new LabelFrame();
			//pic.getGraphics1();
			}		
		
		if (event.getSource() == buttons[8]) // if 9 is selected
			{
			JOptionPane.showMessageDialog(null, "You picked door number 9!");
			//LabelFrame pic = new LabelFrame();
			//pic.getGraphics1();
			}	
		
		// Set layout based on toggle
		
		if (toggle) 
		{
			container.setLayout(gridLayout2);
		}
		else
		{
			container.setLayout(gridLayout1);
		}
		toggle =! toggle;
		container.validate();		// re-lay out container
		}
		
}
