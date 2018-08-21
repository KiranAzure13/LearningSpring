package com.example.kk;

public class Point {
	private int x;
	private int y;
	private String Hello_World;
	
	//Default Constructor
	public Point(String Message, int Messval, double d, float f, float f1){
		System.out.println("Called Constructor "+Message+ "\nMessage Number "+Messval+ "\ndouble "+ d +"\nf "+ f+" -"+f1);
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getHello_World() {
		return Hello_World;
	}
	public void setHello_World(String Hello_World) {
		 this.Hello_World = Hello_World;
	}
	

}
