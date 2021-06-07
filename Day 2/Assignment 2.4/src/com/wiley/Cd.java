package com.wiley;

public class Cd {
	private String Title;
	private String Singer;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public Cd(String title, String singer) {
		super();
		Title = title;
		Singer = singer;
	}
	public Cd() {
		
	}
	@Override
	public String toString() {
		return "Cd [Title=" + Title + ", Singer=" + Singer + "]";
	}
}
