package rezi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int stuID;
	
	@Column(name = "Name")
	private String stuName;
	
	@Column(name = "Course")
	private String course;

	@Column(name = "Roll_No")
	private int rollNo;
	
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student() {
		super();
	}
	public Student(int stuID, String stuName, String course, int rollNo) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.course = course;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", course=" + course + ", rollNo=" + rollNo + "]";
	}

}
