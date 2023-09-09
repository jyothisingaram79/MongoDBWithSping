package com.example.demo.dal;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByTitleContaining(String title);
  List<Tutorial> findByPublished(boolean published);
Optional<Tutorial> findById(String id);
void deleteById(String id);
}
