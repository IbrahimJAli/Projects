

import java.awt.Color;
import javax.swing.*;

public class UI {
	Pet pet1 = new Pet();
	JFrame window;
	public JPanel bgPanel[] = new JPanel[10]; // 10 items are possible
	public JLabel bgLabel[] = new JLabel[10];

	public UI() {}

	public void createMainField() { //function to make the window itself
		// creating window for game
		window = new JFrame();
		window.setSize(810, 630);
		window.setTitle("Gatchitama");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

	}

	public void createBackground() { //function to make the window the start menu

		bgPanel[1] = new JPanel(); // initializing panel
		bgPanel[1].setBounds(0, 0, 800, 600); // size of background image
		bgPanel[1].setLayout(null);
		window.add(bgPanel[1]);// add the panel to the window

		bgLabel[1] = new JLabel();
		bgLabel[1].setBounds(0, 0, 800, 600); //create the bounds of the label
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("StartMenuBackground.png"));
		bgLabel[1].setIcon(bgIcon); //put the image onto the label
		bgPanel[1].add(bgLabel[1]); //add the label onto the panel

		JButton startButton = new JButton(); // making the start button
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(true);
		startButton.setForeground(Color.black);
		startButton.setBounds(130, 345, 230, 90);
		bgPanel[1].add(startButton);
		startButton.addActionListener(e -> switchToEggBG());
		window.add(bgPanel[1]);

		JButton exitButton = new JButton(); // making the end button
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(true);
		exitButton.setForeground(Color.black);
		exitButton.setBounds(500, 345, 230, 90);
		bgPanel[1].add(exitButton);
		exitButton.addActionListener(e -> exitGame());
		window.add(bgPanel[1]);
		window.setVisible(true);
	}

	public void switchToEggBG(){ // make the window the egg stage

		bgPanel[2] = new JPanel(); // initializing panel
		bgPanel[2].setBounds(0, 0, 800, 600); // size of background image
		bgPanel[2].setLayout(null);


		bgLabel[2] = new JLabel();
		bgLabel[2].setBounds(0, 0, 800, 600); //create the bounds of the label
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("birthStageBG.png"));
		bgLabel[2].setIcon(bgIcon); //put the image onto the label


		JButton cleanButton = new JButton(); // making the clean button
		cleanButton.setOpaque(false);
		cleanButton.setContentAreaFilled(false);
		cleanButton.setBorderPainted(false);
		cleanButton.setForeground(Color.black);
		cleanButton.setBounds(85, 20, 130, 140);
		cleanButton.addActionListener(e -> pet1.hygieneIncrease());

		bgPanel[2].add(cleanButton);
		bgPanel[2].add(bgLabel[2]); //add the label onto the panel
		window.add(bgPanel[2]);


		System.out.println("Start button has been clicked");
		bgPanel[1].setVisible(false);
		bgPanel[2].setVisible(true);
		window.setVisible(true);

	}

	public void switchToChildBG(){

		bgPanel[3] = new JPanel(); // initializing panel
		bgPanel[3].setBounds(0, 0, 800, 600); // size of background image
		bgPanel[3].setLayout(null);


		bgLabel[3] = new JLabel();
		bgLabel[3].setBounds(0, 0, 800, 600); //create the bounds of the label
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("ChildStageBG.png"));
		bgLabel[3].setIcon(bgIcon); //put the image onto the label

		JButton cleanButton = new JButton(); // making the clean button
		cleanButton.setOpaque(false);
		cleanButton.setContentAreaFilled(false);
		cleanButton.setBorderPainted(false);
		cleanButton.setForeground(Color.black);
		cleanButton.setBounds(85, 20, 130, 140);
		cleanButton.addActionListener(e -> pet1.hygieneIncrease());

		JButton hungerButton = new JButton(); // making the hungry button
		hungerButton.setOpaque(false);
		hungerButton.setContentAreaFilled(false);
		hungerButton.setBorderPainted(false);
		hungerButton.setForeground(Color.black);
		hungerButton.setBounds(345, 20, 130, 140);
		hungerButton.addActionListener(e -> pet1.hungerIncrease());

		bgPanel[3].add(cleanButton);
		bgPanel[3].add(hungerButton);
		bgPanel[3].add(bgLabel[3]); //add the label onto the panel
		window.add(bgPanel[3]);

		System.out.println("Entering the next stage");
		bgPanel[2].setVisible(false);
		bgPanel[3].setVisible(true);
		window.setVisible(true);
	}

	public void switchToAdultBG(){

		bgPanel[4] = new JPanel(); // initializing panel
		bgPanel[4].setBounds(0, 0, 800, 600); // size of background image
		bgPanel[4].setLayout(null);


		bgLabel[4] = new JLabel();
		bgLabel[4].setBounds(0, 0, 800, 600); //create the bounds of the label
		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("AdultStageBG.png"));
		bgLabel[4].setIcon(bgIcon); //put the image onto the label

		JButton cleanButton = new JButton(); // making the clean button
		cleanButton.setOpaque(false);
		cleanButton.setContentAreaFilled(false);
		cleanButton.setBorderPainted(false);
		cleanButton.setForeground(Color.black);
		cleanButton.setBounds(85, 20, 130, 140);
		cleanButton.addActionListener(e -> pet1.hygieneIncrease());

		JButton hungerButton = new JButton(); // making the hungry button
		hungerButton.setOpaque(false);
		hungerButton.setContentAreaFilled(false);
		hungerButton.setBorderPainted(false);
		hungerButton.setForeground(Color.black);
		hungerButton.setBounds(335, 20, 130, 140);
		hungerButton.addActionListener(e -> pet1.hungerIncrease());

		JButton happyButton = new JButton(); // making the happy button
		happyButton.setOpaque(false);
		happyButton.setContentAreaFilled(false);
		happyButton.setBorderPainted(false);
		happyButton.setForeground(Color.black);
		happyButton.setBounds(600, 20, 130, 140);
		happyButton.addActionListener(e -> pet1.happinessIncrease());

		bgPanel[4].add(cleanButton);
		bgPanel[4].add(hungerButton);
		bgPanel[4].add(happyButton);
		bgPanel[4].add(bgLabel[4]); //add the label onto the panel
		window.add(bgPanel[4]);

		System.out.println("Entering the next stage");
		bgPanel[3].setVisible(false);
		bgPanel[4].setVisible(true);
		window.setVisible(true);




	}

	public void exitGame(){ //function to end the game
		window.dispose();
		System.out.println("Closing the game");
		System.exit(0);
	}
}
