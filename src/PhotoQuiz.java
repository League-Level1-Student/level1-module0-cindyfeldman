/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {
	static JPanel panel;
	static JFrame 	quizWindow;
	public static void main(String[] args) throws Exception {
		 
		quizWindow = new JFrame();
		quizWindow.setVisible(true);
		panel = new JPanel();

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String flower = "http://kb4images.com/images/flower-image/38106359-flower-image.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component image ;
		// 3. use the "createImage()" method below to initialize your Component
image = createImage(flower);


		// 4. add the image to the quiz window


	
quizWindow.add(panel);
panel.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer =JOptionPane.showInputDialog("What type of flower is it?");
int Score = 0;

String color = "rose";
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equals(color)) {
	JOptionPane.showMessageDialog(null, "correct"+"  + 1");
	Score++;
}
else {
	System.out.println("incorrect");

}


quizWindow.remove(panel);
panel.remove(image);
Component image2;
String flowers =  "http://kb4images.com/images/flower-image/35830541-flower-image.jpg";
image2 = createImage(flowers);
panel.add(image2);
quizWindow.add(panel);
quizWindow.pack();
String colors = "white";

JOptionPane.showInputDialog("What color is the flower");
quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	if(colors.equals("white")) {
		System.out.println("correct!!");
		Score++;}
	else {
		System.out.println("incorrect");
	}
	System.out.println(Score);
	}
	
	
	

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)

		// 10. find another image and create it (might take more than one line of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





