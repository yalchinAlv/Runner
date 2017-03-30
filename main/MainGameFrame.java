package main;

import javax.swing.*;
/**
 * 
 * @author Yalchin ALIYEV
 * @version 1.0 26.03.2016
 *
 */
public class MainGameFrame extends JFrame {

	private JPanel runnerGamePanel;
	
	public MainGameFrame() {
		
		runnerGamePanel = new RunnerGamePanel();
		
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		setTitle( "Runner Game v_1.4");
		setLocation(500, 200);
		add( runnerGamePanel);
		pack();
		setResizable(false);
		setVisible( true);
		//setResizable( false);
		
	}
	
	public static void main( String[] args) {
		
		new MainGameFrame();
	}

}
