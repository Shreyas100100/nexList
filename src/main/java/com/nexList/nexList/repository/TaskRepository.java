package com.nexList.nexList.repository;
import com.nexList.nexList.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
