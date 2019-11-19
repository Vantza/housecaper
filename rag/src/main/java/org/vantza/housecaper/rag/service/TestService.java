package org.vantza.housecaper.rag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vantza.housecaper.rag.model.TestTable;
import org.vantza.housecaper.rag.repository.TestRepository;

import java.util.List;

@Service
public class TestService {

    @Autowired
    public TestRepository testRepository;

    public List<TestTable> test() {
        return testRepository.findAll();
    }
}
