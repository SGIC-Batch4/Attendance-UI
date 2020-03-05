package com.swing.sms.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.swing.sms.logic.Register;

public class MarkRegister extends LayoutFrame {

	private static final long serialVersionUID = 1L;
	JLabel lblDate;
	JTextField txtDate;
	JButton btnSubmit;
	JCheckBox[] checkBoxs;

	Register register;

	public MarkRegister(Register register) {
		super("Mark Register");
		this.register = register;
		checkBoxs = new JCheckBox[this.register.student.length];
		this.invokeComponents();
		this.invokeFuctions();
	}

	private void invokeComponents() {
		lblDate = new JLabel("Please Enter Date : ");
		lblDate.setBounds(50, 10, 200, 30);
		this.add(lblDate);

		txtDate = new JTextField();
		txtDate.setBounds(50, 50, 200, 30);
		this.add(txtDate);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(50, 300, 200, 30);
		this.add(btnSubmit);

		this.displayCombos();
	}

	public void invokeFuctions() {
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicked");
				boolean[] bools = new boolean[checkBoxs.length];

				for (int i = 0; i < checkBoxs.length; i++) {
					bools[i] = checkBoxs[i].isSelected();
				}
				register.markregister(txtDate.getText().toString(), bools);
			}
		});
	}

	public void displayCombos() {
		int top = 100;
		for (int i = 0; i < this.register.student.length; i++) {

			JCheckBox cbxReg = new JCheckBox(this.register.student[i]);
			checkBoxs[i] = cbxReg;
			cbxReg.setBounds(20, top, 150, 30);
			this.add(cbxReg);

			top = top + 40;
		}
	}

	

}
