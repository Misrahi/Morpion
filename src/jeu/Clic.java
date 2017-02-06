package jeu;

public class Clic {
	private int i;
	private int[] cases=new int[9];
	
	public Clic(){		
	}
	
	public void clicked(int c){
		cases[i]=c;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int[] getCases() {
		return cases;
	}
}
