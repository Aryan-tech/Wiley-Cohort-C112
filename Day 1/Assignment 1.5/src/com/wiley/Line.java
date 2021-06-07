package com.wiley;

public class Line implements Drawable , Fillable {

	@Override
	public void FillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Filling Red Color in line");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Line has no size");
	}

	@Override
	public void DrawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Red Color in line");
	}

	@Override
	public void Thickness() {
		// TODO Auto-generated method stub
		System.out.println("Line has zero thickness");
	}
}		