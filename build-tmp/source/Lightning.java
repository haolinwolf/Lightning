import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;
int colorA = PApplet.parseInt(random(0,250));
int colorB = PApplet.parseInt(random(0,250));
int colorC = PApplet.parseInt(random(0,250));

public void setup()
{
  size(400,400);
  strokeWeight(1);
  background(0,0,0);
  
}
public void draw()
{
 
 	stroke(colorA,colorB,colorC);
colorA = PApplet.parseInt(random(0,250));
colorB =PApplet.parseInt(random(0,250));
colorC =PApplet.parseInt(random(0,250));

  while( endX<401)
  {
    endX=startX + PApplet.parseInt(random(0,10));  
    endY=startY + PApplet.parseInt(random(-9,9));
    line(startX,startY,endX,endY);
    startX=endX;
    startY=endY;
  }
  mousePressed();
  
 }
  

public void mousePressed()
{

    startX=0;
    startY=150;
    endX=0;
    endY=150;
 
}



  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
