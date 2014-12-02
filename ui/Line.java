package edu.cofc.csci221.ui;


public class Line {
	private Point start;
	private Point end;
	
	/*
	 * Constructor:
	 * precondition: Passes in point objects start and end.
	 * postcondition: Sets Line objects start and end to arguments
	 * passed in.
	 */
	public Line(Point start, Point end){
		if((start!= null) && (end != null)){
			this.start = start;
			this.end = end;
			
		}
	}	
	/*
	 * postcondition: Returns start Point object.
	 */
	public Point getStart(){
		return start;
	}
	
	/*
	 * postcondition: Returns end Point object.
	 */
	public Point getEnd(){
		return end;
	}
	
	/*
	 * precondition: Passes in a start Point object.
	 * postcondition: Sets objects start to start argument passed in.
	 */
	public void setStart(Point start){
		if(start != null){
			this.start= start;
		}
	}	
	
	/*
	 * precondition: Passes in a end Point object.
	 * postcondition: Sets objects end to end argument passed in.
	 */
	public void setEnd(Point end){
		if(end != null){
			this.end= end;
		}
	}
	
	/*
	 *  postcondition: Returns a boolean value true if start and end
	 *  values of a Line object aren't null.
	 */
	public boolean isValid(){
		if(this.start != null && this.end != null){
			return true;
		}
		else{
			return false;
		}
		
	}
	

}
