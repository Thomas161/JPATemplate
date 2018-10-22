package io.javabrains.courses;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//@Repository <-- No good-->
public interface CourseRepository extends CrudRepository <Course,String>{
	
	public List<Course> findByTopicId(String topicId);

}