package main.java;

public class Shark extends Fish {
	
	private boolean isLarge = true;
	
	private String color;
	private String feature;

	public boolean isLarge() {
		return isLarge;
	}

	public void setLarge(boolean isLarge) {
		this.isLarge = isLarge;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Override
	public boolean sing() {
		
		return false;
	}

	@Override
	public boolean walk() {
		
		return false;
	}

	@Override
	public String toString() {
		return "Shark [isLarge=" + isLarge + ", color=" + color + ", feature=" + feature + "]";
	}

	@Override
	public boolean swim() {
		
		return true;
	}

}
