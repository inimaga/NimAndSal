import java.util.Random;
import java.util.*;

public class Main
{
	
	public static void main(String[] arguments)
	{
	
	double b = 0;
	double c = 0;		//Variable used for setting infinite loops
	double d = 0;
	double e = 0;
	double directionX = 1; //This should represent the movement direction of the ball on the X axis
	double directionY = 1; //This should represent the movement direction of the ball on the Y axis
	
	double bx = 0;
	double by = 0;
	int j = 0;
	
	
	Rectangle body = new Rectangle(450,775,70,20,"Blue");		//Creation of user controlled Character begins here
	Rectangle head = new Rectangle(450,760,20,15,"RED");
	Rectangle leg1 = new Rectangle(475,790,20,15,"BLUE");
	Rectangle leg2 = new Rectangle(425,790,20,15,"BLUE");		//Creation of user controlled Character ends here
	
	
	
	GameArena alpha = new GameArena (900, 800);
	
	alpha.addRectangle(head);	//Addition of protagonist begins here
	alpha.addRectangle(body);
	alpha.addRectangle(leg1);
	alpha.addRectangle(leg2);	//Addition of protagonist ends here

	
	boolean userMovement;
	boolean gun = false;
	double shotFired = 0;
	
	//Ball bullet = new Ball(0,0,10,"RED");		//Bullet of protagonist
	
	Ball damn = new Ball(0,0,10,"RED");
	
	Random case1 = new Random();
	Random case2 = new Random();
	
	
	while (c == 0){
	
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
		
		damn.generateBullet(alpha);
		
		}
		
		
		
	}
	
	}
}