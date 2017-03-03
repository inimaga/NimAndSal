import java.util.Random;

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

	
	Rectangle body = new Rectangle(450,775,70,20,"Blue");		//Creation of user controlled Character begins here
	Rectangle head = new Rectangle(450,760,20,15,"RED");
	Rectangle leg1 = new Rectangle(475,790,20,15,"BLUE");
	Rectangle leg2 = new Rectangle(425,790,20,15,"BLUE");		//Creation of user controlled Character ends here
	
	
	
	GameArena alpha = new GameArena (900, 800);
	
/*	Ball yolanda = new Ball(0,0,0,"BLUE");
	Ball lelouche = new Ball(0,0,0, "GREEN");
	alpha.addBall(yolanda);
	alpha.addBall(lelouche);
	*/
	
	alpha.addRectangle(head);	//Addition of protagonist begins here
	alpha.addRectangle(body);
	alpha.addRectangle(leg1);
	alpha.addRectangle(leg2);	//Addition of protagonist ends here

	
	boolean userMovement;
	boolean gun = false;
	boolean shotFired = false;
	
	Ball bullet = new Ball(0,0,10,"RED");		//Bullet of protagonist
	
	
	while (c == 0){
	
	double h = b % 8; //this is to speed up the animation. By reducing the frequency at which this code is played
	if (h == 0){
		alpha.pause();
	}
	
	//Code handling the movement of the protagonist begins here
	if (alpha.rightPressed()){
		
		head.setXPosition((head.getXPosition() + 1));
		body.setXPosition((body.getXPosition() + 1));
		leg1.setXPosition((leg1.getXPosition() + 1));
		leg2.setXPosition((leg2.getXPosition() + 1));
	}
	else if (alpha.leftPressed()){
		
		head.setXPosition((head.getXPosition() - 1));
		body.setXPosition((body.getXPosition() - 1));
		leg1.setXPosition((leg1.getXPosition() - 1));
		leg2.setXPosition((leg2.getXPosition() - 1));
	}
	//Code handling the movement of the protagonist ends here
	
	
	//Code handling bullets shot starts here
	if (alpha.upPressed()){
		bullet.setXPosition(bx);
		bullet.setYPosition(by);
		alpha.addBall(bullet);

	}
		bullet.setYPosition((bullet.getYPosition() - 1));

	bx = head.getXPosition();
	by = head.getYPosition() - 15;
	//Code handling bullets shot ends here
	
	b = bullet.getYPosition();
	
	if (alpha.downPressed()){
		alpha.removeBall(bullet);

	}
	
	
	}
	
	
	/* 
	Random case1 = new Random();
	int f = case1.nextInt(882) + 1;
	beta.setXPosition(f);
	int g = case1.nextInt(782) + 1;
	beta.setYPosition(g);
	
	
	while(c == 0){	//c=0; c < 100 ; c++
	
	if (directionX == 1) {	//Ball moving to the right
		b = beta.getXPosition() + 1;
		beta.setXPosition(b);
	}
	else if (directionX == 2) {  //Ball moving to the left
		b = beta.getXPosition() - 1;
		beta.setXPosition(b);
	}
	if (directionY == 1) {  //Ball moving downwards
		e = beta.getYPosition() + 1;
		beta.setYPosition(e);
	}
	else if (directionY == 2) {  //Ball moving upwards
		e = beta.getYPosition() - 1;
		beta.setYPosition(e);
	}
	
	// The Code below sets the direction of the ball
	
	if (b == 882) {
		directionX = 2;
	}
	else if (b == 18) {
		directionX = 1;
	}
	
	if (e == 782){
		directionY = 2;
	}
	else if (e == 18) {
		directionY = 1;
	}
	double h = b % 8; //this is to speed up the animation. By reducing the frequency at which this code is played
	if (h == 0){
		alpha.pause();
	}
	}
*/
	
	}
}