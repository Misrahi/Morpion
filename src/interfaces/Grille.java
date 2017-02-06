package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import jeu.Clic;
import jeu.Conditions;

@SuppressWarnings("serial")
public class Grille extends JFrame {
	private int[] b={0,0,0,0,0,0,0,0,0};
	private boolean tour=true;
	private int compt=0;
	ArrayList<JButton> gril;
	private Clic clic=new Clic();
	
	
	public Grille(int nb){
		setSize(405,428);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Morpion");
		setResizable(false);
		setLocationRelativeTo(null);
		

		setLayout(new GridLayout(3,3));
		
		Font f=new Font("DejaVu Sans",Font.PLAIN,80);
		this.gril=new ArrayList<JButton>();
		for(int i=0;i<9;i++){
			gril.add(new JButton(""));
			gril.get(i).setFont(f);
			gril.get(i).setBackground(Color.white);
			add(gril.get(i));
		}
		
		if(nb==0){
			for(int i=0;i<9;i++){
				gril.get(i).addActionListener(new MyActionListener(i, gril));
			}
		}
	}
	
	
	class MyActionListener implements ActionListener {
		
		private int k;
		ArrayList<JButton> gril=new ArrayList<JButton>();
		
		public MyActionListener(int k, ArrayList<JButton> gril){
			this.k=k;
			this.gril=gril;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (b[k]==0){
				clic.setI(k);
				b[k]=1;
				if(tour==true){
					gril.get(k).setText("O");
					tour=false;
					clic.clicked(1);
				}else{
					gril.get(k).setText("X");
					tour=true;
					clic.clicked(10);
				}
				setGril(gril);
				
				compt++;
				if(compt==9 && Conditions.testV(clic.getCases())==0){
					Final fin=new Final(0,false);
					setVisible(false);
					fin.setVisible(true);
				}
				if(Conditions.testV(clic.getCases())==1){
					Final fin=new Final(1,false);
					setVisible(false);
					fin.setVisible(true);
				}
				if(Conditions.testV(clic.getCases())==2){
					Final fin=new Final(2,false);
					setVisible(false);
					fin.setVisible(true);
				}
			}
		}
	}
	
	public void setGril(ArrayList<JButton> gril) {
		this.gril = gril;
	}
}
