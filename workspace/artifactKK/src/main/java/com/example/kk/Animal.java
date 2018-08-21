package com.example.kk;

public class Animal {
	private double weight;
	private float height;
	private String SpeciesName;

	public Animal(double weight, float height, String speciesName, Color color) {
		super();
		this.weight = weight;
		this.height = height;
		SpeciesName = speciesName;
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	private Color color;

	public Animal(double weight, float height, String SpeciesName) {
		this.weight = weight;
		this.height = height;
		this.SpeciesName = SpeciesName;

	}

	public double getWeight() {
		return weight;

	}

	public void setWeight(double weight) {
		this.weight = weight;

	}

	public float getHeight() {
		return height;

	}

	public void setHeight() {
		this.height = height;

	}

	public String getSpecieName() {
		return SpeciesName;

	}

	public void setSpeciesName() {
		this.SpeciesName = SpeciesName;

	}

}
