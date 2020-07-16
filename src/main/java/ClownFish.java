package main.java;

public class ClownFish extends Fish {

	
	@Override
	public String toString() {
		return "ClownFish [isLarge=" + isLarge + ", color=" + color + ", feature=" + feature + "]";
	}

	private boolean isLarge = false;
	
	private String color;
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

	private String feature;

	@Override
	public boolean sing() {
		return false;
	}

	@Override
	public boolean walk() {
		return false;
	}

	@Override
	public boolean swim() {
		return true;
	}

}
