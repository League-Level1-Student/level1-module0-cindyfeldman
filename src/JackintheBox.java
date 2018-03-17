import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackintheBox {
	JButton button;
	JFrame frame;
	JPanel panel;

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage("jackinthebox.jpg");
			panel = new JPanel();
			frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			button = new JButton("suprise");
			frame.add(button);
			frame.pack();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon("jackinthebox.jpg");
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	public static void main(String[] args) {

		// 1. Create a user interface that has a single button labeled "Surprise".
		// 2. When the user presses the button 5 times, show them a jack-in-the-box
		// using the methods below.
		// (A sample jackInTheBox.png file is provided in the default package)

		// 3. Also play a sound when the jack-in-the-box pops up using this method.
		// (A sample sound homer-woohoo.wav is provided in the default package)
		/*
		 * private void playSound(String soundFile) { try { AudioClip sound =
		 * JApplet.newAudioClip(getClass().getResource(soundFile)); sound.play(); }
		 * catch (Exception e) { e.printStackTrace(); } }
		 */

	}
}
