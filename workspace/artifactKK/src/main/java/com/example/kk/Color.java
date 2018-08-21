package com.example.kk;

public class Color {
private String ColorName;
private int ColorId;


public Color(String colorName, int colorId) {
	super();
	ColorName = colorName;
	ColorId = colorId;
}
public String getColorName() {
	return ColorName;
}
public void setColorName(String colorName) {
	ColorName = colorName;
}
public int getColorId() {
	return ColorId;
}
public void setColorId(int colorId) {
	ColorId = colorId;
}
}
