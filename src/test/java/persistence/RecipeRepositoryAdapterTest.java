package persistence;

import com.codenough.chefsdiary.core.entity.Recipe;
import com.codenough.chefsdiary.infrastructure.persistence.RecipeRepositoryAdapter;
import com.codenough.chefsdiary.infrastructure.persistence.mapper.RecipeJpaMapper;
import com.codenough.chefsdiary.infrastructure.persistence.repository.RecipeMongoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static datahelpers.RecipeDataGenerator.SPAGHETTI_BOLOGNESE;
import static datahelpers.RecipeDataGenerator.createRecipeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipeRepositoryAdapterTest {

    @Mock
    private RecipeMongoRepository recipeMongoRepository;

    @Spy
    private RecipeJpaMapper recipeJpaMapper;

    @InjectMocks
    private RecipeRepositoryAdapter recipeRepositoryAdapter;

    @Test
    void givenValidRecipe_whenCreatingRecipe_thenIsSuccessful() {
        // Arrange
        final var recipe = SPAGHETTI_BOLOGNESE;
        final var recipeEntity = createRecipeEntity(recipe);

        when(recipeJpaMapper.toEntity(SPAGHETTI_BOLOGNESE)).thenReturn(createRecipeEntity(SPAGHETTI_BOLOGNESE));
        when(recipeMongoRepository.save(any())).thenReturn(recipeEntity);

        // Act
        Recipe createdRecipe = recipeRepositoryAdapter.createRecipe(recipe);

        // Assert
        assertNotNull(createdRecipe);
        assertEquals(recipe, createdRecipe);
    }
}
