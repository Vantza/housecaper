package org.vantza.housecaper.rag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vantza.housecaper.rag.model.TestTable;

@Repository
public interface TestRepository extends JpaRepository<TestTable, Integer> {
}
