package com.workintech.model;

public class Point {
    private int x;
    private int y;



public Point (int x,int y){
    this.x=x;
    this.y=y;
}

public int getX(){
    return x;
}

public int getY(){
    return y;
}

public void setX(int x){
    this.x=x;
}
public void setY(int y){
    this.y=y;
}

public double distance (Point p){
    int deltaX= this.x- p.getX();
    int deltaY= this.y- p.getY();

    return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
}

    public double distance (){
    return distance(new Point(0,0));
    }


    public double distance (int a,int b){
    return distance(new Point(a,b));
    }



}