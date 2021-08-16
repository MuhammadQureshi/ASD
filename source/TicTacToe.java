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
import java.lang.*;

public class TicTacToe extends PApplet {

int player = 0;
int box1 = 0;
int box2 = 0;
int box3 = 0;
int box4 = 0;
int box5 = 0;
int box6 = 0;
int box7 = 0;
int box8 = 0;
int box9 = 0;
PImage image;
public void setup() {
  
  image = loadImage("C:/ITEC102/source/bg.jpeg");
  background(155,100,150);
  rectMode(CENTER);
  strokeWeight(5);
  line(200, 0, 200, 600);
  line(400, 0, 400, 600);
  line(0, 200, 600, 200);
  line(0, 400, 600, 400);
  line(0, 600, 600, 600);
  textSize(20);
  textAlign(CENTER);
  fill(0);
  text("Press R key to restart the game", 300, 650);
  noFill();
}
public void draw() {
  checkValues();
}
public void mouseClicked() {
  player++;
  int x = (mouseX/200) * 200 + 100;
  int y = (mouseY/200) * 200 + 100;
  setValues(x, y);
}
public void justAFunction(int x, int y){
  System.out.println("Just a line to print");
}
public void keyPressed() {
  if (key == 'R') {
    background(255);
    rectMode(CENTER);
    strokeWeight(5);
    line(200, 0, 200, 600);
    line(400, 0, 400, 600);
    line(0, 200, 600, 200);
    line(0, 400, 600, 400);
    line(0, 600, 600, 600);
    box1 = 0;
    box2 = 0;
    box3 = 0;
    box4 = 0;
    box5 = 0;
    box6 = 0;
    box7 = 0;
    box8 = 0;
    box9 = 0;
    player = 0;
    textSize(20);
    textAlign(CENTER);
    fill(0);
    text("Press R key to restart the game", 300, 650);
    noFill();
  }
}

public void checkValues() {

  //Checking Horizontal Lines

  if (box1 == 1 && box2 == 1 && box3 == 1 || box1 == 2 && box2 == 2 && box3 == 2) {
    line(50, 100, 550, 100);
  }
  if (box4 == 1 && box5 == 1 && box6 == 1 || box4 == 2 && box5 == 2 && box6 == 2) {
    line(50, 300, 550, 300);
  }
  if (box7 == 1 && box8 == 1 && box9 == 1 || box7 == 2 && box8 == 2 && box9 == 2) {
    line(50, 500, 550, 500);
  }

  //Checking Vertical Lines

  if (box1 == 1 && box4 == 1 && box7 == 1 || box1 == 2 && box4 == 2 && box7 == 2) {
    line(100, 50, 100, 550);
  }
  if (box2 == 1 && box5 == 1 && box8 == 1 || box2 == 2 && box5 == 2 && box8 == 2) {
    line(300, 50, 300, 550);
  }
  if (box3 == 1 && box6 == 1 && box9 == 1 || box3 == 2 && box6 == 2 && box9 == 2) {
    line(500, 50, 500, 550);
  }

  //checking diagonal lines

  if (box1 == 1 && box5 == 1 && box9 == 1 || box1 == 2 && box5 == 2 && box9 == 2) {
    line(50, 50, 550, 550);
  }
  if (box3 == 1 && box5 == 1 && box7 == 1 || box3 == 2 && box5 == 2 && box7 == 2) {
    line(550, 50, 50, 550);
  }
}
public void setValues(int x, int y) {
  if (player%2==0) {
    stroke(255, 0, 0);
    ellipse(x, y, 100, 100);
    if (x == 100 && y == 100)
      box1 = 1;
    if (x == 300 && y == 100)
      box2 = 1;
    if (x == 500 && y == 100)
      box3 = 1;


    if (x == 100 && y == 300)
      box4 = 1;
    if (x == 300 && y == 300)
      box5 = 1;
    if (x == 500 && y == 300)
      box6 = 1;


    if (x == 100 && y == 500)
      box7 = 1;
    if (x == 300 && y == 500)
      box8 = 1;
    if (x == 500 && y == 500)
      box9 = 1;
  } else {
    stroke(0, 0, 255);
    rect(x, y, 100, 100);

    if (x == 100 && y == 100)
      box1 = 2;
    if (x == 300 && y == 100)
      box2 = 2;
    if (x == 500 && y == 100)
      box3 = 2;


    if (x == 100 && y == 300)
      box4 = 2;
    if (x == 300 && y == 300)
      box5 = 2;
    if (x == 500 && y == 300)
      box6 = 2;


    if (x == 100 && y == 500)
      box7 = 2;
    if (x == 300 && y == 500)
      box8 = 2;
    if (x == 500 && y == 500)
      box9 = 2;
  }
}
  public void settings() {  size(600, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "TicTacToe" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
