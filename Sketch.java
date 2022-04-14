import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }
  
  //method with parameters
  void drawHouse(float houseX, float houseY, float houseWidth, float houseHeight) {

   //biggest rectangle of the house
   fill(240, 235, 182);
   rect(houseX, houseY, houseWidth, houseHeight);
    
    //roof positions
    fill(207, 76, 33);
    triangle((float) (houseX), (float) (houseY), (float) (houseX + 100), (float) (houseY - 100), (float) (houseX + houseWidth) , (float) (houseY));
          
   //window positions
    fill(145, 229, 242);
    rect((float) (houseX + 10), (float) (houseY + 30), (float) (houseWidth - 130), (float) (houseHeight - 90));
    
   //rectangle door positions
   fill(82, 79, 53);
   rect((float) (houseX + 90), (float) (houseY +30), (float) (houseWidth - 120), (float) (houseHeight - 30));
        
   // doorknob positions
   fill(240, 252, 0);
   ellipse((float) (houseX + 155), (float) (houseY + 100), (float) (houseWidth -185), (float) (houseHeight - 135));

   //method with parameters for colours
   if(houseX >= 70) {
     int doorPurple1 = 110;
     int doorPurple2 = 52;
     int doorPurple3 = 235;

     fill(doorPurple1, doorPurple2, doorPurple3);
     rect((float) (houseX + 90), (float) (houseY +30), (float) (houseWidth - 120), (float) (houseHeight - 30));

     int knobGray = 110;
     fill(knobGray); //
     ellipse((float) (houseX + 155), (float) (houseY + 100), (float) (houseWidth -185), (float) (houseHeight - 135));
   }
  }

  public void draw() {
	 drawHouse(0, 70, 200, 150);
   drawHouse(200, 70, 200, 150);
   
   //method with return values to make the house appear in the middle
   double middleX = width;
   double CoorX = middleX * .25;
   double middleY = height;
   double CoorY = middleY * 0.4;
     
   drawHouse((float) CoorX, (float) CoorY, 200, 150);

  }
}