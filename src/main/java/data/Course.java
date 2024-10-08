package data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
 private int cid;
 private String Cname;
 @ManyToMany(mappedBy = "lcourse")
 List<Student> lstudent ;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public List<Student> getLstudent() {
	return lstudent;
}
public void setLstudent(List<Student> lstudent) {
	this.lstudent = lstudent;
}
public Course(int cid, String cname, List<Student> lstudent) {
	super();
	this.cid = cid;
	Cname = cname;
	this.lstudent = lstudent;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", Cname=" + Cname + ", lstudent=" + lstudent + "]";
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
 
}
