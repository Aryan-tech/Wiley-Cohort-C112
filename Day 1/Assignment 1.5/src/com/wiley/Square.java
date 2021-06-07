package com.wiley;

public class Square implements Drawable , Fillable {

	@Override
	public void FillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Filling Red Color in square");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("square has no size");
	}

	@Override
	public void DrawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Red Color in square");
	}

	@Override
	public void Thickness() {
		// TODO Auto-generated method stub
		System.out.println("square has zero thickness");
	}
}		
