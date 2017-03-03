import java.util.*;


public class BallCreator
{
	GameArena alpha;
	Ball[] Nballs;
	
	void generate(GameArena alpha, int z)
	{
		this.alpha = alpha;
		
		int i = 0;
		
		Random case1 = new Random();
		Random case2 = new Random();
		

		Nballs = new Ball[z];
		
		for (i = 0; i < z ; i++) {
		double x = case1.nextInt(882) + 18;
		double y = case1.nextInt(782) + 18;
		int col = case2.nextInt(12) + 1 ;
		String[] colour = {"#FF00CE","#00FF11","#FDFF00","#00FFD2","#FCFFC8","#FF9600","RED","#D00031","#C987EB","#E30066","#FFED00","#57AB27","#FFFFFF"};
			
		Nballs[i] = new Ball(x,y,10,colour[col]);
		alpha.addBall(Nballs[i]);
		}
		
	}
	
	int getNb(){
		return Nballs.length;
	}
	
	
}