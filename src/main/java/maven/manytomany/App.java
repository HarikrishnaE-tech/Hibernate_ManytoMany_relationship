package maven.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import data.Course;
import data.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Student s=new Student();
    s.setStdname("hari");
    Student s1=new Student();
    s1.setStdname("junaid");
    
    List<Student> lStudent=new ArrayList<>();
    lStudent.add(s1);
    lStudent.add(s);
    
    Course c=new Course();
    c.setCname("java");
    c.setLstudent(lStudent);
    
    
    Course c1=new Course();
    c1.setCname("python");
    c1.setLstudent(lStudent);
    
    List<Course> lCourse=new ArrayList();
    lCourse.add(c1);
    lCourse.add(c);
    
    s.setLcourse(lCourse);
    s1.setLcourse(lCourse);
    
    
    
    Configuration cfg=new Configuration()
    		.configure()
    		.addAnnotatedClass(Course.class)
    		.addAnnotatedClass(Student.class);
    SessionFactory sf = cfg.buildSessionFactory();
    Session sess = sf.openSession();
    Transaction bt = sess.beginTransaction();
    sess.save(s);
    sess.save(s1);
    sess.save(c);
    sess.save(c1);
    bt.commit();
    sess.clear();
    sf.close();
    
    
    }
}
