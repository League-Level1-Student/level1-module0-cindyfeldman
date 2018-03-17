import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneTeller implements ActionListener {
	JButton button;
	JFrame frame;
	JPanel panel;

	void showButton() {
		System.out.println("button");
		frame = new JFrame();

		panel = new JPanel();
		button = new JButton("click me");
		frame.add(panel);
		panel.add(button);
		frame.pack();
		frame.setVisible(true);

		button.addActionListener(this);
	}

	public static void main(String[] args) {
		// The program must have a window with a button that gives one of five random
		// fortunes when clicked.
		new FortuneTeller().showButton();
		// 1. Make a class, with a main method and a showButton() method. Have the
		// showButton method print "Button" to the console.

	}
	// 2. Write code in your main method, so that the showButton() method prints to
	// the console.

	// 3. In the showButton method, make a JFrame and get it to show up when you run
	// the program. Hint:

	// 4. Make a JButton and add it to the JFrame.

	// 5. When the button is clicked, use a pop-up to say, “Woohoo”.

	// a. Add an action listener to the button:

	// b. Have your class implement ActionListener [use Eclipse quick fix]

	// c. Add the unimplemented methods [use Eclipse quick fix]

	// d. Put a JOptionPane pop-up inside actionPerformed() method that says
	// "Woohoo".

	// 6. Generate a random number between 0 and 4:

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "WooHoo");
		}

		// 7. Depending on which random number, show one of the five fortunes.
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "you will trip over a rock today");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "you will have good luck for 2 years");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "you are going to eat lunch today");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "you will smile today");
		} else {
			JOptionPane.showMessageDialog(null, "you will have bad luck for a year");
		}
		// [optional] 8. Run other student's programs to receive fortunes from them.
	}
}
