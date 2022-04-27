package com.example.demo;

public class Student {
	
	private int id;
	private String name;
	private int pmarks;
	private int cmarks;
	private int mmarks;
	
	public Student(int id, String name, int pmarks, int cmarks, int mmarks) {
		super();
		this.id = id;
		this.name = name;
		this.pmarks = pmarks;
		this.cmarks = cmarks;
		this.mmarks = mmarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPmarks() {
		return pmarks;
	}

	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}

	public int getCmarks() {
		return cmarks;
	}

	public void setCmarks(int cmarks) {
		this.cmarks = cmarks;
	}

	public int getMmarks() {
		return mmarks;
	}

	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pmarks=" + pmarks + ", cmarks=" + cmarks + ", mmarks="
				+ mmarks + "]";
	}
	
	public int getTotal() {
		return cmarks+mmarks+pmarks;
	}
	

}
