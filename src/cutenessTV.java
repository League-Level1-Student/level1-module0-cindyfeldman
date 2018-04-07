import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
public static void main(String[] args) {
	new cutenessTV().creatUI();}

JButton button1 = new JButton("duck");
	JButton button2 = new JButton("frog");
	JButton button3 = new JButton("fluffy unicorn");
	JPanel panel= new JPanel();
	JFrame frame = new JFrame();
	
	

	private void creatUI() {
		frame.add(panel);
		frame.setVisible(true);
		button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
}
	//1. Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever. 
	void showDucks() {
	     playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
	     playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
	     playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.equals(button1)) {
			showDucks();
		}
		else if(buttonPressed.equals(button2)) {
			showFrog();
		}
		else {
			showFluffyUnicorns();
		}
	}
}
