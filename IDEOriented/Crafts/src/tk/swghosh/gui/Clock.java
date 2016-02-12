package tk.swghosh.gui;

import javax.swing.*;
import java.util.*;
import java.awt.Font;

public class Clock {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Clock();
	}

	/**
	 * Create the application.
	 */
	public Clock() {
		init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		frame = new JFrame("Clock");
		frame.setBounds(100, 100, 900, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel time = new JLabel("Test");
		time.setFont(new Font("Segoe UI Light", Font.PLAIN, 50));
		time.setHorizontalAlignment(SwingConstants.CENTER);
		time.setBounds(100, 70, 775, 150);
		frame.getContentPane().add(time);
		
		JLabel head = new JLabel("System Time");
		head.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		head.setBounds(10, 10, 300, 50);
		frame.getContentPane().add(head);
		
		while(true) {
            time.setText(new Date().toString());
		}
	}
}
