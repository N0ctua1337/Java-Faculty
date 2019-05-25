package hr.vvg.java;

import java.util.Date;

public class Exam {
	private int grade;
	private Date date_time;
	private Professor professor = new Professor();
	private Student student = new Student();
	
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	
	
}
