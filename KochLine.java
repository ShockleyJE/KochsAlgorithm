package edu.cofc.csci221.ui;
/**
 * 
 * @author James Shockley
 * @Since Nov 29, 2014
 * 
 * Inherits from Line in order to 
 * create lines according to Koch algorithm
 * 
 * 
 */
public class KochLine extends Line {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	private Point p5;
	
	/*
	 * @param start = starting Point object for this line
	 * @param end = ending Point object for this line
	 */
	public KochLine(Point start, Point end) {
		super(start, end);
		p1 = this.getStart();
		p5 = this.getEnd();
	}

	/*
	 * method to return line A
	 * 
	 * precondition: object has been instantiated
	 * p1 and p2 are point objects
	 * postcondition: Line A is returned
	 * 
	 * returns new Kochline object
	 */
	public KochLine getLineA() {
		return new KochLine(p1, p2);

	}
	/*
	 * 
	 * method to return line  B
	 * 
	 * precondition: object has been instantiated;
	 * p2 and p3 are point objects;
	 * computeFractal has created p2 & p3
	 * postcondition: Line B is returned
	 * 
	 * returns new Kochline object
	 */
	public KochLine getLineB() {
		return new KochLine(p2, p3);
	}
	/*
	 * method to return line  C
	 * 
	 * 
	 * precondition: object has been instantiated;
	 * p3 and p4 are point objects;
	 * computeFractal has created p2 & p3
	 * postcondition: Line C is returned
	 * 
	 * returns new Kochline object
	 */
	public KochLine getLineC() {
		return new KochLine(p3, p4);
	}
	/*
	 * method to return line D
	 * 
	 * precondition: object has been instantiated;
	 * p4 and p5 are point objects;
	 * postcondition: Line D is returned
	 * 
	 * returns new Kochline object
	 */
	public KochLine getLineD() {
		return new KochLine(p4, p5);
	}
	
	/*
	 * method to compute fractals based on Koch's algorithm
	 * 
	 * precondition: p1 and p2 have been 
	 * postcondition: p2, p3, and p4 are given values
	 * 				according to koch algorithm
	 * 
	 */
	public void computeFractal(){
		int deltaX_51 = p5.getX() - p1.getX(); 
		int deltaY_51 = p5.getY() - p1.getY();
		
		int x2 = (int) p1.getX() + deltaX_51 / 3;
		int y2 = (int) p1.getY() + deltaY_51 /3;
		
		this.p2 = new Point(x2,y2);
		
		int x3 = (int) ((p1.getX()  + p5.getX()) / 2 + (Math.sqrt(3) * (p1.getY() - p5.getY())) /6);
		int y3 = (int) ((p1.getY()  + p5.getY()) /2  + (Math.sqrt(3) * (p5.getX() - p1.getX())) /6);
		
		this.p3 = new Point(x3,y3);
		
		int x4 = p1.getX() +  (2 * deltaX_51) / 3;
		int y4 =  p1.getY() + (2 * deltaY_51) / 3;
		
		this.p4 = new Point(x4,y4);
	}
	
	/*
	 * method to check the validity of a koch line
	 * 
	 * precondition: Koch line has created a line
	 * postcondition: returns true if valid, else false
	 * 
	 * return boolean 
	 */
	public boolean isKochLineValid() {
		return this.isValid();
	}
}