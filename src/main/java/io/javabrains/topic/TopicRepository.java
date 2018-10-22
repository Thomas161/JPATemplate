package io.javabrains.topic;



import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//@Repository <-- No good-->
public interface TopicRepository extends CrudRepository <Topic,String>{

}