package data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdid;
	private String stdname;
	@ManyToMany
	List<Course> lcourse;

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public List<Course> getLcourse() {
		return lcourse;
	}

	public void setLcourse(List<Course> lcourse) {
		this.lcourse = lcourse;
	}

	public Student(int stdid, String stdname, List<Course> lcourse) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.lcourse = lcourse;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", lcourse=" + lcourse + "]";
	}

}
