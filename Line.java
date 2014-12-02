package edu.cofc.csci221.ui;
/**
 * 
 * @author James Shockley
 * @since 5 October 2014
 * Class that creates lines from points instantiated in main and checks validity of lines
 *
 */

public class Line {
	
	private Point start = null;
	private Point end = null;

	/*
	 * Constructor that sets the arguments
	 * to the passed in points, start and end
	 * @param none
	 * @return start
	 **/
	Line( Point iStart, Point iEnd){
		if(iStart != null && iEnd != null){
			start = iStart;
			end = iEnd;
		}
	}
	
	/*
	 * returns start value
	 * @return Point object
	 */
	public Point getStart() {
		return start;
	}

	/*
	 * sets a non-null start value as a Point
	 * 
	 * Precondition is that iStart is not null
	 * Postcondition is that iStart is returned
	 */
	public void setStart(Point iStart){
		if(iStart != null)
			start= iStart;
	}

	/*
	 * returns the end point of the line
	 * @return Point object
	 */
	public Point getEnd() {
		return end;
	}

	/*
	 * sets Line object's end to Point object if that object is not null
	 * @param: Point object representing end
	 */
	public void setEnd(Point iEnd) {
		if(end != null) 
			end = iEnd;
	}

	/*
	 * checks the validity of a line
	 * @return: boolean true if Line object is valid, false if else
	 */
	public boolean isValid(){
		boolean result= false;
		if(start != null && end != null){
			result= true;
		}
		return result;
	}

}