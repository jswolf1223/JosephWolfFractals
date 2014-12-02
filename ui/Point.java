package edu.cofc.csci221.ui;
/** 
The Point class creates a point on a graphic window using x and y int
coordinates. The point can be moved using setters and viewed using 
getters.
 @author Joseph Wolf
 @since October 8, 2014
*/


public class Point {

	private int x; // The horizontal position of a point on the grid.
	private int y; // The vertical position of a point on the grid.

	/*
	 * Constructor: sets x and y values to 0.
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/*
	 * Constructor:
	 * precondition: Passes in a point object.
	 * postcondition: Sets the x and y int values of the instance to
	 * the argument points values.
	 */
	public Point(Point point) {
		if ((point != null) && (this.x >= 0 ) && 
				x <= GridConstants.MAX_PANEL_WIDTH ){
			this.x = point.x;
		}
		
		else{
			this.x = 0;
		}
		if ((point != null) && (this.y >= 0 ) && 
				y <= GridConstants.MAX_PANEL_HEIGHT ){
			this.y = point.y;
		}
		else{
			this.y = 0;
		}
	}
	
	/*
	 *  Constructor: 
	 *  precondition: Passes in horizontal(x) and vertical(y) int positions
	 *  postcondition: Sets objects x and y values to the x,y argument values.
	 */
	public Point(int x, int y){
		if ((x >= 0) && (x <= GridConstants.MAX_PANEL_WIDTH )){
			this.x = x;
		}
		else{
			this.x = 0;
		}
		if ((y >= 0) && (y <= GridConstants.MAX_PANEL_HEIGHT )){
			this.y = y;
		}
		else{
			this.y = 0;
		}
	
	}
	
	/*
	 * postcondition: Returns the horizontal int position (x) of a point object.
	 */
	public int getX(){
		return x;
	}
	
	/*
	 * postcondition: Returns the vertical int position (y) of a point object.
	 */
	public int getY(){
		return y;	
	}
	
	/*
	 *  precondition: Passes in an int argument x.
	 *  postcondition: Sets instance's x variable to argument int x's value.
	 */
	public void setX(int x){
		if ((x>=0)&& (x<=GridConstants.MAX_PANEL_WIDTH)){
			this.x = x;
		}
		else{
			this.x = 0;
		}
		
	}
	
	/*
	 *  precondition: Passes in an int argument y.
	 *  postcondition: Sets instance's y variable to argument int y's value.
	 */
	public void setY(int y){
		if ((y>=0)&& (y<=GridConstants.MAX_PANEL_HEIGHT)){
			this.y = y;
		}
		else{
			this.y = 0;
		}
		
	}
	
	/*
	 *  precondition: Passes in a point object (p).
	 *  postcondition: Sets an object's x and y values to values of
	 *  the p object in the argument.
	 */
	public void setPoint(Point p){
		if( p != null ){
			if ((x>=0)&& (x<=GridConstants.MAX_PANEL_WIDTH)){
			this.x= p.x;
			}
			if ((y>=0)&& (y<=GridConstants.MAX_PANEL_HEIGHT)){
			this.y= p.y;
			}
		}
		
	}
}












