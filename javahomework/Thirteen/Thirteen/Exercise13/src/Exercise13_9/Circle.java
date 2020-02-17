package Exercise13_9;

import Exercise13_1.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle>{

	public double redius = 0;
	
	public Circle(double redius) {
		super();
		this.redius = redius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * redius * redius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean equals(Circle obj) {
		if(obj.redius == redius)
			return true;
		return false;
	};
	
	@Override
	public int compareTo(Circle o) {
		return 0;
	}
	
}
