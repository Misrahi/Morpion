package jeu;

public class Conditions {

	public static int testV(int[] cases) {
		if     (cases[0]+cases[1]+cases[2]==3  || cases[3]+cases[4]+cases[5]==3  || cases[6]+cases[7]+cases[8]==3  || 
				cases[0]+cases[3]+cases[6]==3  || cases[1]+cases[4]+cases[7]==3  || cases[2]+cases[5]+cases[8]==3  ||
				cases[0]+cases[4]+cases[8]==3  || cases[2]+cases[4]+cases[6]==3)
			return 1;
		else if(cases[0]+cases[1]+cases[2]==30 || cases[3]+cases[4]+cases[5]==30 || cases[6]+cases[7]+cases[8]==30 || 
				cases[0]+cases[3]+cases[6]==30 || cases[1]+cases[4]+cases[7]==30 || cases[2]+cases[5]+cases[8]==30 ||
				cases[0]+cases[4]+cases[8]==30 || cases[2]+cases[4]+cases[6]==30)
			return 2;
		else
			return 0;
	}
	
}
