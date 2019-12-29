package org.vantza.housecaper.rag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vantza.housecaper.rag.model.TestAutoCreateModel;

@Repository
public interface TestAutoCreateModelRepository extends JpaRepository<TestAutoCreateModel, String> {
}
