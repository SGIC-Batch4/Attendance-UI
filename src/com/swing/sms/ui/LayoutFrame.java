package com.swing.sms.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class LayoutFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public LayoutFrame(String title){
		super(title);
		this.setLayout(null);
		this.setSize(300,400);
		
		
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		int h=dimension.height;
		int w=dimension.width;
		
		int fh=this.getSize().height;
		int fw=this.getSize().width;
		
		int y=(h-fh)/2;
		int x=(w-fw)/2;
		
		this.setLocation(x, y);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
