import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneTeller {
public static void main(String[] args) {
	//The program must have a window with a button that gives one of five random fortunes when clicked.


	//1. Make a class, with a main method and a showButton() method. Have the showButton method print "Button" to the console. 
new showButton().
	public void showButton(){
	System.out.println("button");

}
	//2. Write code in your main method, so that the showButton() method prints to the console. 
JFrame frame = new JFrame();
	//3. In the showButton method, make a JFrame and get it to show up when you run the program. Hint:
frame.setVisible(true);
	

	//4. Make a JButton and add it to the JFrame.

	JButton button1 = new JButton();
	frame.add(button1);

	//5. When the button is clicked, use a pop-up to say, “Woohoo”.

	JOptionPane.showMessageDialog(null, "woohoo");
	    // a. Add an action listener to the button:

	button1.addActionListener(this);

	  //   b. Have your class implement ActionListener [use Eclipse quick fix]

	   //  c. Add the unimplemented methods [use Eclipse quick fix]

	    // d. Put a JOptionPane pop-up inside actionPerformed() method that says "Woohoo".

	//6. Generate a random number between 0 and 4:

	int rand = new Random().nextInt(5);

	//7. Depending on which random number, show one of the five fortunes.


//	[optional] 8. Run other student's programs to receive fortunes from them.
}

}

