package com.esprit.mcs.formation.views;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.esprit.mcs.formation.actionlistener.AdminViewActionListener;

public class AdminView extends JFrame {

	/**
	 * 
	 */
	private JButton lancer;
	
	private static final long serialVersionUID = 1L;
    public AdminView() {
  	  super("FOMI--BienVenu ");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		JPanel p = (JPanel) getContentPane();
		setSize(new Dimension(800, 600));
		setResizable(false);
		setVisible(true);
		lancer = new JButton("Lancer la base");
		lancer.setBounds(10, 10, 135, 35);
		lancer.addActionListener(new AdminViewActionListener(this) );
		p.add(lancer);
		
	}
	public JButton getLancer() {
		return lancer;
	}
	public void setLancer(JButton lancer) {
		this.lancer = lancer;
	}

}
