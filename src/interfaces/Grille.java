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
	
	
	public Grille(boolean ia){
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
		
		if(ia==false){
			for(int i=0;i<9;i++){
				gril.get(i).addActionListener(new MyActionListener(i, gril, this));
			}
		}
	}
	
	
	class MyActionListener implements ActionListener {
		
		private int k;
		ArrayList<JButton> gril=new ArrayList<JButton>();
		Grille frame;
		
		public MyActionListener(int k, ArrayList<JButton> gril, Grille frame){
			this.k=k;
			this.gril=gril;
			this.frame=frame;
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
				if(compt==9 && Conditions.testV(clic.getCases())[3]==-1){
					Final fin=new Final(0,false,frame);
					fin.setVisible(true);
				}
				if(Conditions.testV(clic.getCases())[3]==0){
					Final fin=new Final(1,false,frame);
					for(int i=0;i<3;i++)
						gril.get(Conditions.testV(clic.getCases())[i]).setBackground(Color.green);
					setGril(gril);
					fin.setVisible(true);
					for(int i=0;i<9;i++)
						b[i]=1;
				}
				if(Conditions.testV(clic.getCases())[3]==1){
					Final fin=new Final(2,false,frame);
					for(int i=0;i<3;i++)
						gril.get(Conditions.testV(clic.getCases())[i]).setBackground(Color.green);
					setGril(gril);
					fin.setVisible(true);
					for(int i=0;i<9;i++)
						b[i]=1;
				}
			}
		}
	}
	
	public void setGril(ArrayList<JButton> gril) {
		this.gril = gril;
	}
}
