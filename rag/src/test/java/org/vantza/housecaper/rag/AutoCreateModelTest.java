package org.vantza.housecaper.rag;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.vantza.housecaper.rag.model.TestAutoCreateModel;
import org.vantza.housecaper.rag.repository.TestAutoCreateModelRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AutoCreateModelTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TestAutoCreateModelRepository testAutoCreateModelRepository;

    @Test
    public void createTest() {
        TestAutoCreateModel model = new TestAutoCreateModel();
        model.setId("test1");
        model.setName("testModel");
        entityManager.persistAndFlush(model);

        Optional<TestAutoCreateModel> one = testAutoCreateModelRepository.findById("test1");

        assertEquals("testModel", one.get().getName());
    }
}
