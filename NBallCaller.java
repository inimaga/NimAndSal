import java.util.Random;
import java.util.Scanner;



public class NBallCaller			//Numerous Ball caller
{
	
	public static void main(String[] arguments)
	{
		
	Scanner reader;										//Portion of code handling User Specified number of balls begin here
	int userChoice;
	System.out.println("\nPlease enter the number of balls you would like to see... (Maximum limit restricted to 20)");
	reader = new Scanner(System.in);
	userChoice = reader.nextInt();						//Portion of code handling User Specified number of balls ends here
	
	int i = 0;
	double b = 0;		//Variable for handling speed
	double c = 0;		//Variable for handling infinite looping
	
	GameArena alpha = new GameArena (900, 800);
	Ball[] Nballs;
	
	Random case1 = new Random();
	Random case2 = new Random();
	
	Nballs = new Ball[20];
		
		for (i = 0; i < userChoice; i++) {
			
			int x = case1.nextInt(882) + 18;
			int y = case1.nextInt(782) + 18;
			int col = case2.nextInt(12) + 1 ;
			
			String[] colour = {"#FF00CE","#00FF11","#FDFF00","#00FFD2","#FCFFC8","#FF9600","RED","#D00031","#C987EB","#E30066","#FFED00","#57AB27","#FFFFFF"};
			
			Nballs[i] = new Ball(x,y,20,colour[col]);
			alpha.addBall(Nballs[i]);
		}
		
		while(c == 0){
			
			for (i = 0; i < userChoice; i++) {
				
				Nballs[i].ballmovement();
				}
				
			b = Nballs[0].getXPosition();
			
			double h = b % 16;						 //This is to speed up the animation. By reducing the frequency at which this code is played
			if (h == 0){
				alpha.pause();
				}
				
		}
	}
	
}