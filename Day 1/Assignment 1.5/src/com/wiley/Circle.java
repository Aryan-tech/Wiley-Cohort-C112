package com.wiley;

	interface Drawable{
		void DrawingColor();
		void Thickness();
	}
	interface Fillable{
	void FillingColor(); 
	void size();
	}
	public class Circle implements Drawable , Fillable {

		@Override
		public void FillingColor() {
			// TODO Auto-generated method stub
			System.out.println("Filling Red Color in circle");
		}

		@Override
		public void size() {
			// TODO Auto-generated method stub
			System.out.println("circle has no size");
		}

		@Override
		public void DrawingColor() {
			// TODO Auto-generated method stub
			System.out.println("Drawing Red Color in circle");
		}

		@Override
		public void Thickness() {
			// TODO Auto-generated method stub
			System.out.println("circle has zero thickness");
		}
	}
