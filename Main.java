import java.util.Random;
import java.util.*;

public class Main
{
	
	public static void main(String[] arguments)
	{
	
	double b = 0;
	double c = 0;		//Variable used for setting infinite loops
	
	double bx = 0;
	double by = 0;
	int j = 0;
	
	int shotFired = 0;
	int m = 0;
	
	
	Rectangle body = new Rectangle(450,775,70,20,"Blue");		//Creation of user controlled Character begins here
	Rectangle head = new Rectangle(450,760,20,15,"RED");
	Rectangle leg1 = new Rectangle(475,790,20,15,"BLUE");
	Rectangle leg2 = new Rectangle(425,790,20,15,"BLUE");		//Creation of user controlled Character ends here
	
	GameArena alpha = new GameArena (900, 800);
	
	alpha.addRectangle(head);	//Addition of protagonist begins here
	alpha.addRectangle(body);
	alpha.addRectangle(leg1);
	alpha.addRectangle(leg2);	//Addition of protagonist ends here
	
	Ball speed = new Ball(0,0,10,"WHITE");		//Ball for controlling speed
	
	Random case1 = new Random();
	Random case2 = new Random();
	Random case3 = new Random();
	
	//Creation of Bullets begins here
	
	Ball[] Nballs;
	
	Nballs = new Ball[50];
		
		for (int i = 0; i < 50; i++) {
			
			int x = case1.nextInt(882) + 18;
			int y = case1.nextInt(782) + 18;
			int col = case2.nextInt(12) + 1 ;
			
			String[] colour = {"#FF00CE","#00FF11","#FDFF00","#00FFD2","#FCFFC8","#FF9600","RED","#D00031","#C987EB","#E30066","#FFED00","#57AB27","#FFFFFF"};
			
			Nballs[i] = new Ball(x,y,10,colour[col]);
		}
	//Creation of Bullets end here
	
	
	while (c == 0){
		
	b = speed.getYPosition();
	double h = b % 8; //this is to speed up the animation. By reducing the frequency at which this code is played
	if (h == 0){
		alpha.pause();
	}
	
	//Code handling the movement of the protagonist begins here
	if (alpha.rightPressed() && body.getXPosition() != 870){
		
		head.setXPosition((head.getXPosition() + 1));
		body.setXPosition((body.getXPosition() + 1));
		leg1.setXPosition((leg1.getXPosition() + 1));
		leg2.setXPosition((leg2.getXPosition() + 1));
	}
	else if (alpha.leftPressed() && body.getXPosition() != 30){
		
		head.setXPosition((head.getXPosition() - 1));
		body.setXPosition((body.getXPosition() - 1));
		leg1.setXPosition((leg1.getXPosition() - 1));
		leg2.setXPosition((leg2.getXPosition() - 1));
	}
	//Code handling the movement of the protagonist ends here
	
	
	//Code handling bullets shot starts here
	if (alpha.upPressed()){
		
		shotFired++;
		alpha.pause();
		}
		
	for (m = m; m < shotFired; m++) {
		
		Nballs[m].setXPosition(head.getXPosition());
		Nballs[m].setYPosition(head.getYPosition());
		alpha.addBall(Nballs[m]);
		}
	for (int k = 0; k < shotFired; k++) {
				
		Nballs[k].ballmovement();
		}
		speed.ballmovement();
	}
	}
}