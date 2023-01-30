package rw.ac.rca.smis.dao;

import org.hibernate.Query;

import rw.ac.rca.smis.orm.Course;

public class CourseDAOImpl extends DAO implements CourseDAO {

	private static CourseDAOImpl instance;

	private CourseDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public static CourseDAOImpl getInstance() {
		if (instance == null) {
			return new CourseDAOImpl();
		} else {
			return instance;
		}
	}

	@Override
	public Course saveOrUpdateCourse(Course course) {
		try {
			begin();
			getSession().saveOrUpdate(course);
			commit();
			return course;
		} catch (Exception e) {
			rollback();
			return null;
		}
	}
	
	@SuppressWarnings("unckecked")
	@Override
	public List<Course> getAllCourses(){
		try {
			begin();
			Query query = getSession().createQuery("from Course");
			List <Course> courses = query.list();
			commit();
			return courses;
 		} catch (Exception e) {
 			rollback(); 
 			return null;
 		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}