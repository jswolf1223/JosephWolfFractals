package edu.cofc.csci221.ui;
/**
 * @author Sam Wolf
 * @author Computer Science Department 
 * @author College of Charleston 
 * @author CSCI 221 
 * @since 12/1/2014
 * 
 * The KochLine class :
 * 
 *  -Inherits from the Line class.
 *  -Allows user to input points to create KochLines.
 *  -Does computations which determine the lines of a fractal. 
 *
 */

public class KochLine extends Line {
	private Point p1; // Instance Variable. Point used to determine other lines in a fractal. 
	private Point p2; // Instance Variable. Point determined by p1 and p5 Points.
	private Point p3; // Instance Variable. Point determined by p1 and p5 Points.
	private Point p4; // Instance Variable. Point determined by p1 and p5 Points.
	private Point p5; // Instance Variable. Point used to determine other lines in a fractal.
	
	/*
	 * Constructor:  Takes 2 Point arguments and creates a KochLine instance (start determines
	 * the beginning of the line and end determines where the line terminates.
	 * Sets the start point value to p1 and end value to p5.
	 */
	KochLine(Point start, Point end){
		super(start,end);
		this.p1=this.getStart();
		this.p5=this.getEnd();
		
	}
	
	/*
	 * Postcondition: returns a KochLine object formed by points p1 and p2.
	 */
	public KochLine getLineA(){
		KochLine lineA= new KochLine(p1,p2);
		return lineA;
		
	}
	
	/*
	 * Postcondition: returns a KochLine object formed by points p2 and p3.
	 */
	public KochLine getLineB(){
		KochLine lineB= new KochLine(p2,p3);
		return lineB;
		
	}
	
	/*
	 * Postcondition: returns a KochLine object formed by points p3 and p4.
	 */
	public KochLine getLineC(){
		KochLine lineC= new KochLine(p3,p4);
		return lineC;
		
	}
	
	/*
	 * Postcondition: returns a KochLine object formed by points p4 and p5.
	 */
	
	public KochLine getLineD(){
		KochLine lineD= new KochLine(p4,p5);
		return lineD;
		
	}
	
	/*
	 * Postcondition: computes the values of the points in the fractal and sets the values for p2,p3 and p4.
	 */
	public void computeFractal(){
		int deltaX =p5.getX()-p1.getX();
		int deltaY =p5.getY()- p1.getY();
		int x2= p1.getX()+ (deltaX/3);
		int y2= p1.getY()+ (deltaY/3);
		double x3=((p1.getX()+p5.getX())/2)+( Math.sqrt(3)*
				(p1.getY()-p5.getY()))/6;
		double y3=((p1.getY()+p5.getY())/2)+( Math.sqrt(3)*
				(p5.getX()-p1.getX()))/6;
		int x4= p1.getX()+((2*deltaX)/3);
		int y4= p1.getY()+((2*deltaY)/3);
		this.p2= new Point(x2,y2);
		this.p3= new Point((int)x3,(int)y3);
		this.p4= new Point(x4,y4);
	}
	
	/*
	 * Postcondition: Calls superclass and returns a true value if the KochLine is valid. 
	 */
	public Boolean isKochLineValid(){
		return super.isValid();
		
		
	}
}
