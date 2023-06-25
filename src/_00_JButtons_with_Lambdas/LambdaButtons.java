package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		ActionListener act1 = (a) -> {
			String input1 = JOptionPane.showInputDialog("Give me a number");
			String input2 = JOptionPane.showInputDialog("Give me ANOTHER number");
			int result = Integer.parseInt(input1) + Integer.parseInt(input2);
			JOptionPane.showMessageDialog(null, "The sum of the numbers is "+result);;
		};
		ActionListener act2 = (a) -> {
			Random ran = new Random();
			String range = JOptionPane.showInputDialog("give me a range");
			int random = ran.nextInt(Integer.parseInt(range));
			JOptionPane.showMessageDialog(null, "a random number is "+random);
		};
		ActionListener act3 = (a) -> {
			JOptionPane.showMessageDialog(null, "What do you get if you mix a mouse and a dog?\n (WARNING: THIS ONE IS A KNEE SLAPPER)");
			JOptionPane.showMessageDialog(null, "A DOG MOUSE HYBRID!!!!");
			};
		addNumbers.addActionListener(act1);
		randNumber.addActionListener(act2);
		tellAJoke.addActionListener(act3);
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}


	
}
