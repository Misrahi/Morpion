package interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import jeu.Clic;
import jeu.Conditions;

@SuppressWarnings("serial")
public class IaMedium extends Grille {
	private int[] b={0,0,0,0,0,0,0,0,0};
	private int compt=0;
	private Clic clic=new Clic();
	private boolean v=false;
	
	public IaMedium(boolean ia){
		super(ia);
		for(int i=0;i<9;i++){
			gril.get(i).addActionListener(new MyActionListenerIA(i, gril,this));
		}
	}
	
	
	class MyActionListenerIA implements ActionListener {
		
		private int k;
		private int j;
		ArrayList<JButton> gril=new ArrayList<JButton>();
		Random r=new Random();
		Grille frame;
		
		public MyActionListenerIA(int k, ArrayList<JButton> gril,Grille frame){
			this.k=k;
			this.gril=gril;
			this.frame=frame;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (b[k]==0){
				clic.setI(k);
				b[k]=1;
				gril.get(k).setText("O");
				clic.clicked(1);
				setGril(gril);				
				compt++;
				if(compt==9 && Conditions.testV(clic.getCases())[3]==-1){
					Final fin=new Final(0,true,frame);
					fin.setVisible(true);
					v=true;
				}
				if(Conditions.testV(clic.getCases())[3]==0){
					Final fin=new Final(1,true,frame);
					for(int i=0;i<3;i++)
						gril.get(Conditions.testV(clic.getCases())[i]).setBackground(Color.green);
					setGril(gril);
					fin.setVisible(true);
					v=true;
				}
		
				if(v!=true){
					if(Conditions.testE(clic.getCases())!=-1){
						j=Conditions.testE(clic.getCases());
					}else{
						do{
							j=r.nextInt(8);
						}while(b[j]==1);	
					}
					clic.setI(j);
					b[j]=1;
					gril.get(j).setText("X");
					clic.clicked(10);
					setGril(gril);				
					compt++;
					if(compt==9 && Conditions.testV(clic.getCases())[3]==-1){
						Final fin=new Final(0,true,frame);
						setVisible(false);
						fin.setVisible(true);
					}
					if(Conditions.testV(clic.getCases())[3]==1){
						Final fin=new Final(2,true,frame);
						for(int i=0;i<3;i++)
							gril.get(Conditions.testV(clic.getCases())[i]).setBackground(Color.red);
						setGril(gril);
						for(int i=0;i<9;i++)
							b[i]=1;
						fin.setVisible(true);
					}
				}
			}
		}
	}
}