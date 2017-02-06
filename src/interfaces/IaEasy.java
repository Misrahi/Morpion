package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import jeu.Clic;
import jeu.Conditions;

@SuppressWarnings("serial")
public class IaEasy extends Grille {
	private int[] b={0,0,0,0,0,0,0,0,0};
	private int compt=0;
	private Clic clic=new Clic();
	private boolean v=false;
	
	public IaEasy(int nb){
		super(nb);
		for(int i=0;i<9;i++){
			gril.get(i).addActionListener(new MyActionListenerIA(i, gril));
		}
	}
	
	
	class MyActionListenerIA implements ActionListener {
		
		private int k;
		private int j;
		ArrayList<JButton> gril=new ArrayList<JButton>();
		Random r=new Random();
		
		public MyActionListenerIA(int k, ArrayList<JButton> gril){
			this.k=k;
			this.gril=gril;
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
				if(compt==9 && Conditions.testV(clic.getCases())==0){
					Final fin=new Final(0,true);
					setVisible(false);
					fin.setVisible(true);
					v=true;
				}
				if(Conditions.testV(clic.getCases())==1){
					Final fin=new Final(1,true);
					setVisible(false);
					fin.setVisible(true);
					v=true;
				}
		
				if(v!=true){
					do{
						j=r.nextInt(8);
					}while(b[j]==1);
					clic.setI(j);
					b[j]=1;
					gril.get(j).setText("X");
					clic.clicked(10);
					setGril(gril);				
					compt++;
					if(compt==9 && Conditions.testV(clic.getCases())==0){
						Final fin=new Final(0,true);
						setVisible(false);
						fin.setVisible(true);
					}
					if(Conditions.testV(clic.getCases())==2){
						Final fin=new Final(2,true);
						setVisible(false);
						fin.setVisible(true);
					}
				}
			}
		}
	}
}