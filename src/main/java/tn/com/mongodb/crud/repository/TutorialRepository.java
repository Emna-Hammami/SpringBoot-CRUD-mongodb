package tn.com.mongodb.crud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.com.mongodb.crud.model.Tutorial;

/*
Let’s create a repository to interact with Tutorials from the database.
In repository package, create TutorialRepository interface that extends MongoRepository.
 */

/*
– findByTitleContaining(): returns all Tutorials which title contains input title.
– findByPublished(): returns all Tutorials with published having value as input published.

The implementation is plugged in by Spring Data MongoDB automatically.
 */

public interface TutorialRepository extends MongoRepository<Tutorial, String>{
	List<Tutorial> findByTitleContaining(String title);
	List<Tutorial> findByPublished(boolean published);

}
