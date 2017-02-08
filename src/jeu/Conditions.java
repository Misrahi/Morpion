package jeu;

public class Conditions {

	public static int[] testV(int[] cases) {
		if  (cases[0]+cases[1]+cases[2]==3){
			int[] v={0,1,2,0};
			return v;
		}else if	(cases[3]+cases[4]+cases[5]==3){
			int[] v={3,4,5,0};
			return v;
		}else if	(cases[6]+cases[7]+cases[8]==3){
			int[] v={6,7,8,0};
			return v;
		}else if	(cases[0]+cases[3]+cases[6]==3){
			int[] v={0,3,6,0};
			return v;
		}else if	(cases[1]+cases[4]+cases[7]==3){
			int[] v={1,4,7,0};
			return v;
		}else if	(cases[2]+cases[5]+cases[8]==3){
			int[] v={2,5,8,0};
			return v;
		}else if	(cases[0]+cases[4]+cases[8]==3){
			int[] v={0,4,8,0};
			return v;
		}else if	(cases[2]+cases[4]+cases[6]==3){
			int[] v={2,4,6,0};
			return v;
		}else if    (cases[0]+cases[1]+cases[2]==30){
			int[] v={0,1,2,1};
			return v;
		}else if	(cases[3]+cases[4]+cases[5]==30){
			int[] v={3,4,5,1};
			return v;
		}else if	(cases[6]+cases[7]+cases[8]==30){
			int[] v={6,7,8,1};
			return v;
		}else if	(cases[0]+cases[3]+cases[6]==30){
			int[] v={0,3,6,1};
			return v;
		}else if	(cases[1]+cases[4]+cases[7]==30){
			int[] v={1,4,7,1};
			return v;
		}else if	(cases[2]+cases[5]+cases[8]==30){
			int[] v={2,5,8,1};
			return v;
		}else if	(cases[0]+cases[4]+cases[8]==30){
			int[] v={0,4,8,1};
			return v;
		}else if	(cases[2]+cases[4]+cases[6]==30){
			int[] v={2,4,6,1};
			return v;
		}else {
			int[] v={0,0,0,-1};
			return v;
		}
	}
	
	public static int testE(int[] cases){
		if  (cases[0]+cases[1]+cases[2]==2){
			if(cases[0]==0)
				return 0;
			else if(cases[1]==0)
				return 1;
			else
				return 2;
		}else if	(cases[3]+cases[4]+cases[5]==2){
			if(cases[3]==0)
				return 3;
			else if(cases[4]==0)
				return 4;
			else
				return 5;
		}else if	(cases[6]+cases[7]+cases[8]==2){
			if(cases[6]==0)
				return 6;
			else if(cases[7]==0)
				return 7;
			else
				return 8;
		}else if	(cases[0]+cases[3]+cases[6]==2){
			if(cases[0]==0)
				return 0;
			else if(cases[3]==0)
				return 3;
			else
				return 6;
		}else if	(cases[1]+cases[4]+cases[7]==2){
			if(cases[1]==0)
				return 1;
			else if(cases[4]==0)
				return 4;
			else
				return 7;
		}else if	(cases[2]+cases[5]+cases[8]==2){
			if(cases[2]==0)
				return 2;
			else if(cases[5]==0)
				return 5;
			else
				return 8;
		}else if	(cases[0]+cases[4]+cases[8]==2){
			if(cases[0]==0)
				return 0;
			else if(cases[4]==0)
				return 4;
			else
				return 8;
		}else if	(cases[2]+cases[4]+cases[6]==2){
			if(cases[2]==0)
				return 2;
			else if(cases[4]==0)
				return 4;
			else
				return 6;
		}else {
			return -1;
		}
	}

	public static int testW(int[] cases) {
		if  (cases[0]+cases[1]+cases[2]==20){
			if(cases[0]==0)
				return 0;
			else if(cases[1]==0)
				return 1;
			else
				return 2;
		}else if	(cases[3]+cases[4]+cases[5]==20){
			if(cases[3]==0)
				return 3;
			else if(cases[4]==0)
				return 4;
			else
				return 5;
		}else if	(cases[6]+cases[7]+cases[8]==20){
			if(cases[6]==0)
				return 6;
			else if(cases[7]==0)
				return 7;
			else
				return 8;
		}else if	(cases[0]+cases[3]+cases[6]==20){
			if(cases[0]==0)
				return 0;
			else if(cases[3]==0)
				return 3;
			else
				return 6;
		}else if	(cases[1]+cases[4]+cases[7]==20){
			if(cases[1]==0)
				return 1;
			else if(cases[4]==0)
				return 4;
			else
				return 7;
		}else if	(cases[2]+cases[5]+cases[8]==20){
			if(cases[2]==0)
				return 2;
			else if(cases[5]==0)
				return 5;
			else
				return 8;
		}else if	(cases[0]+cases[4]+cases[8]==20){
			if(cases[0]==0)
				return 0;
			else if(cases[4]==0)
				return 4;
			else
				return 8;
		}else if	(cases[2]+cases[4]+cases[6]==20){
			if(cases[2]==0)
				return 2;
			else if(cases[4]==0)
				return 4;
			else
				return 6;
		}else {
			return -1;
		}

	/*	public static int testV(int[] cases) {
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
		}*/
	}
	
}
