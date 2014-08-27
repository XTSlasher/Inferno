package xtslasher.inferno.main;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Window() {
		initStartup();
	}
	
	private void initStartup() {
		add(new ViewableScreen());
		
		setSize(800, 600);
		setTitle("Mr. Nance's Inferno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Window ex = new Window();
				ex.setVisible(true);
			}
		});
	}
}
