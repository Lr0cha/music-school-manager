package Model.Entities;

import java.util.ArrayList;
import java.util.List;

import Model.Exceptions.DomainException;

public class Student {
	private Integer id;
	private String name;
	
	private ContactProfile contactProfile;
	private List<Course> courses = new ArrayList<>();
	
	public Student(){
		
	}
	

	public Student(Integer id, String name, ContactProfile contactProfile) {
		this.id = id;
		this.name = name;
		this.contactProfile = contactProfile;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ContactProfile getContactProfile() {
		return contactProfile;
	}

	public void setContactProfile(ContactProfile contactProfile) {
		this.contactProfile = contactProfile;
	}

	public List<Course> getCourse() {
		return courses;
	}
	
	public void addCourses(Course course) throws DomainException{
		if(courses.size() >= 3) {
			throw new DomainException("Máximo de 3 tipos de aula diferente!");
		}
		courses.add(course);
	}
	public void removeCourses(Course course){
		courses.remove(course);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(name).append("\n");
        sb.append(contactProfile).append("\n");
        sb.append("Aulas:\n");
        for (Course course : courses) {
            sb.append(course).append("\n");
        }
        return sb.toString();	
	}
}
