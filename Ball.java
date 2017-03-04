import java.util.*;

 
 /**
 * Models a simple solid sphere. 
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
public class Ball
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double size;				// The diameter of this Ball
	private String colour;	            // The colour of this Ball
										// Permissable colours are 
                                        // "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW".
                                        // Alternatively, 8 bit hexadecimal RGB values can be given, in the format "#RRGGBB".  e.g.
                                        // Pure red is "FF0000"
                                        // Pure red is "00FF00"
                                        // Pure red is "0000FF"

	/**
	 * Obtains the current position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}

    /**
     * Constructor. Creates an instance of Ball with the given chatacteristics.
     *
     * @param x The initial location of the centre of the Ball on the screen, in the X dimension.
     * @param y The initial location of the centre of the Ball on the screen, in the Y dimension.
     * @param diameter The diameter of the Ball, in pixels.
     * @param col The colour of the Ball. Colour can be expressed as either a friendly name, including:
     * "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW".
     * Alternatively, 8 bit hexadecimal RGB values can be given, in the format "#RRGGBB". e.g. "#FF0000" is a pure read, "#0000FF" is pure blue, etc.
     */
	 
	 
	 //Addition of my code began here
	
	double directionX = 1;
	double directionY = 2;
	Random case3 = new Random();

	GameArena alpha;
	Ball[] Nballs;
	Ball bullet;
	 
	public Ball (double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;
		size = diameter;
		colour = col;
	}
	
	public void ballmovement() {
		
		//Code handling movement begins here
		/*
		if (directionX == 1) {
			xPosition = this.xPosition + 1;
		}
		else if (directionX == 2) {
			
			xPosition = this.xPosition - 1;
		}
	*/
		if (directionY == 1) { 
			
			yPosition = this.yPosition + 1;
		}
		else if (directionY == 2) {
			
			yPosition = this.yPosition - 1;
		}
		
		//Code handling movement ends here
		
		
		//Code handling direction begins here
		if (this.xPosition == 882) {
		
			directionX = 2;
		}
		else if (this.xPosition == 18) {
			directionX = 1;
		}
	
		if (this.yPosition == 782){
			directionY = 2;
		}
		else if (this.yPosition == 18) {
			directionY = 1;
		}
		//Code handling direction ends here

		}
		
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
	void generateBullet(GameArena alpha)
	{
		this.alpha = alpha;
		
		Random case1 = new Random();
		Random case2 = new Random();
		
		
		double x = case1.nextInt(882) + 18;
		double y = case1.nextInt(782) + 18;
		int col = case2.nextInt(12) + 1 ;
		String[] colour = {"#FF00CE","#00FF11","#FDFF00","#00FFD2","#FCFFC8","#FF9600","RED","#D00031","#C987EB","#E30066","#FFED00","#57AB27","#FFFFFF"};
			
		bullet = new Ball(x,y,10,colour[col]);	
		alpha.addBall(bullet);
		
	}
	
	
}
