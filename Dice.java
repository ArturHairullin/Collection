import static java.lang.Math.*;
import java.util.*;

interface DiceInterface{
	void step();
	void endgame();
}

class Player {
	public int  score,ord,result;
	public Player(int k) {
		ord=k;
	}
	public int res() {
		return result;
	}
	
}


public class Dice implements DiceInterface {

	private int n,k;
	private int end;
	List <Player> playerlist= new ArrayList();
	
	
	public Dice(int n,int k) {
		this.end=0;
		this.n=n;
		this.k=k;
		
		for(int i=0;i<n;i++) {
			
			playerlist.add(new Player(i));
		}
		
		
		
		
	}
	
	public void printTable() {

		Player p;
		
		for(int i=0;i<n;i++) {
			
			p=(Player)playerlist.get(i);
			System.out.format("score= %d, player number=%d,result=%d \n",p.score,p.ord+1,p.result);
			
			
		}
		System.out.format("\n ");
	}
	
	public void step() {
		
		if(end==7) {
			return;
		}
		
		Player p;
		
		for(int i=0;i<n;i++) {
			
			p=(Player)playerlist.get(i);
			p.result=((int)(10*random())+k)%(k*6);
			//playerlist.set(i,p);
			
		}
		//printTable();
		playerlist.sort(Comparator.comparing(Player :: res).reversed());
		p=(Player)playerlist.get(0);
		p.score++;
		
		if(p.score>end) {
			end++;
		}
		
	
		
		
	}
	

	public void endgame() {
		
		while(end!=7) {
			step();
			//printTable();
		}
		
		Player p;
		p=(Player)playerlist.get(0);
		System.out.format("won player number %d \n",p.ord+1);
		printTable();
	}
	
	public static void main(String[] args) {
		Dice d=new Dice(5,3);
		d.endgame();
		

	}

}
