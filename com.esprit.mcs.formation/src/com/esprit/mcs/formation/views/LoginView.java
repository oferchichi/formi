package com.esprit.mcs.formation.views;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.esprit.mcs.formation.actionlistener.LoginViewActionListener;


public class LoginView  extends JFrame{
	private JButton validerAuthentification;
	private JButton annulerAthentification;

	private JLabel loginLabel;
	private JLabel passLabel;

	private JTextField loginField;
	private JPasswordField passField;
	
	private static final long serialVersionUID = 1L;
	public LoginView() {
	    super("FOMI--Login ");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		JPanel p = (JPanel) getContentPane();
		validerAuthentification = new JButton("Login");
		validerAuthentification.setBounds(10, 100, 120, 35);
		annulerAthentification = new JButton("Annuler");
		annulerAthentification.setBounds(130, 100, 120, 35);
		loginLabel = new JLabel("Login  :");
		loginLabel.setBounds(10, 10, 135, 35);
		passLabel = new JLabel("Password :");
		passLabel.setBounds(10, 50, 135, 35);
		loginField = new JTextField();
		loginField.setBounds(80, 10, 170, 35);
		passField = new JPasswordField();
		passField.setBounds(80, 50, 170, 35);
		validerAuthentification.addActionListener(new LoginViewActionListener(this));
		annulerAthentification.addActionListener(new LoginViewActionListener(this));
		p.add(loginLabel);
		p.add(loginField);
		p.add(passLabel);
		p.add(passField);
		p.add(validerAuthentification);
		p.add(annulerAthentification);
		setSize(new Dimension(300, 200));
		setResizable(false);
		setVisible(true);
		
		// TODO Auto-generated constructor stub
	}
	public JButton getValiderAuthentification() {
		return validerAuthentification;
	}
	public void setValiderAuthentification(JButton validerAuthentification) {
		this.validerAuthentification = validerAuthentification;
	}
	public JButton getAnnulerAthentification() {
		return annulerAthentification;
	}
	public void setAnnulerAthentification(JButton annulerAthentification) {
		this.annulerAthentification = annulerAthentification;
	}
	public JLabel getLoginLabel() {
		return loginLabel;
	}
	public void setLoginLabel(JLabel loginLabel) {
		this.loginLabel = loginLabel;
	}
	public JLabel getPassLabel() {
		return passLabel;
	}
	public void setPassLabel(JLabel passLabel) {
		this.passLabel = passLabel;
	}
	public JTextField getLoginField() {
		return loginField;
	}
	public void setLoginField(JTextField loginField) {
		this.loginField = loginField;
	}
	public JPasswordField getPassField() {
		return passField;
	}
	public void setPassField(JPasswordField passField) {
		this.passField = passField;
	}
	
	


}
