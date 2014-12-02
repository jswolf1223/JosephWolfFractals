package edu.cofc.csci221.ui;

public class TestGridUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int addIncrement = 200;
		GridUI g1 = new GridUI();
		
		int increment = 0;
		
		
		for(int gridCount = 0; gridCount < 3; gridCount++)
		{
			Point p1 = new Point(0, increment);
			Point p2 = new Point(400,increment);
			p1.setY(increment);
			p2.setY(increment);
			Line l1 = new Line(p1, p2);
	
			Point p3 = new Point(increment, 0);
			Point p4 = new Point(increment, 400 );
			
			Line l2 = new Line(p3, p4);
			g1.addLine(l1);
			g1.addLine(l2);
			increment += addIncrement;
			System.out.println(l1.getStart());
			System.out.println(l1.getEnd());
			System.out.println(p1.getX());
			System.out.println(p2.getY());
			System.out.println(l1.isValid());
		}
		
		GridUI g2 = new GridUI();
		increment = 0;
		addIncrement = 100; 
		for(int gridCount = 0; gridCount < 4; gridCount++)
		{
			Point p1 = new Point(0, increment);
			Point p2 = new Point(400,increment);
			p1.setY(increment);
			p2.setY(increment);
			Line l1 = new Line(p1, p2);
			
			Point p3 = new Point(increment, 0);
			Point p4 = new Point(increment, 400 );
			
			Line l2 = new Line(p3, p4);
			g2.addLine(l1);
			g2.addLine(l2);
			increment += addIncrement;
			System.out.println(l1.getStart());
			System.out.println(l1.getEnd());
			System.out.println(p1.getX());
			System.out.println(p2.getY());
			System.out.println(l1.isValid());
		}
		
		GridUI g3 = new GridUI();
		increment = 0;
		addIncrement = 50; 
		for(int gridCount = 0; gridCount < 9; gridCount++)
		{
			Point p1 = new Point(0, increment);
			Point p2 = new Point(400,increment);
			p1.setY(increment);
			p2.setY(increment);
			Line l1 = new Line(p1, p2);
			
			Point p3 = new Point(increment, 0);
			Point p4 = new Point(increment, 400 );
			
			Line l2 = new Line(p3, p4);
			g3.addLine(l1);
			g3.addLine(l2);
			increment += addIncrement;
			System.out.println("getStart for vertical line : " + l1.getStart());
			System.out.println("getEnd for vertical line: " + l1.getEnd());
			System.out.println("getX for point: " + p1.getX());
			System.out.println("getY for point:" + p2.getY());
			System.out.println(" isValid for line:" + l1.isValid());
		}
	}

}
