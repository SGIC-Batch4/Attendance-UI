package com.swing.sms;

import javax.swing.SwingUtilities;

import com.swing.sms.ui.Menu;

public class AppSwingSMS {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){

	
			public void run() {
				new Menu();
				
			}
			
		});

	}

}
