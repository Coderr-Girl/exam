import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	final static int width = 500;
	final static int height = 500;
	Star[] stars = new Star[100];

	Timer t= new Timer(700, this);
	
	public Board() {
		super();

		setBackground(Color.black);
		setPreferredSize(new Dimension(width, height));
		setFocusable(false);
	}

	protected void paintComponent(Graphics a) {
		super.paintComponent(a);
		a.setColor(Color.white);
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new Star();
			
			// Double sx = Map(stars[i].x / stars[i].z, 0, 1, 0, width);
			
			a.fillOval(stars[i].x, stars[i].y, 8, 8);
			t.start();
		}
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}