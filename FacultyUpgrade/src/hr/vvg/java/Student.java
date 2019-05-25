package hr.vvg.java;

import java.time.LocalDate;

public class Student extends Person {
	private LocalDate dateOfBirth;
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
