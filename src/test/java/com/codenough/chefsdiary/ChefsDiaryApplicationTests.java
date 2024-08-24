package com.codenough.chefsdiary;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ChefsDiaryApplicationTests {

    @Test
    void contextLoads() {
    }

}
