package Model.Entities;

import Model.Entities.enums.ClassName;

public class Course {
	private Integer id;
	private ClassName className;
	
	public Course() {
	}
	public Course(Integer id, ClassName className) {
		this.id = id;
		this.className = className;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ClassName getClassName() {
		return className;
	}
	public void setClassName(ClassName className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return String.format("%s", className);
	}
	
}
