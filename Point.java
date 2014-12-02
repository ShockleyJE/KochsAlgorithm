package edu.cofc.csci221.ui;
/** 
* @author James Shockley
* @since 5 October 2014
* 
* Creates points from data from main. Can either create a duplicate point from another point via the overloaded constructor or can create a new point from user 
* inputted data in main. Can also return the X value and Y value of a point, or set them with valid data
*
*/

public class Point {
	
	
	private int x = 0;
	private int y = 0;
	
	/*
	 * returns value for X
	 * @return object's x value
	 */
	public int getX() {
		return x;
	}
	
	/*
	 * sets a value for X that lies within the grid constraints
	 * precondition is that iX lies within the grid constraints
	 * @param value iX to be set
	 * 
	 */
	public void setX(int iX){
		if(iX >= 0 && iX <= GridConstants.MAX_PANEL_WIDTH)
			x= iX;
		else x= 0;
		}
	/*
	 * returns Point object's y value
	 * @param: None
	 * @return: integer y representing object's y value
	 */
	public int getY() {
		return y;
	}
	
	/*
	 * sets a value for Y that lies within the grid constraints
	 * @param: value iY to be set
	 * 
	 */
	public void setY(int iY){
		if(iY >= 0 && iY <= GridConstants.MAX_PANEL_HEIGHT)
			y= iY;
		else y=0;
		}
	
	/*
	 * sets this point object's x and y values to the same as another point object
	 * @param: Point object
	 * 
	 */
	public void setPoint(Point p)
	{
		if(p != null)
		{
		x = p.getX();
		y = p.getY();
		}
	}

	
	/*
	 * 
	 * No argument constructor that initializes 
	 * the point to zero
	 * 
	 */
	public Point(){
		x= 0;
		y= 0;
		}
	
	/*
	 * 
	 * constructor that initializes a point with 
	 * non-null x & y values within the grid constraints
	 * 
	 */
	public Point(Point point){
		if(point != null && point.getX() >= 0 && point.getX() <= GridConstants.MAX_PANEL_WIDTH)
			x= point.getX();
		if(point != null && point.getY() >= 0 && point.getY() <= GridConstants.MAX_PANEL_HEIGHT)
			y= point.getY();
		}
	
	/*
	 * 
	 * constructor that sets x & y to input values that
	 *  lie within the grid constraints
	 * 
	 */
	public Point(int iX, int iY){
		if(iX >= 0 && iX <= GridConstants.MAX_PANEL_WIDTH)
			x= iX;
		if(iY >= 0 && iY <= GridConstants.MAX_PANEL_HEIGHT)
			y= iY;
		}
	
	
	
	

}