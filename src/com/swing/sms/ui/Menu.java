package com.swing.sms.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.swing.sms.logic.Register;

public class Menu extends LayoutFrame {

	private static final long serialVersionUID = 1L;

	JButton btnAddStudent;
	JButton btnMarkRegister;
	JButton btnViewRegister;
	
	Register register;

	public Menu() {
		super("Menu");
		register=new Register();
		this.invokeComponents();
		this.invokeFunctions();

	}

	private void invokeComponents() {
		btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBounds(50, 100, 200, 50);
		this.add(btnAddStudent);

		btnMarkRegister = new JButton("Mark Register");
		btnMarkRegister.setBounds(50, 200, 200, 50);
		this.add(btnMarkRegister);

		btnViewRegister = new JButton("View Register");
		btnViewRegister.setBounds(50, 300, 200, 50);
		this.add(btnViewRegister);
	}

	private void invokeFunctions() {
		btnAddStudent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AddStudent();

			}
		});

		btnMarkRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				new MarkRegister(register);

			}
		});
		
		btnViewRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				register.printRegister();

			}
		});

	}
}
