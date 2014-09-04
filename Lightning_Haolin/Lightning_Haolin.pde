int startX = 0;
int startY = 150;
int endX = 0;
int endY = 150;
int colorA = int(random(0,250));
int colorB = int(random(0,250));
int colorC = int(random(0,250));

void setup()
{
  size(400,400);
  strokeWeight(1);
  background(0,0,0);
  
}
void draw()
{
 
 	stroke(colorA,colorB,colorC);
colorA = int(random(0,250));
colorB =int(random(0,250));
colorC =int(random(0,250));

  while( endX<401)
  {
    endX=startX + int(random(0,10));  
    endY=startY + int(random(-9,9));
    line(startX,startY,endX,endY);
    startX=endX;
    startY=endY;
  }
  mousePressed();
  
 }
  

void mousePressed()
{

    startX=0;
    startY=150;
    endX=0;
    endY=150;
 
}



