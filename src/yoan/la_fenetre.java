package yoan;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class la_fenetre extends JFrame {

int compteur_click =0;
int compteur_joueur = 1;
JButton btnNewGame;
JButton btn1;
JButton btn2;
JButton btn3;
JButton btn4;
JButton btn5;
JButton btn6;
JButton btn7;
JButton btn8;
JButton btn9;
JPanel panel;
	
	public la_fenetre() {
		//initialisation fenetre
		initialize();	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 307, 355);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 289, 313);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		panel.add(menuBar);
		btnNewGame = new JButton("New game");
		menuBar.add(btnNewGame);
		
		btn1 = new JButton("");
		btn1.setBounds(10, 32, 89, 89);
		panel.add(btn1);		
		
		btn2 = new JButton("");
		btn2.setBounds(99, 32, 89, 89);
		panel.add(btn2);
		
		btn3 = new JButton("");
		btn3.setBounds(190, 32, 89, 89);
		panel.add(btn3);
		
		btn4 = new JButton("");
		btn4.setBounds(10, 123, 89, 89);
		panel.add(btn4);
		
		btn5 = new JButton("");
		btn5.setBounds(99, 123, 89, 89);
		panel.add(btn5);
		
		btn6 = new JButton("");
		btn6.setBounds(190, 123, 89, 89);
		panel.add(btn6);
		
		btn7 = new JButton("");
		btn7.setBounds(10, 214, 89, 89);
		panel.add(btn7);
		
		btn8 = new JButton("");
		btn8.setBounds(99, 214, 89, 89);
		panel.add(btn8);
		
		btn9 = new JButton("");
		btn9.setBounds(190, 214, 89, 89);
		panel.add(btn9);
		
		// Evenements boutons
		btn1.addMouseListener(new evenements_souris());
		btn2.addMouseListener(new evenements_souris());
		btn3.addMouseListener(new evenements_souris());
		btn4.addMouseListener(new evenements_souris());
		btn5.addMouseListener(new evenements_souris());
		btn6.addMouseListener(new evenements_souris());
		btn7.addMouseListener(new evenements_souris());
		btn8.addMouseListener(new evenements_souris());
		btn9.addMouseListener(new evenements_souris());
		btnNewGame.addActionListener(new Evenements_boutons());
		
		
		
	}
	
	public class evenements_souris implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		compteur_click++;	
		
		if (compteur_joueur == 1)
		
		{	
			//if(compteur_click  < 10)
				{
					System.out.println("joueur 1");
					
					if(e.getSource()==btn1) btn1.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn2) btn2.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn3) btn3.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn4) btn4.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn5) btn5.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn6) btn6.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn7) btn7.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn8) btn8.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					if(e.getSource()==btn9) btn9.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/croix.png")));
					
					
					
				}
		compteur_joueur = 2;
		}
		
		else
			
		{
			//if(compteur_click  < 10)
			{
					System.out.println("joueur 2");
					if(e.getSource()==btn1) btn1.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn2) btn2.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn3) btn3.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn4) btn4.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn5) btn5.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn6) btn6.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn7) btn7.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn8) btn8.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
					if(e.getSource()==btn9) btn9.setIcon(new ImageIcon(la_fenetre.class.getResource("/yoan/icone/rond.png")));
			}
		compteur_joueur=1;
		}
		
		
												}
	

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	

	
	public class Evenements_boutons implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource()==btnNewGame) 
				btn1.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn2.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn3.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn4.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn5.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn6.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn7.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn8.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
				btn9.setIcon(new ImageIcon(la_fenetre.class.getResource("")));
		}
		
	}
	
		
	
	
}
