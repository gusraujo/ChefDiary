package com.codenough.chefsdiary.infrastructure.persistence.repository;

import com.codenough.chefsdiary.infrastructure.persistence.model.RecipeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeMongoRepository extends MongoRepository<RecipeEntity, String> {
}
